package com.sc.controller;

import java.math.BigDecimal;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.sc.entity.KcDepositoryInformation;
import com.sc.entity.KcGoodsInformation;
import com.sc.entity.Message;
import com.sc.service.KcGoodsInformationService;

@Controller

@RequestMapping("/goodsindept")
public class KcGoodsInDeptCtrl {
	
	@Autowired
	KcGoodsInformationService kcgoods;
	
	
	//通过仓库编号找该仓库下面的商品
	   @RequestMapping("/selectdepogoods.do")
		public ModelAndView selectDeptgoods(ModelAndView mav,
				@RequestParam(defaultValue="1") Integer pageNum,
				@RequestParam(defaultValue="10")Integer pageSize,Long depositoryId,
				KcDepositoryInformation dept, HttpSession session,KcGoodsInformation goods){
			System.out.println("@@########$$$$$");
			
			session.setAttribute("getdepoid", dept.getDepositoryId());
			
			KcGoodsInformation good=new KcGoodsInformation();
			good.setDepositoryId(dept.getDepositoryId());
			
			PageInfo<KcGoodsInformation> info = kcgoods.selectrepgoodsbyid(pageNum, pageSize, depositoryId);
			
			mav.addObject("deptgoods", info);
			
			mav.addObject("dept", dept);
			
			mav.addObject("g", goods);
			
			mav.setViewName("kc/kcdeptgoods-list");
			
			return mav;
		}
	   
	  //在跳过去的页面添加商品信息
	   
	   @RequestMapping("/goaddgoodsindept.do")
		public ModelAndView goaddgoods(ModelAndView mav,KcGoodsInformation goods,KcDepositoryInformation dept){
			System.out.println("进入添加页面");
			
			if(goods.getGoodsId()!=null){
				goods=kcgoods.getgoods(goods.getGoodsId());
			}
			
			//修改 把通过id查到的信息给goods
			mav.addObject("goods", goods);
			mav.setViewName("kc/godeptgoods-add");
			
			return mav;
		}
	   
	   @RequestMapping("/addgoodsindept.do")
		@ResponseBody
		public Message addgoods(KcGoodsInformation goods){
			System.out.println("进入添加方法了");
			
			if(goods.getGoodsId()!=null){
				kcgoods.updatekcgoods(goods);
			}else{
				kcgoods.addkcgoods(goods);
				System.out.println("@@添加成功啦##");
			}
			
			return new Message("1","success","成功"); 
			
		}
		
	   
		@RequestMapping("/deletegoodsindept.do")
		@ResponseBody
		public Message deletegoods(KcGoodsInformation goods){
			System.out.println("进入删除方法了");
			
			kcgoods.deletekcgoods(goods.getGoodsId());
			
			return new Message("1","success","成功");
			
		}
		
		@RequestMapping("/deletegoodsindeptall.do")
		public String deletegoodsall(BigDecimal[] ids){
			System.out.println("进入批量删除方法了");
			
			if(ids!=null&&ids.length>0){
				for (BigDecimal id : ids) {
					kcgoods.deletekcgoods(id);
				}

			}
			
			return "redirect:selectgoods.do";
			
		}
		
	

}
