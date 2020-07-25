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
import com.sc.entity.BgExamineTask;
import com.sc.entity.BgSmsDetail;
import com.sc.entity.BgSmsDetailTwo;
import com.sc.entity.Message;
import com.sc.entity.XtUserAccount;
import com.sc.service.BgSmsDetailService;

@Controller
@RequestMapping("/bgsmsdetailctrl")
public class BgSmsDetailController {

	@Autowired
	BgSmsDetailService bgSmsDetailService;
	
	@MyLog("��ҳ��ѯ���յ���Ϣ")
	@RequestMapping("/selectsmsdetail.do")
	public ModelAndView selectSmsdetail(ModelAndView mav, 
			@RequestParam(defaultValue="1") Integer pageNum,
			@RequestParam(defaultValue="10") Integer pageSize,
			BgSmsDetailTwo smsdetail,HttpServletRequest request){
		System.out.println("�����ѯ����ָ���ҳ������");
//		PageInfo<BgSmsDetail> page = bgSmsDetailService.selectSmsdetail(pageNum, pageSize, smsdetail);
		XtUserAccount user =  (XtUserAccount) request.getSession().getAttribute("nowuser");
		System.out.println("userId="+user.getUserId());
		PageInfo<BgSmsDetailTwo> page = bgSmsDetailService.selectSmsDetailByName(pageNum, pageSize, user.getUserId());
		for(BgSmsDetailTwo info :page.getList()){
			System.out.println(info);
		}
		mav.addObject("p",page);
		mav.addObject("s",smsdetail);
		mav.setViewName("bg/bgsmsdetail-list");
		return mav;
	}
	
	@MyLog("ɾ�����յ���Ϣ")
	@RequestMapping("/deletesmsdetail.do")
	@ResponseBody
	public Message deleteTask(ModelAndView mav,BgSmsDetailTwo smsdetail){
			
		System.out.println("����ɾ����Ϣ����:"+smsdetail);
		bgSmsDetailService.deleteSmsdetail(smsdetail.getDetailId());
		 bgSmsDetailService.deleteSmsdetail(smsdetail.getDetailId());
		return new Message("1", "success", "�ɹ�");
    }
}
