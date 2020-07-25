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
	
	@MyLog("查询采购单信息")
	@RequestMapping("/selectpur.do") 
	public ModelAndView selectpur(ModelAndView mav,
			   @RequestParam(defaultValue="1") Integer pageNum,
			   @RequestParam(defaultValue="10") Integer pageSize,
			   CgStockPurchaseOrder purorder){
		System.out.println("查询采购单信息");
		
		PageInfo<CgStockPurchaseOrder> pageInfo = cgpurorder.selectcgpurorder(pageSize, pageNum, purorder);
		
		mav.addObject("purorder", purorder);
		
		mav.addObject("p", pageInfo);
		
		mav.setViewName("cg/cgpurorder-list");
		
		
		
		return mav;
	}
	
	//进入添加采购信息页面
	@MyLog("进入添加采购信息页面")
	@RequestMapping("/goaddpur.do")
	public ModelAndView goaddpur(ModelAndView mav,
			 CgStockPurchaseOrder purorder
			,CgStockReplenishmentGoods repgoods){
		
		System.out.println("进入添加采购信息页面");
		
		if(purorder.getPurchaseOrderId()!=null){
			purorder=cgpurorder.getcgpurorder(purorder.getPurchaseOrderId());
		}
		
		mav.addObject("purchase", purorder);
		
		mav.setViewName("cg/cgpurchase-add");
		
		
		return mav;
	}
	
	//添加采购信息
	@MyLog("添加采购信息")
		@RequestMapping("/addpurchase.do")
		@ResponseBody
		public Message addpurchase(CgStockPurchaseOrder purorder,ModelAndView mav){
			
			System.out.println("@@#添加采购信息#$$");
			
			if(purorder.getPurchaseOrderId()!=null){
				//修改
				cgpurorder.updatecgpurorder(purorder);
			}else{
				//添加
				cgpurorder.addcgpurorder(purorder);
			}
			mav.setViewName("redirect:cg/cgdetailorder-list.jsp");
			
			return new Message("1","success","成功");
		}
	
	
		//通过订单编号查看详情单
	@MyLog("查询对应得订单详情表")
	@RequestMapping("/goselectdetail.do")
	public ModelAndView goselectdetail(ModelAndView mav
			,CgStockPurchaseOrder purorder,
			 CgStockDetailOrder details,
			@RequestParam(defaultValue="1") Integer pageNum,
			   @RequestParam(defaultValue="10") Integer pageSize,
			   HttpSession session,BigDecimal purchaseOrderId){
		System.out.println("@@##$$查询对应得订单详情表"+purorder);
		
		session.setAttribute("purorderid", purorder.getPurchaseOrderId());
		
		CgStockDetailOrder detail=new CgStockDetailOrder();
		detail.setPurchaseOrderId(purorder.getPurchaseOrderId());
		PageInfo<CgStockDetailOrder> info = cgdetail.selectcgdetailorderbyid(pageSize, pageNum, purchaseOrderId);
		mav.addObject("p", info);
		
		mav.addObject("det", details);
		
		mav.setViewName("cg/cgdetailorder-list");
		return mav;
	}
	
	@MyLog("删除订单信息")
	@RequestMapping("/deletepurchase.do")
	@ResponseBody
	public Message deletesupplier(ModelAndView mav,CgStockPurchaseOrder purorder){
		
		System.out.println("&&^进入删除订单信息控制器^$$"+purorder);
		cgpurorder.deletecgpurorder(purorder.getPurchaseOrderId());
		
			
		return new Message("1","success","成功");
	}
	
	//批量删除
	@MyLog("批量删除订单信息")
	@RequestMapping("/deletepurchaseall.do")
	@ResponseBody
	public String deleteall(BigDecimal[] ids){
		System.out.println("&&^进入批量删改订单信息控制器^$$");
		
		if(ids!=null&&ids.length>0){
			for (BigDecimal id : ids) {
				cgpurorder.deletecgpurorder(id);
			}
		}
		
		return "redirect:selectpur.do";
		
	}
	
	//改变支付状态
	@MyLog("改变支付状态")
	@RequestMapping("/updatepaystate.do")
	@ResponseBody
	public Message updatepaystate(CgStockPurchaseOrder purorder){
		System.out.println("&&^改变支付状态^$$");
		
		if(purorder.getPurchaseOrderId()!=null){
			CgStockPurchaseOrder pur=cgpurorder.getcgpurorder(purorder.getPurchaseOrderId());
			pur.setPaymentStatus(purorder.getPaymentStatus());
			cgpurorder.updatecgpurorder(pur);
		}
		return new Message("1","success","成功");
		
	}
	
	
}