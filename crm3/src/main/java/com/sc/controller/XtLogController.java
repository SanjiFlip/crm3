package com.sc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.sc.annotation.MyLog;
import com.sc.entity.Message;
import com.sc.entity.XtLog;
import com.sc.service.XtLogService;

@Controller
@RequestMapping("/xtlogctrl")
public class XtLogController {
	
	@Autowired
	XtLogService xtLogService;
	
	@MyLog("查看系统日志")
	@RequestMapping("/selectxtlog.do")
	public ModelAndView selectXtLog(ModelAndView mav,
			@RequestParam(defaultValue="1") Integer pageNum,
			@RequestParam(defaultValue="10") Integer pageSize,
			XtLog xtLog) {
		PageInfo<XtLog> page = xtLogService.selectXtLog(pageNum, pageSize, xtLog);
		mav.addObject("p",page);
		mav.addObject("xtLog",xtLog);
		mav.setViewName("xt/xtlog_list"); 
		return mav;
	}
	
	@MyLog("删除系统日志")
	@RequestMapping("/deletextlog.do")
	@ResponseBody
	public Message deleteXtlog(Long logId) {
		xtLogService.deleteXtLog(logId);
		return new Message("1", "success", "成功");
	}
	
	@MyLog("删除更多系统日志")
	@RequestMapping("/deletemore.do")
	public ModelAndView deletemore(ModelAndView mav,Long[] ids) {
		if (ids!=null&&ids.length>0) {
			for (Long id : ids) {
				xtLogService.deleteXtLog(id);
			}
		}
		mav.setViewName("redirect:selectxtlog.do");
		return mav;
		
	}
}
