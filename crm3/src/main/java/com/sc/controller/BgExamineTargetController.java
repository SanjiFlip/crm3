package com.sc.controller;

import java.math.BigDecimal;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.sc.annotation.MyLog;
import com.sc.entity.BgExamineTarget;
import com.sc.entity.Message;
import com.sc.service.BgExamineTargetService;

@Controller
@RequestMapping("/bgexaminetargetctrl")
public class BgExamineTargetController {

	@Autowired
	BgExamineTargetService bgExamineTargetService;
	
	@MyLog("��ҳ��ѯ����ָ��")
	@RequestMapping("/selecttarget.do")
	public ModelAndView selectTarget(ModelAndView mav, 
			@RequestParam(defaultValue="1") Integer pageNum,
			@RequestParam(defaultValue="10") Integer pageSize,
			BgExamineTarget target){
		System.out.println("�����ѯ����ָ���ҳ������");
		PageInfo<BgExamineTarget> page = bgExamineTargetService.selectTarget(pageNum, pageSize, target);
		
		
		mav.addObject("p",page);
		mav.addObject("t",target);
		mav.setViewName("bg/bgtarget-list");
		return mav;
	}
	
	@MyLog("������ӽ��������޸Ľ���")
	@RequestMapping("/goaddtarget.do")
	public ModelAndView goAddTarget(ModelAndView mav,BgExamineTarget target){
			
		System.out.println("�������ҳ�棺"+target);
		//�޸�
		if(target.getTargetId()!=null){
			target=bgExamineTargetService.getTarget(target.getTargetId());
		}
		mav.setViewName("bg/bgtarget-add");
		mav.addObject("target",target);
		return mav;
    }
	
	@MyLog("��ӿ���ָ����޸Ŀ���ָ��")
	@RequestMapping("/addtarget.do")
	@ResponseBody
	public void addTarget(ModelAndView mav,BgExamineTarget target){
		System.out.println("task="+target);
		if(target.getTargetId()!=null){//�޸�
			System.out.println("�����޸Ĳ���");
			bgExamineTargetService.updateTarget(target);
		}else{//���
			bgExamineTargetService.addTarget(target);
		}
    }
	
	@MyLog("ɾ������ָ��")
	@RequestMapping("/deletetarget.do")
	@ResponseBody
	public Message deleteTarget(ModelAndView mav,BgExamineTarget target){
			
		System.out.println("����ɾ������ָ��:"+target);
		bgExamineTargetService.deleteTarget(target.getTargetId());
		
		return new Message("1", "success", "�ɹ�");
    }
	
	@MyLog("����ɾ������ָ��")
	@RequestMapping("/deletetargetall.do")
	public String deleteTargetAll(ModelAndView mav,Long[] ids){
			
		System.out.println("��������ɾ��:"+Arrays.toString(ids));
		if(ids!=null&&ids.length>0){
			for (Long id : ids) {
				bgExamineTargetService.deleteTarget(id);
			}
		}
		return "redirect:selecttarget.do";
    }
	
	

}
