package com.sc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.sc.annotation.MyLog;
import com.sc.entity.BgTaskDedail;
import com.sc.entity.BgTaskDedailTwo;
import com.sc.entity.XtUserAccount;
import com.sc.service.BgTaskDedailService;

@Controller
@RequestMapping("/bgtaskdedailctrl")
public class BgTaskDedailController {

	@Autowired
	BgTaskDedailService bgTaskDedailService;
	
	@MyLog("分页查询任务详情")
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
	
	@MyLog("分页查询接收任务详情")
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
