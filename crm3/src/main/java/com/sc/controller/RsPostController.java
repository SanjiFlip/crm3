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
//人事——职务信息表控制器


@Controller   //把该类注册成bean对象，并且作为控制器组件
@RequestMapping("/rspostctrl")  //给该类配置一个请求映射的url地址ַ
public class RsPostController {
	
	 @Autowired //依赖注入
	 RsPostMessageService rsPostMessageService;
	 
	 //分页查询
	 @RequestMapping("/selectrspost.do")  //给该类配置一个请求映射的url地址
	public ModelAndView selectRsPost(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum, 
			@RequestParam(defaultValue="10")Integer pageSize,
			RsPostMessage rspost){
		
		 
		 System.out.println("进入查询职务信息分页方法"+rspost);
		 System.out.println("输出最小日期"+rspost.getDatemin());
		 System.out.println("输出最大日期"+rspost.getDatemax());
		 
		 PageInfo<RsPostMessage> page = rsPostMessageService.selectRsPost(pageNum, pageSize, rspost);
		 mav.addObject("p", page);
		 mav.addObject("rspost", rspost);
		 mav.setViewName("rs/rspost-list");  // /WB-INF/rs/rscompnay-list.jsp
		 
		 
		 return mav;
	}
	
	 //跳转添加页面
	 @RequestMapping("/goaddrspost.do")  //给该类配置一个请求映射的url地址
		public ModelAndView goAddPost(ModelAndView mav, 	
				RsPostMessage rspost){
		 System.out.println("进入添加页面"+rspost);
		 //修改
		 if(rspost.getPostId()!=null){
			 rspost=rsPostMessageService.getRsPost(rspost.getPostId());
		 }
		 
		 
			 //跳转添加页面 
			 mav.setViewName("rs/rspost-add");  // /WB-INF/rs/rscompnay-add.jsp
			 
			 mav.addObject("rspost", rspost);
			 return mav;
		}
	 
	 //添加
	 @RequestMapping("/addrspost.do")  //给该类配置一个请求映射的url地址
	 @ResponseBody
	 public Message AddPost(ModelAndView mav, 	
			 RsPostMessage rspost){
		 System.out.println("进入添加职务"+rspost);
		 if(rspost.getPostId()!=null){//修改操作
			 rsPostMessageService.updateRsPost(rspost);
		 }else{//添加操作
			 rsPostMessageService.addRsPost(rspost);
		 }
			 //调用添加方法
		 //rsDepartmentService.addRsDepartment(rsdepartment);
			 return new Message("1", "success", "成功");
		}
	 
	 //删除
	 @RequestMapping("/deleterspost.do")  //给该类配置一个请求映射的url地址
	 @ResponseBody
	 public Message deletePost(ModelAndView mav, 	
			 RsPostMessage rspost){
		 System.out.println("进入删除职务"+rspost);
			 //调用添加方法
		 rsPostMessageService.deleteRsPost(rspost.getPostId());
			return new Message("1", "success", "成功");
		}
	 
	 
	 //分页查询
	 @RequestMapping("/showrspost.do")  //给该类配置一个请求映射的url地址
		public ModelAndView showPost(ModelAndView mav,
				 RsPostMessage rspost){
			
			 System.out.println("进入查询职务详情页面");		
			 rspost=rsPostMessageService.getRsPost(rspost.getPostId());
			 System.out.println("输出"+rspost);
			 mav.setViewName("rs/rspost-show");  // /WB-INF/rs/rscompnay-list.jsp
			 mav.addObject("rspost", rspost);
			 
			 return mav;
		}
	 
	 //批量删除
	 @RequestMapping("/deletepostall.do")  //给该类配置一个请求映射的url地址
	 @ResponseBody
	 public ModelAndView deletePostall(ModelAndView mav, 	
			 Long[] ids){
		 System.out.println("进入批量删除公司"+Arrays.toString(ids));
		 if(ids!=null&&ids.length>0){
			 for(Long id : ids) {//调用批量方法
				 rsPostMessageService.deleteRsPost(id);
				 System.out.println("id为"+id);
			 }
		 }
			 
			 
		 mav.setViewName("redirect:selectrspost.do");//路径：/WEB-INF/test.jsp
			return mav;
		} 
	 
	 
	 
	 
}
