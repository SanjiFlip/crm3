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

@RequestMapping("/cgsupplier")//供应商控制器
public class CgSupplierInfoController {

	@Autowired
	CgStockSupplierInfoService cgsupplier;//供应商service
	
	@MyLog("查询供应商信息")
	@RequestMapping("/selectsupp.do")
	public ModelAndView selectsupp(ModelAndView mav,
			@RequestParam(defaultValue="1") Integer pageNum,
			@RequestParam(defaultValue="10") Integer pageSize,
			CgStockSupplierInformation cgsup){
		
		System.out.println("&&^进入查询供应商信息控制器^$$");
		
		//调用查询方法查询数据库供应商信息
		PageInfo<CgStockSupplierInformation> info = cgsupplier.selectcgsup(pageNum, pageSize, cgsup);
		
		mav.addObject("supplier", info);
		
		mav.addObject("sup", cgsup);
		mav.setViewName("cg/cgsupplier-list");
		
		return mav;
	}
	
	//添加信息页面
	@MyLog("添加供应商信息页面")
	@RequestMapping("/goaddsupplier.do")
	public ModelAndView goaddspuulier(ModelAndView mav,
			@RequestParam(defaultValue="1") Integer pageNum,
			@RequestParam(defaultValue="10") Integer pageSize,
			 CgStockSupplierInformation cgsup){
		
		System.out.println("&&^进入添加供应商信息页面控制器^$$");
		
		if(cgsup.getSupplierId()!=null){
		cgsup=cgsupplier.getcgsup(cgsup.getSupplierId());
		}
		mav.addObject("sup", cgsup);
		mav.setViewName("cg/gosupplier-add");
		
		return mav;
	}
	
	//添加供应商信息
	@MyLog("添加供应商信息")
	@RequestMapping("/addsupplier.do")
	@ResponseBody
	public Message addsupplier(ModelAndView mav,CgStockSupplierInformation cgsup){
		System.out.println("########################");
		System.out.println("@@@@@@@@@@@@@@@@"+cgsup);
		
		if(cgsup.getSupplierId()!=null){
			cgsupplier.updatecgsup(cgsup);
			System.out.println("&&^进入修改供应商信息控制器^$$");
		}else{
			cgsupplier.addcgsup(cgsup);
		}
			
		return new Message("1","success","成功");
	}
	
	@MyLog("删除供应商信息")
	@RequestMapping("/deletesupplier.do")
	@ResponseBody
	public Message deletesupplier(ModelAndView mav,CgStockSupplierInformation cgsup){
		
		System.out.println("&&^进入删改供应商信息控制器^$$"+cgsup);
		cgsupplier.deletecgsup(cgsup.getSupplierId());
		
			
		return new Message("1","success","成功");
	}
	
	//批量删除
	@MyLog("批量删除供应商信息")
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
