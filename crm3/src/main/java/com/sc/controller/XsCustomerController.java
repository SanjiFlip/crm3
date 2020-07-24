package com.sc.controller;

import java.math.BigDecimal;
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
import com.sc.entity.XsCustomerContactRecord;
import com.sc.entity.XsCustomerFeedback;
import com.sc.entity.XsCustomerInfo;
import com.sc.service.XsContactRecordService;
import com.sc.service.XsCustomerContactService;
import com.sc.service.XsCustomerInfoService;
import com.sc.service.XsCustomerFeedbackService;

@Controller
@RequestMapping("/customerctrl")
public class XsCustomerController {

	//要依赖service 注入进来
	@Autowired
	XsCustomerInfoService xsCustomerService;
	@Autowired
	XsCustomerContactService xsContactService;
	@Autowired
	XsContactRecordService xsRecordService;
	@Autowired
	XsCustomerFeedbackService xsFeedbackService;
   
	/** 
	 *@function  查询方法
	*/
	@MyLog("查询客户信息")
	@RequestMapping("/selectcustomer.do")
	public ModelAndView selectcustomer(ModelAndView mav,
			@RequestParam(defaultValue="1") Integer pageNum, //设置默认值 如果没传就是默认值
			@RequestParam(defaultValue="8")Integer pageSize,
			XsCustomerInfo customer){
		System.out.println("进入查询客户信息分页方法了"+customer);
		System.out.println("----"+customer.getDatemin());
		System.out.println("----"+customer.getDatemax());
		
		PageInfo<XsCustomerInfo> page = xsCustomerService.selectcustomer(pageNum, pageSize, customer);
		System.out.println();
		mav.addObject("p", page);	
		if(customer.getCustomerId()!=null){//id不为空 进入查看详情页面 
			customer=xsCustomerService.getcustomer(customer.getCustomerId());		
			mav.setViewName("xs/customer-detail");
		}else{
			mav.setViewName("xs/customer-list");//视图名称  /WEB-INF/xs/customer-list.jsp
		}
		mav.addObject("customer",customer);
		return mav;
	}
	
	/** 
	 *@function  跳转添加页面or修改页面
	*/
	@MyLog("跳转添加页面or修改页面")
	@RequestMapping("/goaddcustomer.do")
	public ModelAndView goAddCustomer(ModelAndView mav,XsCustomerInfo customer){
		System.out.println("进入添加页面"+customer);
		
		//修改的时候 通过id获取对象 在查询一次  修改的时候其他信息就不用重写了
		if(customer.getCustomerId()!=null){
			customer=xsCustomerService.getcustomer(customer.getCustomerId());
		}
		mav.setViewName("xs/customer-add");
		mav.addObject("customer",customer);
		return mav;
	}
	
	/** 
	 *@function  添加/修改方法
	*/
	@MyLog("添加客户信息/修改客户信息")
	@RequestMapping("/addcustomer.do")
	@ResponseBody
	public Message addCustomer(ModelAndView mav,XsCustomerInfo customer){
		System.out.println("进入添加客户:"+customer);
		if(customer.getCustomerId()!=null){//如果id不为空就是修改
			xsCustomerService.updatecustomer(customer);
		}else{
			xsCustomerService.addcustomer(customer);//否则就是添加  //添加修改共用一个页面
		}
		
		return new Message("1", "success", "成功");
	}
	
	/** 
	 *@function  删除方法
	*/
	@MyLog("删除客户")
	@RequestMapping("/deletecustomer.do")
	@ResponseBody
	public Message deleteCustomer(ModelAndView mav,XsCustomerInfo customer){
		System.out.println("进入删除客户:"+customer);
		xsCustomerService.deletecustomer(customer.getCustomerId());	
	   return new Message("1", "success", "成功");
	}
	
	/** 
	 *@function  批量删除方法
	*/
	@MyLog("批量删除客户")
	@RequestMapping("/deletecustomerall.do")
	public String deleteCustomerAll(ModelAndView mav,long[] ids){
		System.out.println("进入批量删除客户:"+Arrays.toString(ids));
		if(ids!=null&&ids.length>0){
			for (long id : ids) {
				xsCustomerService.deletecustomer(id);
			}
		}		
		return "redirect:selectcustomer.do";
	}
	
	/** 
	 *@function  选项卡功能  查询客户对应的联系人，联系记录，反馈记录
	*/
	@MyLog("客户选项卡")
	@RequestMapping("/gocustomer.do") //选项卡功能
	public ModelAndView goCustomer(ModelAndView mav,XsCustomerInfo customer,HttpSession session){  
    	 System.out.println("客户对象："+customer);	
    	 session.setAttribute("nowcustomerid", customer.getCustomerId());
    	
    	  // 客户联系人
  	      XsCustomerContact contact=new XsCustomerContact();
  	      contact.setCustomerId(customer.getCustomerId());
   	      PageInfo<XsCustomerContact> page = xsContactService.selectcontact(1, 8, contact);
   	      mav.addObject("p", page);
		  mav.addObject("contact", contact);
		
		  //客户联系记录
		  XsCustomerContactRecord record=new XsCustomerContactRecord();
		  record.setCustomerId(customer.getCustomerId());
	      PageInfo<XsCustomerContactRecord> page1 =xsRecordService.selectrecord(1, 8, record);
		  mav.addObject("p1", page1);
		  mav.addObject("record", record);
          
		  //客户反馈
		  XsCustomerFeedback feedback=new XsCustomerFeedback();
		  feedback.setCustomerId(customer.getCustomerId());
		  PageInfo<XsCustomerFeedback> page2 =xsFeedbackService.selectfeedback(1, 8,feedback);
		  mav.addObject("p2", page2);
		  mav.addObject("feedback", feedback);
          
	    	 	
    	  mav.setViewName("xs/customer-tab");
    	  return mav;
    }

}
