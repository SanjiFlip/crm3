package com.sc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.sc.annotation.MyLog;
import com.sc.entity.BgSms;
import com.sc.entity.BgSmsDetail;
import com.sc.entity.Message;
import com.sc.entity.XtUserAccount;
import com.sc.service.BgSmsDetailService;
import com.sc.service.BgSmsService;

@Controller
@RequestMapping("/bgsmsctrl")
public class BgSmsController {
	
	@Autowired
	BgSmsService bgSmsService;
	@Autowired
	BgSmsDetailService bgSmsDetailService;
	 
	@MyLog("��ҳ��ѯ���͵Ķ���Ϣ")
	@RequestMapping("/selectsms.do")
	public ModelAndView selectSms(ModelAndView mav, 
			@RequestParam(defaultValue="1") Integer pageNum,
			@RequestParam(defaultValue="5") Integer pageSize,
			BgSms sms,HttpServletRequest request){
		System.out.println("�����ѯ����Ϣ��ҳ������");
		
		XtUserAccount user =  (XtUserAccount) request.getSession().getAttribute("nowuser");
		sms.setSendPerson(user.getUserName());
//		PageInfo<BgSms> page = bgSmsService.selectSms(pageNum, pageSize, sms);
		PageInfo<BgSms> page = bgSmsService.selectSmsByName(pageNum, pageSize, user.getUserName());
		
		mav.addObject("p",page);
		mav.addObject("s",sms);
		mav.setViewName("bg/bgsms-list");
		return mav;
	}
	
	@MyLog("������ӽ��������޸Ľ���")
	@RequestMapping("/goaddsms.do")
	public ModelAndView goAddSms(ModelAndView mav,BgSms sms){
			
		System.out.println("�������ҳ�棺"+sms);
		
		if(sms.getBhId()!=null){
			sms=bgSmsService.getSms(sms.getBhId());
		}
		mav.setViewName("bg/bgsms-add");
		mav.addObject("sms",sms);
		return mav;
    }
	
	@MyLog("������Ϣ���޸���Ϣ")
	@RequestMapping("/addsms.do")
	@ResponseBody
	public void addSms(ModelAndView mav,BgSms sms,BgSmsDetail smsDetail,HttpServletRequest request){	
		if(sms.getBhId()!=null){
			System.out.println("�����޸ķ���");
			bgSmsService.updateSms(sms);
		}else{
			System.out.println("������ӷ���");
			bgSmsService.addSms(sms);
//			sms.getBhId();
			System.out.println(sms.getBhId()+"&&&&&&&&&&&&&&&&&&&&&&&&&&&&77");
			XtUserAccount user =  (XtUserAccount) request.getSession().getAttribute("nowuser");
			
			smsDetail.setMessageState("�ѽ���");
			smsDetail.setShortMessageId(sms.getBhId());
			smsDetail.setRecipientId(smsDetail.getRecipientId());
			bgSmsDetailService.addSmsdetail(smsDetail);
		}
    }
	
	@MyLog("ɾ����Ϣ")
	@RequestMapping("/deletesms.do")
	@ResponseBody
	public Message deleteSms(ModelAndView mav,BgSms sms){
		bgSmsService.deleteSms(sms.getBhId());
		return new Message("1", "success", "�ɹ�");
	}
}
