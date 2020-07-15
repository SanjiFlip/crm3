package com.sc.controller;


import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.sc.entity.Message;
import com.sc.entity.RsPostMessage;
import com.sc.service.RsPostMessageService;


@Controller 
@RequestMapping("/rspostctrl")
public class RsPostController {
	
	 @Autowired 
	 RsPostMessageService rsPostMessageService;
	 

	@RequestMapping("/selectrspost.do")
	public ModelAndView selectRsPost(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum, 
			@RequestParam(defaultValue="10")Integer pageSize,
			RsPostMessage rspost){
		 PageInfo<RsPostMessage> page = rsPostMessageService.selectRsPost(pageNum, pageSize, rspost);
		 mav.addObject("p", page);
		 mav.addObject("rspost", rspost);
		 mav.setViewName("rs/rspost-list");
		 return mav;
	}
	
	@RequestMapping("/goaddrspost.do")
	public ModelAndView goAddPost(ModelAndView mav, 	
			RsPostMessage rspost){
		 if(rspost.getPostId()!=null){
			 rspost=rsPostMessageService.getRsPost(rspost.getPostId());
		 }
		 mav.setViewName("rs/rspost-add");
		 mav.addObject("rspost", rspost);
		 return mav;
	}
	 

	 @RequestMapping("/addrspost.do")
	 @ResponseBody
	 public Message AddPost(ModelAndView mav, 	
			 RsPostMessage rspost){
		 System.out.println("接收的对象信息是:"+rspost);
		 if(rspost.getPostId()!=null){//修改操作
			 rsPostMessageService.updateRsPost(rspost);
		 }else{//添加操作
			 rsPostMessageService.addRsPost(rspost);
		 }
		return new Message("1", "success", "成功");
	}
	 
	 @RequestMapping("/deleterspost.do")
	 @ResponseBody
	 public Message deletePost(ModelAndView mav, 	
			 RsPostMessage rspost){
		rsPostMessageService.deleteRsPost(rspost.getPostId());
		return new Message("1", "success", "成功");
	 }
	 
	 
	@RequestMapping("/showrspost.do")
	public ModelAndView showPost(ModelAndView mav,
			 RsPostMessage rspost){		
		 rspost=rsPostMessageService.getRsPost(rspost.getPostId());
		 mav.setViewName("rs/rspost-show");
		 mav.addObject("rspost", rspost); 
		 return mav;
	}
	 

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
