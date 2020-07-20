package com.sc.controller;


import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.sc.annotation.MyLog;
import com.sc.entity.Message;
import com.sc.entity.RsCompnayMessage;
import com.sc.entity.RsDepartment;
import com.sc.entity.RsPostMessage;
import com.sc.service.RsCompnayMessageService;
import com.sc.service.RsDepartmentService;
import com.sc.service.RsPostMessageService;


@Controller 
@RequestMapping("/rspostctrl")
public class RsPostController {
	
	@Autowired 
	RsPostMessageService rsPostMessageService;
	 
	@Autowired
	RsDepartmentService rsDepartmentService;
	 
	@Autowired 
	RsCompnayMessageService rsCompnayMessageService;
	 
	@MyLog("分页查询职务信息")
	@RequestMapping("/selectrspost.do")
	public ModelAndView selectRsPost(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum, 
			@RequestParam(defaultValue="10")Integer pageSize,
			RsPostMessage rspost, RsDepartment department){
		 System.out.println("获取到的职务信息"+rspost);
		 PageInfo<RsPostMessage> page = rsPostMessageService.selectRsPost(pageNum, pageSize, rspost);
		 mav.addObject("p", page);
		 mav.addObject("rspost", rspost);
		 mav.setViewName("rs/rspost-list");
		 return mav;
	}
	@MyLog("跳转添加/修改职务信息")
	@RequestMapping("/goaddrspost.do")
	public ModelAndView goAddPost(ModelAndView mav, 	
			RsPostMessage rspost, RsDepartment department,
			RsCompnayMessage rsCompnay){
		 if(rspost.getPostId()!=null){
			 rspost=rsPostMessageService.getRsPost(rspost.getPostId());
		 }
		 List<RsDepartment> list =rsDepartmentService.selectDepartment();
		 
		 List<RsCompnayMessage> list1 =rsCompnayMessageService.selectRsCompnay();
		 mav.setViewName("rs/rspost-add");
		 System.out.println("输出的内容是"+list);
		 mav.addObject("list", list);
		 mav.addObject("list1", list1);
		 mav.addObject("rspost", rspost);
		 return mav;
	}
	@MyLog("修改/添加职务信息")
	@RequestMapping("/addrspost.do")
	@ResponseBody
	public Message AddPost(ModelAndView mav, 	
			RsPostMessage rspost, RsDepartment rsdepartment,
			RsCompnayMessage rsCompnay){
		if(rspost.getPostId()!=null){//修改操作
			System.out.println("接收的对象信息是:"+rspost);
			rsPostMessageService.updateRsPost(rspost);
		}else{//添加操作
			rsPostMessageService.addRsPost(rspost);
			mav.addObject("rspost", rspost);
		}
		 	 return new Message("1", "success", "成功");
	}//修改页面在哪
	 
	 @MyLog("删除职务信息")
	 @RequestMapping("/deleterspost.do")
	 @ResponseBody
	 public Message deletePost(ModelAndView mav, 	
			 RsPostMessage rspost){
		rsPostMessageService.deleteRsPost(rspost.getPostId());
		return new Message("1", "success", "成功");
	 }
	 
	@MyLog("查看职务详情信息")
	@RequestMapping("/showrspost.do")
	public ModelAndView showPost(ModelAndView mav,
			 RsPostMessage rspost){		
		 rspost=rsPostMessageService.getRsPost(rspost.getPostId());
		 mav.setViewName("rs/rspost-show");
		 mav.addObject("rspost", rspost); 
		 return mav;
	}
	 
	@MyLog("批量删除职务信息")
	@RequestMapping("/deletepostall.do")
	@ResponseBody
	public ModelAndView deletePostall(ModelAndView mav, 	
			Long[] ids){
		System.out.println("多个删除的ID是:"+Arrays.toString(ids));
		if(ids!=null&&ids.length>0){
			for(Long id : ids) {
				rsPostMessageService.deleteRsPost(id);
			}
		} 
	    mav.setViewName("redirect:selectrspost.do");
	    return mav;
	} 
}
