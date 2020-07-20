package com.sc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.sc.entity.BgTaskDedail;
import com.sc.entity.BgTaskDedailTwo;
import com.sc.entity.XtUserAccount;
import com.sc.service.BgTaskDedailService;

@Controller
@RequestMapping("/bgtaskdedailctrl")
public class BgTaskDedailController {

	@Autowired
	BgTaskDedailService bgTaskDedailService;
	
	@RequestMapping("/selectdedail.do")
	public ModelAndView selectdedail(ModelAndView mav,
			@RequestParam(defaultValue="1") Integer pageNum,
			@RequestParam(defaultValue="10") Integer pageSize,
			BgTaskDedail dedail){
		System.out.println("进入任务详情分页查询");
		PageInfo<BgTaskDedail> page=bgTaskDedailService.selectDedail(pageNum, pageSize, dedail);
		mav.addObject("p",page);
		mav.addObject("d",dedail);
		mav.setViewName("bg/bgdedail-list");
		return mav;
	}
	
	@RequestMapping("/updateWhetherFinsh.do")
	public String updateBywhetherFinsh(ModelAndView mav,BgTaskDedail dedail){
		if(dedail.getWhetherFinish().equals("未完成")){
			dedail.setWhetherFinish("已完成");
		}else if(dedail.getWhetherFinish().equals("已完成")){
			dedail.setWhetherFinish("未完成");
		}
		bgTaskDedailService.updateBywhetherFinish(dedail);
		
		return "redirect:/bgtaskdedailctrl/selectdedail.do";
	}
	
/*	@RequestMapping("/updateByState.do")
	public String updateByState(ModelAndView mav,BgTaskDedail dedail){
		if(dedail.getState().equals("未接收")){
			dedail.setState("接收");
		}else if(dedail.getState().equals("接收")){
			dedail.setState("未接收");
		}
		bgTaskDedailService.updateByState(dedail);
		
		return "redirect:/bgtaskdedailctrl/selectdedail.do";
	}*/
	
	@RequestMapping("/selectTaskDedailById.do")
	public ModelAndView selectTaskDedailById(ModelAndView mav,BgTaskDedailTwo dedail,
			@RequestParam(defaultValue="1") Integer pageNum,
			@RequestParam(defaultValue="10") Integer pageSize,
			HttpServletRequest request){
		XtUserAccount user =  (XtUserAccount) request.getSession().getAttribute("nowuser");
		
		PageInfo<BgTaskDedailTwo> page=bgTaskDedailService.selectTaskDedailById(pageNum, pageSize, user.getUserId());
		mav.addObject("p",page);
		mav.addObject("d",dedail);
		mav.setViewName("bg/bgdedail-list2");
		return mav;
	}
}
