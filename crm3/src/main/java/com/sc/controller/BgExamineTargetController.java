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
	
	@MyLog("分页查询考核指标")
	@RequestMapping("/selecttarget.do")
	public ModelAndView selectTarget(ModelAndView mav, 
			@RequestParam(defaultValue="1") Integer pageNum,
			@RequestParam(defaultValue="10") Integer pageSize,
			BgExamineTarget target){
		System.out.println("进入查询任务指标分页方法了");
		PageInfo<BgExamineTarget> page = bgExamineTargetService.selectTarget(pageNum, pageSize, target);
		
		
		mav.addObject("p",page);
		mav.addObject("t",target);
		mav.setViewName("bg/bgtarget-list");
		return mav;
	}
	
	@MyLog("进入添加界面或进入修改界面")
	@RequestMapping("/goaddtarget.do")
	public ModelAndView goAddTarget(ModelAndView mav,BgExamineTarget target){
			
		System.out.println("进入添加页面："+target);
		//修改
		if(target.getTargetId()!=null){
			target=bgExamineTargetService.getTarget(target.getTargetId());
		}
		mav.setViewName("bg/bgtarget-add");
		mav.addObject("target",target);
		return mav;
    }
	
	@MyLog("添加考核指标或修改考核指标")
	@RequestMapping("/addtarget.do")
	@ResponseBody
	public void addTarget(ModelAndView mav,BgExamineTarget target){
		System.out.println("task="+target);
		if(target.getTargetId()!=null){//修改
			System.out.println("进入修改测试");
			bgExamineTargetService.updateTarget(target);
		}else{//添加
			bgExamineTargetService.addTarget(target);
		}
    }
	
	@MyLog("删除考核指标")
	@RequestMapping("/deletetarget.do")
	@ResponseBody
	public Message deleteTarget(ModelAndView mav,BgExamineTarget target){
			
		System.out.println("进入删除考核指标:"+target);
		bgExamineTargetService.deleteTarget(target.getTargetId());
		
		return new Message("1", "success", "成功");
    }
	
	@MyLog("批量删除考核指标")
	@RequestMapping("/deletetargetall.do")
	public String deleteTargetAll(ModelAndView mav,Long[] ids){
			
		System.out.println("进入批量删除:"+Arrays.toString(ids));
		if(ids!=null&&ids.length>0){
			for (Long id : ids) {
				bgExamineTargetService.deleteTarget(id);
			}
		}
		return "redirect:selecttarget.do";
    }
	
	

}
