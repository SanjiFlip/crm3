package com.sc.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.sc.annotation.MyLog;
import com.sc.entity.CgStockSupplierInformation;
import com.sc.entity.KcDepositoryInformation;
import com.sc.entity.Message;
import com.sc.service.CgStockSupplierInfoService;

@Controller

@RequestMapping("/cgsupplier")//��Ӧ�̿�����
public class CgSupplierInfoController {

	@Autowired
	CgStockSupplierInfoService cgsupplier;//��Ӧ��service
	
	@MyLog("��ѯ��Ӧ����Ϣ")
	@RequestMapping("/selectsupp.do")
	public ModelAndView selectsupp(ModelAndView mav,
			@RequestParam(defaultValue="1") Integer pageNum,
			@RequestParam(defaultValue="10") Integer pageSize,
			CgStockSupplierInformation cgsup){
		
		System.out.println("&&^�����ѯ��Ӧ����Ϣ������^$$");
		
		//���ò�ѯ������ѯ���ݿ⹩Ӧ����Ϣ
		PageInfo<CgStockSupplierInformation> info = cgsupplier.selectcgsup(pageNum, pageSize, cgsup);
		
		mav.addObject("supplier", info);
		
		mav.addObject("sup", cgsup);
		mav.setViewName("cg/cgsupplier-list");
		
		return mav;
	}
	
	//�����Ϣҳ��
	@MyLog("��ӹ�Ӧ����Ϣҳ��")
	@RequestMapping("/goaddsupplier.do")
	public ModelAndView goaddspuulier(ModelAndView mav,
			@RequestParam(defaultValue="1") Integer pageNum,
			@RequestParam(defaultValue="10") Integer pageSize,
			 CgStockSupplierInformation cgsup){
		
		System.out.println("&&^������ӹ�Ӧ����Ϣҳ�������^$$");
		
		if(cgsup.getSupplierId()!=null){
		cgsup=cgsupplier.getcgsup(cgsup.getSupplierId());
		}
		mav.addObject("sup", cgsup);
		mav.setViewName("cg/gosupplier-add");
		
		return mav;
	}
	
	//��ӹ�Ӧ����Ϣ
	@MyLog("��ӹ�Ӧ����Ϣ")
	@RequestMapping("/addsupplier.do")
	@ResponseBody
	public Message addsupplier(ModelAndView mav,CgStockSupplierInformation cgsup){
		System.out.println("########################");
		System.out.println("@@@@@@@@@@@@@@@@"+cgsup);
		
		if(cgsup.getSupplierId()!=null){
			cgsupplier.updatecgsup(cgsup);
			System.out.println("&&^�����޸Ĺ�Ӧ����Ϣ������^$$");
		}else{
			cgsupplier.addcgsup(cgsup);
		}
			
		return new Message("1","success","�ɹ�");
	}
	
	@MyLog("ɾ����Ӧ����Ϣ")
	@RequestMapping("/deletesupplier.do")
	@ResponseBody
	public Message deletesupplier(ModelAndView mav,CgStockSupplierInformation cgsup){
		
		System.out.println("&&^����ɾ�Ĺ�Ӧ����Ϣ������^$$"+cgsup);
		cgsupplier.deletecgsup(cgsup.getSupplierId());
		
			
		return new Message("1","success","�ɹ�");
	}
	
	//����ɾ��
	@MyLog("����ɾ����Ӧ����Ϣ")
	@RequestMapping("/deletesupplierall.do")
	@ResponseBody
	public String deleteall(Long[] ids){
		
		if(ids!=null&&ids.length>0){
			for (Long id : ids) {
				cgsupplier.deletecgsup(id);
			}
		}
		
		return "redirect:selectsupp.do";
		
	}
	
	
}