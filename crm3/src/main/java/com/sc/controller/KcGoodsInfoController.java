package com.sc.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.sc.annotation.MyLog;
import com.sc.entity.KcDepositoryInformation;
import com.sc.entity.KcGoodsInformation;
import com.sc.entity.Message;
import com.sc.service.KcDepositoryInformationService;
import com.sc.service.KcGoodsInformationService;

@Controller
@RequestMapping("/KcGoodsCtrl")
public class KcGoodsInfoController {
	
	@Autowired
	KcGoodsInformationService kcgoodsservice;
	@Autowired
	KcDepositoryInformationService kcdeptservice;
	
	@MyLog("��ѯ�����Ʒ��Ϣ")
	@RequestMapping("/selectgoods.do")
	public ModelAndView selectgoods(ModelAndView mav,
			@RequestParam(defaultValue="1") Integer pageNum,
			@RequestParam(defaultValue="10") Integer pageSize,
			KcGoodsInformation goods){
		System.out.println("��ѯ�����Ʒ��Ϣ"+goods);
		
		System.out.println("@@@@@@@@dd"+goods.getDatemax());
		
		System.out.println("@@@@@@@@xx"+goods.getDatemin());
		
		PageInfo<KcGoodsInformation> page = kcgoodsservice.selectgoods(pageNum, pageSize, goods);
		mav.addObject("p", page);
		mav.addObject("good", goods);
		mav.setViewName("kc/kcgoods-list");
		
		
		return mav;
	}
	
	@MyLog("ȥ��ӿ����Ʒ��Ϣ")
	@RequestMapping("/goaddgoods.do")
	public ModelAndView goaddgoods(ModelAndView mav,KcGoodsInformation goods,KcDepositoryInformation dept){
		System.out.println("�������ҳ��");
		List <KcDepositoryInformation> dept1 = kcdeptservice.selectAll();
		System.out.println("@@@@@@@@@@@@@@"+dept1);
		
		if(goods.getGoodsId()!=null){
			goods=kcgoodsservice.getgoods(goods.getGoodsId());
		}
		
		mav.addObject("dept", dept1);
		//�޸� ��ͨ��id�鵽����Ϣ��goods
		mav.addObject("goods", goods);
		mav.setViewName("kc/kcgoods-add");
		
		return mav;
	}
	
	@MyLog("��ӿ����Ʒ��Ϣ")
	@RequestMapping("/addgoods.do")
	@ResponseBody
	public Message addgoods(KcGoodsInformation goods){
		System.out.println("������ӷ�����");
		
		if(goods.getGoodsId()!=null){
			kcgoodsservice.updatekcgoods(goods);
		}else{
			kcgoodsservice.addkcgoods(goods);
		}
		
		return new Message("1","success","�ɹ�"); 
		
	}
	
	@MyLog("ɾ�������Ʒ��Ϣ")
	@RequestMapping("/deletegoods.do")
	@ResponseBody
	public Message deletegoods(KcGoodsInformation goods){
		System.out.println("����ɾ��������");
		
		kcgoodsservice.deletekcgoods(goods.getGoodsId());
		
		return new Message("1","success","�ɹ�");
		
	}
	
	@MyLog("����ɾ�������Ʒ��Ϣ")
	@RequestMapping("/deletegoodsall.do")
	public String deletegoodsall(BigDecimal[] ids){
		System.out.println("��������ɾ��������");
		
		if(ids!=null&&ids.length>0){
			for (BigDecimal id : ids) {
		kcgoodsservice.deletekcgoods(id);
			}

		}
		
		return "redirect:selectgoods.do";
		
	}
	
	
	

}