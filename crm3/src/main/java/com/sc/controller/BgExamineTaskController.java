package com.sc.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.sc.annotation.MyLog;
import com.sc.entity.BgExamineTask;
import com.sc.entity.BgTaskDedail;
import com.sc.entity.BgExamineTask;
import com.sc.entity.Message;
import com.sc.service.BgExamineTaskService;
import com.sc.service.BgTaskDedailService;

@Controller
@RequestMapping("/bgexaminetaskctrl")
public class BgExamineTaskController {

	@Autowired
	BgExamineTaskService bgExamineTaskService;
	@Autowired
	BgTaskDedailService bgTaskDedailService;
	
	@MyLog("��ҳ��ѯ��������")
	@RequestMapping("/selecttask.do")
	public ModelAndView selectTask(ModelAndView mav,
			@RequestParam(defaultValue="1") Integer pageNum,
			@RequestParam(defaultValue="8") Integer pageSize,
			BgExamineTask task){
		
		System.out.println("�����ѯ�����ҳ������");
		PageInfo<BgExamineTask> page=bgExamineTaskService.selectTask(pageNum, pageSize, task);
		
		
		mav.addObject("p",page);
		mav.addObject("t1",task);
		mav.setViewName("bg/bgtask-list");
		return mav;
	}
	
	
	@MyLog("������ӻ�����޸Ŀ�������")
	@RequestMapping("/goaddtask.do")
	public ModelAndView goAddTask(ModelAndView mav,BgExamineTask task){	
		System.out.println("�������ҳ�棺"+task);
		if(task.getTaskId()!=null){
			task=bgExamineTaskService.getTask(task.getTaskId());

		}
		mav.setViewName("bg/bgtask-add");
		mav.addObject("task",task);
		return mav;
    }
	
	@MyLog("��ӿ���������޸Ŀ�������")
	@RequestMapping("/addtask.do")
	@ResponseBody
	public void addTask(ModelAndView mav,BgExamineTask task,BgTaskDedail dedail){
		System.out.println("������ӷ���"+task);
		if(task.getTaskId()!=null){//�޸�
			bgExamineTaskService.updateTask(task);
		}else{//���
			 bgExamineTaskService.addTask(task);
			 dedail.setAcceptUserId(dedail.getAcceptUserId());
			 dedail.setWhetherFinish("δ���");
			 dedail.setState("��Ч");
			dedail.setTaskId(task.getTaskId());
			dedail.setCompanyId(task.getCompanyId());
			bgTaskDedailService.addDedail(dedail);
		}
		
    }

	
	@MyLog("ɾ����������")
	@RequestMapping("/deletetask.do")
	@ResponseBody
	public Message deleteTask(ModelAndView mav,BgExamineTask task){
			
		System.out.println("����ɾ������ָ��:"+task);
		bgExamineTaskService.deleteTask(task.getTaskId());
		bgTaskDedailService.deleteByTaskId(task.getTaskId());
		return new Message("1", "success", "�ɹ�");
    }
	
	@MyLog("����ɾ����������")
	@RequestMapping("/deletetaskall.do")
	public String deleteTaskAll(ModelAndView mav,Long[] ids){
			
		System.out.println("��������ɾ��:"+Arrays.toString(ids));
		if(ids!=null&&ids.length>0){
			for (Long id : ids) {
				bgExamineTaskService.deleteTask(id);
				bgTaskDedailService.deleteByTaskId(id);
			}
		}
		return "redirect:selecttask.do";
    }
	
}
