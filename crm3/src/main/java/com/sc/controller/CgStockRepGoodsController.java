package com.sc.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
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

@RequestMapping("/cgrepctrl")
public class CgStockRepGoodsController {
	
	@Autowired
	CgStockReplGoodsService cgrepgoods;//需采购商品service
	@Autowired
	KcGoodsInformationService kcgoodsinfo;//库存商品信息service
	@Autowired
	CgStockPurchaseOrderService cgpurorder;//采购商品订单service
	@Autowired
	CgStockDetailOrderService cgdetailorder;//采购订单详情service
	
	
	@RequestMapping("/selectcgrep.do")
	public ModelAndView selectcgrep(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum,
			@RequestParam(defaultValue="10")Integer pageSize,
			CgStockReplenishmentGoods repgoods,
			KcGoodsInformation goods){
		System.out.println("进入查寻需补货产品方法");
		PageInfo<CgStockReplenishmentGoods> page = cgrepgoods.selectcgrep(pageNum, pageSize, repgoods);
		
		mav.addObject("repgoods", repgoods);
		
		mav.setViewName("cg/cgrepgoods-list");
		mav.addObject("page", page);
		return mav;
	}
	
	
	@RequestMapping("/selectkcgoods.do")
	public ModelAndView selectkcgoods(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum,
			@RequestParam(defaultValue="10")Integer pageSize,
			CgStockReplenishmentGoods repgoods,
			KcGoodsInformation goods){
		System.out.println("查寻需补货产品");
		
		
		PageInfo<KcGoodsInformation> pageInfo = kcgoodsinfo.selectrepgoods(pageNum, pageSize, goods);
		
		mav.setViewName("cg/kcrepgoods-list1");
		mav.addObject("page", pageInfo);
		return mav;
	}
	
	@RequestMapping("/goaddrepgoods.do")
	public ModelAndView goaddrepgoods(ModelAndView mav,CgStockReplenishmentGoods repgoods,
			KcGoodsInformation goods){
		System.out.println("进入去添加页面的控制器");
		System.out.println("@@@@@@@@@@----------@@@@@@@@@@");
		
		mav.setViewName("cg/cgrepgoods-add");
		 
		return mav;
		
	}
	
	//添加进入需采购单
	@RequestMapping("/addrepgoods.do")
	@ResponseBody
	public Message addrepgoods(ModelAndView mav,CgStockReplenishmentGoods repgoods,
			KcGoodsInformation goods){
		System.out.println("进入添加的控制器");
		System.out.println("-----@@###$$$%%%^^&&**-------");
		cgrepgoods.addcgrep(repgoods);
		
		mav.setViewName("redirect:cg/cgrepgoods-list.jsp");
		return new Message("1","success","成功");
		
	}
	
	
	//把需采购单添加进采购详情单
	/*@RequestMapping("/goadddetorder.do")
	public ModelAndView addpurorder(ModelAndView mav,CgStockReplenishmentGoods repgoods,//需采购商品
			KcGoodsInformation goods,CgStockPurchaseOrder purorder,//订单表
			CgStockDetailOrder detorder,//详情表
			@RequestParam(defaultValue="1")Integer pageNum,
			@RequestParam(defaultValue="10")Integer pageSize){
		System.out.println("去把需采购单添加进采购单得页面");
		System.out.println("-----@@###$$去把需采购单添加进采购单得页面%%^^&&**-------");
		
		PageInfo<CgStockDetailOrder> info = cgdetailorder.selectcgdetailorder(pageSize, pageNum, detorder);
		
		mav.addObject("detorder", info);
			
		mav.setViewName("cg/goadddetorder-list");
		
		return mav;
		
	}*/
	
	/*//添加进入采购详情单
		@RequestMapping("/adddetorder.do")
		@ResponseBody
		public Message adddetorder(ModelAndView mav,CgStockReplenishmentGoods repgoods,
				KcGoodsInformation goods,CgStockDetailOrder detorder){
			System.out.println("添加进入采购详情单");
			System.out.println("-----@@###$$$%%%^^&&**-------");
			
			cgdetailorder.addcgdetailorder(detorder);
			
			mav.setViewName("redirect:cg/cgdetailorder-list.jsp");
			
			return new Message("1","success","成功");
		}*/
		
	
		
	//删除
		@RequestMapping("/deleterepgoods.do")
		@ResponseBody
		public Message deleterepgoods(CgStockReplenishmentGoods repgoods){
			System.out.println("进入删除方法了");
			
			cgrepgoods.deletecgrep(repgoods.getId());
			
			return new Message("1","success","成功");
			
		}
		//批量删除
		@RequestMapping("/deleterepgoodsall.do")
		@ResponseBody
		public String deleterepgoodsall(Long[] ids){
			System.out.println("进入批量删除方法了");
			
			if(ids!=null&&ids.length>0){
				for (Long id : ids) {
					cgrepgoods.deletecgrep(id);
				}
			}
			
			return "redirect:selectcgdetail.do";
			
		}
		
		//进入修改页面
		@RequestMapping("/goupdaterepgoods.do")
		public ModelAndView goupdaterepgoods(ModelAndView mav,CgStockReplenishmentGoods repgoods,
				KcGoodsInformation goods){
			System.out.println("进入去修改页面的控制器");
			System.out.println("@@@@@@@@@@----------@@@@@@@@@@");
			
			if(repgoods.getId()!=null){
				repgoods=cgrepgoods.getcgrep(repgoods.getId());
			}
			mav.addObject("replenishment", repgoods);
			
			mav.setViewName("cg/cgrepgoods-update");
			 
			return mav;
			
		}
		
		
		//执行修改
		@RequestMapping("/updaterepgoods.do")
		@ResponseBody
		public Message updaterepgoods(ModelAndView mav,CgStockReplenishmentGoods repgoods,
				KcGoodsInformation goods){
			System.out.println("进入修改的控制器");
			System.out.println("-----@@###$$$%%%^^&&**-------");
			if(repgoods.getId()!=null){
				cgrepgoods.updatecgrep(repgoods);
			}
			
			mav.setViewName("redirect:cg/cgrepgoods-list.jsp");
			return new Message("1","success","成功");
			
		}
		
		
		//改变状态
		@RequestMapping("/updatestate.do")
		@ResponseBody
		public Message updatepaystate(CgStockReplenishmentGoods repgoods){
			System.out.println("&&^改变状态^$$");
			
			if(repgoods.getId()!=null){
				CgStockReplenishmentGoods repl=cgrepgoods.getcgrep(repgoods.getId());
				repl.setState(repgoods.getState());
				cgrepgoods.updatecgrep(repl);
			}
			return new Message("1","success","成功");
			
		}

}
