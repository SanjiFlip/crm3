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
import com.sc.entity.Message;
import com.sc.entity.XsCustomerContact;
import com.sc.service.XsCustomerContactService;


@Controller
@RequestMapping("/contactctrl")
public class XsContactController {

	//要依赖service 注入进来
	@Autowired
	XsCustomerContactService xsContactService;
	
	/** 
	 *@function  查询方法
	*/
	@MyLog("查询客户联系人")
	@RequestMapping("/selectcontact.do")
	public ModelAndView selectcontact(ModelAndView mav,
			@RequestParam(defaultValue="1") Integer pageNum, //设置默认值 如果没传就是默认值
			@RequestParam(defaultValue="10")Integer pageSize,
			XsCustomerContact contact){
		System.out.println("进入查询客户联系人分页方法了"+contact);
		System.out.println("----"+contact.getDatemin());
		System.out.println("----"+contact.getDatemax());
		
		PageInfo<XsCustomerContact> page = xsContactService.selectcontact(pageNum, pageSize, contact);
		System.out.println();
		mav.addObject("p", page);
		if(contact.getContactId()!=null){//id不为空 进入查看详情页面 
			contact=xsContactService.getcontact(contact.getContactId());		
			mav.setViewName("xs/contact-detail");
		}else{
			mav.setViewName("xs/contact-list");
		}	
		mav.addObject("contact",contact);	
		return mav;
	}
	
	/** 
	 *@function  跳转添加界面/修改界面
	*/
	@MyLog(" 跳转添加界面/修改界面")
	@RequestMapping("/goaddcontact.do")
	public ModelAndView goAddContact(ModelAndView mav,XsCustomerContact contact){
		System.out.println("进入添加页面"+contact);
		
		if(contact.getContactId()!=null){
			contact=xsContactService.getcontact(contact.getContactId());
		}
		
		mav.setViewName("xs/contact-add");
		mav.addObject("contact",contact);
		return mav;
	}
	
	/** 
	 *@function  添加/修改方法
	*/
	@MyLog("添加客户联系人/修改客户联系人")
	@RequestMapping("/addcontact.do")
	@ResponseBody
	public Message addContact(ModelAndView mav,XsCustomerContact contact){
		System.out.println("进入添加客户联系人:"+contact);
		if(contact.getContactId()!=null){//如果id不为空就是修改
			xsContactService.updatecontact(contact);
		}else{
			xsContactService.addcontact(contact);//否则就是添加  //添加修改共用一个页面
		}
		
		return new Message("1", "success", "成功");
	}
	
	/** 
	 *@function  删除方法
	*/
	@MyLog(" 删除客户联系人")
	@RequestMapping("/deletecontact.do")
	@ResponseBody
	public Message deleteContact(ModelAndView mav,XsCustomerContact contact){
		System.out.println("进入删除客户联系人:"+contact);
		xsContactService.deletecontact(contact.getContactId());	
	   return new Message("1", "success", "成功");
	}
	
	/** 
	 *@function  批量删除方法
	*/
	@MyLog(" 批量删除客户联系人")
	@RequestMapping("/deletecontactall.do")
	public String deleteContactAll(ModelAndView mav,long[] ids){
		System.out.println("进入批量删除客户联系人:"+Arrays.toString(ids));
		if(ids!=null&&ids.length>0){
			for (long id : ids) {
				xsContactService.deletecontact(id);
			}
		}		
		return "redirect:selectcontact.do";
	}
}
