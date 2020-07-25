package com.sc.controller;

import java.math.BigDecimal;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.sc.annotation.MyLog;
import com.sc.entity.CgStockDetailOrder;
import com.sc.entity.CgStockPurchaseOrder;
import com.sc.entity.CgStockReplenishmentGoods;
import com.sc.entity.CgStockSupplierInformation;
import com.sc.entity.Message;
import com.sc.service.CgStockDetailOrderService;
import com.sc.service.CgStockPurchaseOrderService;
import com.sc.service.CgStockReplGoodsService;

@Controller
@RequestMapping("/cgpurctrl")
public class CgStockPurOrderController {

	@Autowired
	CgStockPurchaseOrderService cgpurorder;
	@Autowired
	CgStockDetailOrderService cgdetail;
	
	@MyLog("��ѯ�ɹ�����Ϣ")
	@RequestMapping("/selectpur.do") 
	public ModelAndView selectpur(ModelAndView mav,
			   @RequestParam(defaultValue="1") Integer pageNum,
			   @RequestParam(defaultValue="10") Integer pageSize,
			   CgStockPurchaseOrder purorder){
		System.out.println("��ѯ�ɹ�����Ϣ");
		
		PageInfo<CgStockPurchaseOrder> pageInfo = cgpurorder.selectcgpurorder(pageSize, pageNum, purorder);
		
		mav.addObject("purorder", purorder);
		
		mav.addObject("p", pageInfo);
		
		mav.setViewName("cg/cgpurorder-list");
		
		
		
		return mav;
	}
	
	//������Ӳɹ���Ϣҳ��
	@MyLog("������Ӳɹ���Ϣҳ��")
	@RequestMapping("/goaddpur.do")
	public ModelAndView goaddpur(ModelAndView mav,
			 CgStockPurchaseOrder purorder
			,CgStockReplenishmentGoods repgoods){
		
		System.out.println("������Ӳɹ���Ϣҳ��");
		
		if(purorder.getPurchaseOrderId()!=null){
			purorder=cgpurorder.getcgpurorder(purorder.getPurchaseOrderId());
		}
		
		mav.addObject("purchase", purorder);
		
		mav.setViewName("cg/cgpurchase-add");
		
		
		return mav;
	}
	
	//��Ӳɹ���Ϣ
	@MyLog("��Ӳɹ���Ϣ")
		@RequestMapping("/addpurchase.do")
		@ResponseBody
		public Message addpurchase(CgStockPurchaseOrder purorder,ModelAndView mav){
			
			System.out.println("@@#��Ӳɹ���Ϣ#$$");
			
			if(purorder.getPurchaseOrderId()!=null){
				//�޸�
				cgpurorder.updatecgpurorder(purorder);
			}else{
				//���
				cgpurorder.addcgpurorder(purorder);
			}
			mav.setViewName("redirect:cg/cgdetailorder-list.jsp");
			
			return new Message("1","success","�ɹ�");
		}
	
	
		//ͨ��������Ų鿴���鵥
	@MyLog("��ѯ��Ӧ�ö��������")
	@RequestMapping("/goselectdetail.do")
	public ModelAndView goselectdetail(ModelAndView mav
			,CgStockPurchaseOrder purorder,
			 CgStockDetailOrder details,
			@RequestParam(defaultValue="1") Integer pageNum,
			   @RequestParam(defaultValue="10") Integer pageSize,
			   HttpSession session,BigDecimal purchaseOrderId){
		System.out.println("@@##$$��ѯ��Ӧ�ö��������"+purorder);
		
		session.setAttribute("purorderid", purorder.getPurchaseOrderId());
		
		CgStockDetailOrder detail=new CgStockDetailOrder();
		detail.setPurchaseOrderId(purorder.getPurchaseOrderId());
		PageInfo<CgStockDetailOrder> info = cgdetail.selectcgdetailorderbyid(pageSize, pageNum, purchaseOrderId);
		mav.addObject("p", info);
		
		mav.addObject("det", details);
		
		mav.setViewName("cg/cgdetailorder-list");
		return mav;
	}
	
	@MyLog("ɾ��������Ϣ")
	@RequestMapping("/deletepurchase.do")
	@ResponseBody
	public Message deletesupplier(ModelAndView mav,CgStockPurchaseOrder purorder){
		
		System.out.println("&&^����ɾ��������Ϣ������^$$"+purorder);
		cgpurorder.deletecgpurorder(purorder.getPurchaseOrderId());
		
			
		return new Message("1","success","�ɹ�");
	}
	
	//����ɾ��
	@MyLog("����ɾ��������Ϣ")
	@RequestMapping("/deletepurchaseall.do")
	@ResponseBody
	public String deleteall(BigDecimal[] ids){
		System.out.println("&&^��������ɾ�Ķ�����Ϣ������^$$");
		
		if(ids!=null&&ids.length>0){
			for (BigDecimal id : ids) {
				cgpurorder.deletecgpurorder(id);
			}
		}
		
		return "redirect:selectpur.do";
		
	}
	
	//�ı�֧��״̬
	@MyLog("�ı�֧��״̬")
	@RequestMapping("/updatepaystate.do")
	@ResponseBody
	public Message updatepaystate(CgStockPurchaseOrder purorder){
		System.out.println("&&^�ı�֧��״̬^$$");
		
		if(purorder.getPurchaseOrderId()!=null){
			CgStockPurchaseOrder pur=cgpurorder.getcgpurorder(purorder.getPurchaseOrderId());
			pur.setPaymentStatus(purorder.getPaymentStatus());
			cgpurorder.updatecgpurorder(pur);
		}
		return new Message("1","success","�ɹ�");
		
	}
	
	
}