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
import com.sc.entity.CgStockDetailOrder;
import com.sc.entity.CgStockPurchaseOrder;
import com.sc.entity.CgStockReplenishmentGoods;
import com.sc.entity.KcGoodsInformation;
import com.sc.entity.Message;
import com.sc.service.CgStockDetailOrderService;
import com.sc.service.CgStockPurchaseOrderService;
import com.sc.service.CgStockReplGoodsService;
import com.sc.service.KcGoodsInformationService;

@Controller

//采购详情单控制器
@RequestMapping("/cgdetailorder")
public class CgStockDetailOrderController {
	
	@Autowired
	CgStockPurchaseOrderService cgpurorder;//采购单service
	@Autowired
	CgStockDetailOrderService cgdetailorder;//采购详情表service
	@Autowired
	CgStockReplGoodsService cgrepgoods;//需采购单service
	@Autowired
	KcGoodsInformationService kcgoods;
	
	//查询订单详情表
	@MyLog("查询订单详情表")
	@RequestMapping("/selectcgdetail.do")
	public ModelAndView selectcgdetail(ModelAndView mav,
			@RequestParam(defaultValue="1") Integer pageNum,
			@RequestParam(defaultValue="10") Integer pageSize
			,CgStockDetailOrder detorder,
			CgStockPurchaseOrder purorder,BigDecimal purchaseOrderId){
		System.out.println("@@##$$查询订单详情表");
		//查询订单详情表
		PageInfo<CgStockDetailOrder> info = cgdetailorder.selectcgdetailorder(pageSize, pageNum, detorder);
		mav.addObject("detorder", detorder);
		mav.addObject("p", info);
		
		/*PageInfo<CgStockPurchaseOrder> pageInfo = cgpurorder.selectcgpurorderbyid(pageSize, pageNum, purchaseOrderId);
		mav.addObject("purchase", pageInfo);*/
		
		mav.setViewName("cg/cgdetailorder-list");
		return mav;
	}
	
	
	
	//进入添加详情采购单的页面
	@MyLog("进入添加详情采购单的页面")
	@RequestMapping("/goadddetail.do")
	public ModelAndView goadddetail(ModelAndView mav,CgStockDetailOrder detorder,
			KcGoodsInformation goods){
		System.out.println("@@进入添加详情采购单的页面%%");
		
		if(detorder.getPurchaseOrderDetailId()!=null){
			detorder=cgdetailorder.getcgdetailorder(detorder.getPurchaseOrderDetailId());
		}
		
		//从需采购表中查出商品信息
		List<CgStockReplenishmentGoods> list = cgrepgoods.selectall();
		mav.addObject("list", list);
		
		mav.addObject("detail", detorder);
		mav.setViewName("cg/goadddetorder-list");
		
		return mav;
	}
	
	//添加详情采购单
	@MyLog("添加详情采购单")
	@RequestMapping("/adddetail.do")
	@ResponseBody
	public Message adddetail(CgStockDetailOrder detorder,ModelAndView mav){
		
		System.out.println("@@#添加详情采购单#$$");
		
		if(detorder.getPurchaseOrderDetailId()!=null){
			cgdetailorder.updatecgdetailorder(detorder);
		}else{
			cgdetailorder.addcgdetailorder(detorder);
		}
		mav.setViewName("redirect:cg/cgdetailorder-list");
		
		return new Message("1","success","成功");
	}
	
	
	@MyLog("删除详情采购单")
	@RequestMapping("/deletedetorder.do")
	@ResponseBody
	public Message deletedetorder(CgStockDetailOrder detorder){
		System.out.println("进入删除方法了");
		
		cgdetailorder.deletecgdetailorder(detorder.getPurchaseOrderDetailId());
		
		return new Message("1","success","成功");
		
	}
	
	@MyLog("批量删除详情采购单")
	@RequestMapping("/deletedetorderall.do")
	@ResponseBody
	public String deletedetorderall(BigDecimal[] ids){
		System.out.println("进入批量删除方法了");
		
		if(ids!=null&&ids.length>0){
			for (BigDecimal id : ids) {
				cgdetailorder.deletecgdetailorder(id);
			}
		}
		
		return "redirect:selectcgdetail.do";
		
	}
	
	//改变入库状态
	@MyLog("改变入库状态")
		@RequestMapping("/updatestorage.do")
		@ResponseBody
		public Message updatestorage(CgStockDetailOrder detorder,KcGoodsInformation goods){
			System.out.println("&&^改变入库状态^$$");
			
			if(detorder.getPurchaseOrderDetailId()!=null){
				CgStockDetailOrder det=cgdetailorder.getcgdetailorder(detorder.getPurchaseOrderDetailId());
				det.setIsnotInStorage(detorder.getIsnotInStorage());
				cgdetailorder.updatecgdetailorder(det);
				
			}
			
			return new Message("1","success","成功");
			
		}
		
		//入库
	@MyLog("入库")
		@RequestMapping("/updategoodsNum.do")
		@ResponseBody
		public Message updategoodsNum(CgStockDetailOrder detorder,KcGoodsInformation goods,
				@RequestParam(defaultValue="1") Integer pageNum,
				@RequestParam(defaultValue="10") Integer pageSize,
				BigDecimal goodsId){
			System.out.println("&&^添加购买数量进库存^$$");
			
			if(detorder.getPurchaseOrderDetailId()!=null){
				CgStockDetailOrder det=cgdetailorder.getcgdetailorder(detorder.getPurchaseOrderDetailId());
				KcGoodsInformation good=new KcGoodsInformation();
				good.setGoodsId(det.getGoodsId());
				KcGoodsInformation g=kcgoods.getgoods(goodsId);
				
				if(g.getGoodsId()!=null){
					BigDecimal num=null;
					BigDecimal c=new BigDecimal(det.getGoodsNum());
					num=c.add(g.getStockNumber());
					g.setStockNumber(num);
					kcgoods.updatekcgoods(g);	
					
										
				}
				
				
				
				
			}
			
			return new Message("1","success","成功");
			
		}

}