package com.sc.controller;

import java.math.BigDecimal;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.sc.annotation.MyLog;
import com.sc.entity.Message;
import com.sc.entity.XsCustomerContactRecord;
import com.sc.service.XsContactRecordService;


@Controller
@RequestMapping("/recordctrl")
public class XsContactRecordController {

	//要依赖service 注入进来
	@Autowired
	XsContactRecordService xsRecordService;
	
	/** 
	 *@function  查询方法
	*/
	@MyLog("查询客户联系记录")
	@RequestMapping("/selectrecord.do")
	public ModelAndView selectrecord(ModelAndView mav,
			@RequestParam(defaultValue="1") Integer pageNum, //设置默认值 如果没传就是默认值
			@RequestParam(defaultValue="10")Integer pageSize,
			XsCustomerContactRecord record){
		System.out.println("进入查询客户联系记录分页方法了"+record);
		System.out.println("----"+record.getDatemin());
		System.out.println("----"+record.getDatemax());
		
		PageInfo<XsCustomerContactRecord> page = xsRecordService.selectrecord(pageNum, pageSize, record);
		System.out.println();
		mav.addObject("p", page);
		mav.addObject("record",record);
		mav.setViewName("xs/record-list");//视图名称  /WEB-INF/xs/record-list.jsp
		return mav;
	}
	
	/** 
	 *@function  跳转添加页面or修改页面
	*/
	@MyLog(" 跳转添加页面or修改页面")
	@RequestMapping("/goaddrecord.do")
	public ModelAndView goAddRecord(ModelAndView mav,XsCustomerContactRecord record){
		System.out.println("进入添加页面"+record);
		
	
		if(record.getContactRecordId()!=null){
			record=xsRecordService.getrecord(record.getContactRecordId());
		}
		
		mav.setViewName("xs/record-add");
		mav.addObject("record",record);
		return mav;
	}
	
	/** 
	 *@function  添加/修改方法
	*/
	@MyLog("添加联系记录/修改联系记录")
	@RequestMapping("/addrecord.do")
	@ResponseBody
	public Message addRecord(ModelAndView mav,XsCustomerContactRecord record){
		System.out.println("进入添加联系记录:"+record);
		if(record.getContactRecordId()!=null){//如果id不为空就是修改
			xsRecordService.updaterecord(record);
		}else{
			xsRecordService.addrecord(record);//否则就是添加  //添加修改共用一个页面
		}
		
		return new Message("1", "success", "成功");
	}
	
	/** 
	 *@function 删除方法
	*/
	@MyLog("删除联系记录")
	@RequestMapping("/deleterecord.do")
	@ResponseBody
	public Message deleteRecord(ModelAndView mav,XsCustomerContactRecord record){
		System.out.println("进入删除联系记录:"+record);
		xsRecordService.deleterecord(record.getContactRecordId());	
	   return new Message("1", "success", "成功");
	}
	
	/** 
	 *@function 批量删除方法
	*/
	@MyLog("批量删除联系记录")
	@RequestMapping("/deleterecordall.do")
	public String deleteRecordAll(ModelAndView mav,long[] ids){
		System.out.println("进入批量删除联系记录:"+Arrays.toString(ids));
		if(ids!=null&&ids.length>0){
			for (long id : ids) {
				xsRecordService.deleterecord(id);
			}
		}		
		return "redirect:selectrecord.do";
	}
}
