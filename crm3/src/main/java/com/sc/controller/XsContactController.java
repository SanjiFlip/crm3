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

	//Ҫ����service ע�����
	@Autowired
	XsCustomerContactService xsContactService;
	
	/** 
	 *@function  ��ѯ����
	*/
	@MyLog("��ѯ�ͻ���ϵ��")
	@RequestMapping("/selectcontact.do")
	public ModelAndView selectcontact(ModelAndView mav,
			@RequestParam(defaultValue="1") Integer pageNum, //����Ĭ��ֵ ���û������Ĭ��ֵ
			@RequestParam(defaultValue="10")Integer pageSize,
			XsCustomerContact contact){
		System.out.println("�����ѯ�ͻ���ϵ�˷�ҳ������"+contact);
		System.out.println("----"+contact.getDatemin());
		System.out.println("----"+contact.getDatemax());
		
		PageInfo<XsCustomerContact> page = xsContactService.selectcontact(pageNum, pageSize, contact);
		System.out.println();
		mav.addObject("p", page);
		if(contact.getContactId()!=null){//id��Ϊ�� ����鿴����ҳ�� 
			contact=xsContactService.getcontact(contact.getContactId());		
			mav.setViewName("xs/contact-detail");
		}else{
			mav.setViewName("xs/contact-list");
		}	
		mav.addObject("contact",contact);	
		return mav;
	}
	
	/** 
	 *@function  ��ת��ӽ���/�޸Ľ���
	*/
	@MyLog(" ��ת��ӽ���/�޸Ľ���")
	@RequestMapping("/goaddcontact.do")
	public ModelAndView goAddContact(ModelAndView mav,XsCustomerContact contact){
		System.out.println("�������ҳ��"+contact);
		
		if(contact.getContactId()!=null){
			contact=xsContactService.getcontact(contact.getContactId());
		}
		
		mav.setViewName("xs/contact-add");
		mav.addObject("contact",contact);
		return mav;
	}
	
	/** 
	 *@function  ���/�޸ķ���
	*/
	@MyLog("��ӿͻ���ϵ��/�޸Ŀͻ���ϵ��")
	@RequestMapping("/addcontact.do")
	@ResponseBody
	public Message addContact(ModelAndView mav,XsCustomerContact contact){
		System.out.println("������ӿͻ���ϵ��:"+contact);
		if(contact.getContactId()!=null){//���id��Ϊ�վ����޸�
			xsContactService.updatecontact(contact);
		}else{
			xsContactService.addcontact(contact);//����������  //����޸Ĺ���һ��ҳ��
		}
		
		return new Message("1", "success", "�ɹ�");
	}
	
	/** 
	 *@function  ɾ������
	*/
	@MyLog(" ɾ���ͻ���ϵ��")
	@RequestMapping("/deletecontact.do")
	@ResponseBody
	public Message deleteContact(ModelAndView mav,XsCustomerContact contact){
		System.out.println("����ɾ���ͻ���ϵ��:"+contact);
		xsContactService.deletecontact(contact.getContactId());	
	   return new Message("1", "success", "�ɹ�");
	}
	
	/** 
	 *@function  ����ɾ������
	*/
	@MyLog(" ����ɾ���ͻ���ϵ��")
	@RequestMapping("/deletecontactall.do")
	public String deleteContactAll(ModelAndView mav,long[] ids){
		System.out.println("��������ɾ���ͻ���ϵ��:"+Arrays.toString(ids));
		if(ids!=null&&ids.length>0){
			for (long id : ids) {
				xsContactService.deletecontact(id);
			}
		}		
		return "redirect:selectcontact.do";
	}
}
