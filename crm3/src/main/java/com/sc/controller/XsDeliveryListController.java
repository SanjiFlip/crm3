package com.sc.controller;

import java.util.Arrays;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.sc.annotation.MyLog;
import com.sc.entity.Message;
import com.sc.entity.XsCustomerContact;
import com.sc.entity.XsSaleDeliveryList;
import com.sc.entity.XsSaleDetail;
import com.sc.service.XsSaleDetailService;
import com.sc.service.XsSaleListService;

@Controller
@RequestMapping("/salelistctrl")
public class XsDeliveryListController {
	//要依赖service 注入进来
		@Autowired
		XsSaleListService  xsListService;	
		@Autowired
		XsSaleDetailService  xsDetailService;	
		
		/** 
		 *@function  查询方法
		*/
		@MyLog("查询销售出库单")
		@RequestMapping("/selectsalelist.do")
		public ModelAndView selectsalelist(ModelAndView mav,
				@RequestParam(defaultValue="1") Integer pageNum, 
				@RequestParam(defaultValue="10")Integer pageSize,
				XsSaleDeliveryList salelist){
			System.out.println("进入查询销售出库单分页方法了"+salelist);
			System.out.println("----"+salelist.getDatemin());
			System.out.println("----"+salelist.getDatemax());
			
			PageInfo<XsSaleDeliveryList> page = xsListService.selectsalelist(pageNum, pageSize, salelist);
			System.out.println();
			mav.addObject("p", page);	
			if(salelist.getSalesId()!=null){//id不为空 进入查看详情页面 
				salelist=xsListService.getsalelist(salelist.getSalesId());		
				mav.setViewName("xs/salelist-detail");
			}else{
				mav.setViewName("xs/salelist-list");//视图名称  /WEB-INF/xs/salelist-list.jsp
			}
			mav.addObject("salelist",salelist);
			return mav;
		}
		

		/** 
		 *@function  跳转添加页面or修改页面
		*/
		@MyLog("跳转添加or修改销售出库单")
		@RequestMapping("/goaddsalelist.do")
		public ModelAndView goAddSalelist(ModelAndView mav,XsSaleDeliveryList salelist){
			System.out.println("进入添加页面"+salelist);
			
		
			if(salelist.getSalesId()!=null){
				salelist=xsListService.getsalelist(salelist.getSalesId());
			}
			
			mav.setViewName("xs/salelist-add");
			mav.addObject("salelist",salelist);
			return mav;
		}
		
		/** 
		 *@function  添加/修改方法
		*/
		@MyLog("添加销售出库单/修改销售出库单")
		@RequestMapping("/addsalelist.do")
		@ResponseBody
		public Message addSalelist(ModelAndView mav,XsSaleDeliveryList salelist){
			System.out.println("进入添加销售出库单:"+salelist);
			if(salelist.getSalesId()!=null){//如果id不为空就是修改
				xsListService.updatesalelist(salelist);
			}else{
				xsListService.addsalelist(salelist);//否则就是添加  //添加修改共用一个页面
			}
			
			return new Message("1", "success", "成功");
		}
		
		/** 
		 *@function  删除方法
		*/
		@MyLog("删除销售出库单")
		@RequestMapping("/deletesalelist.do")
		@ResponseBody
		public Message deleteSalelist(ModelAndView mav,XsSaleDeliveryList salelist){
			System.out.println("进入删除销售出库单:"+salelist);
			xsListService.deletesalelist(salelist.getSalesId());	
		   return new Message("1", "success", "成功");
		}
		
		/** 
		 *@function  批量删除方法
		*/
		@MyLog("批量删除销售出库单")
		@RequestMapping("/deletesalelistall.do")
		public String deletesalelistAll(ModelAndView mav,long[] ids){
			System.out.println("进入批量删除销售出库单:"+Arrays.toString(ids));
			if(ids!=null&&ids.length>0){
				for (long id : ids) {
					xsListService.deletesalelist(id);
				}
			}		
			return "redirect:selectsalelist.do";
		}
		

		/** 
		 *@function  选项卡功能 查询销售出库单对应的销售详情
		*/
		@MyLog("销售出库单选项卡")
		@RequestMapping("/godetail.do")
		public ModelAndView godetail(ModelAndView mav,XsSaleDeliveryList salelist,HttpSession session){
			 System.out.println("销售出库单对象："+salelist);	
	    	 session.setAttribute("nowsaleid", salelist.getSalesId());
	    	 //通过SalesId查询该销售单下的详情单 存入model
	    	 
	    	  XsSaleDetail detail=new XsSaleDetail();
	    	  detail.setSalesId(salelist.getSalesId());
	   	      PageInfo<XsSaleDetail> page = xsDetailService.selectdetail(1, 8, detail);
	   	      mav.addObject("p", page);
			  mav.addObject("detail", detail);
			  
              mav.setViewName("xs/sale-tab");
	    	  return mav;
		}
		
		
		
}
