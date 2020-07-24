package com.sc.controller;

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
import com.sc.entity.XsCustomerLose;
import com.sc.service.XsCustomerContactService;
import com.sc.service.XsCustomerLoseService;

@Controller
@RequestMapping("/losectrl")
public class XsCustomerLoseController {

	//要依赖service 注入进来
	@Autowired
    XsCustomerLoseService xsLoseService;
	
	/** 
	 *@function  查询方法
	*/
	@MyLog("查询客户流失信息")
	@RequestMapping("/selectlose.do")
	public ModelAndView selectlose(ModelAndView mav,
			@RequestParam(defaultValue="1") Integer pageNum, //设置默认值 如果没传就是默认值
			@RequestParam(defaultValue="8")Integer pageSize,
			XsCustomerLose lose){
		System.out.println("进入查询客户流失信息分页方法了"+lose);
		System.out.println("----"+lose.getDatemin());
		System.out.println("----"+lose.getDatemax());
		
		PageInfo<XsCustomerLose> page = xsLoseService.selectlose(pageNum, pageSize, lose);
		System.out.println();
		mav.addObject("p", page);	
		mav.setViewName("xs/lose-list");//视图名称  /WEB-INF/xs/lose-list.jsp
		mav.addObject("lose",lose);
		return mav;
	}
	
	/** 
	 *@function  跳转修改页面
	*/
	@MyLog("跳转修改页面")
	@RequestMapping("/goaddlose.do")
	public ModelAndView goAddLose(ModelAndView mav,XsCustomerLose lose){
		System.out.println("进入修改页面"+lose);	
		//修改的时候 通过id获取对象 在查询一次  修改的时候其他信息就不用重写了
		if(lose.getLoseId()!=null){
			lose=xsLoseService.getlose(lose.getLoseId());
		}
		mav.setViewName("xs/lose-add");
		mav.addObject("lose",lose);
		return mav;
	}
	
	/** 
	 *@function  修改方法
	*/
	@MyLog("修改客户流失信息")
	@RequestMapping("/addlose.do")
	@ResponseBody
	public Message addLose(ModelAndView mav,XsCustomerLose lose){
		System.out.println("进入修改客户流失信息:"+lose);
		xsLoseService.updatelose(lose);
        return new Message("1", "success", "成功");
	}
	
	/** 
	 *@function  删除方法
	*/
	@MyLog("删除客户流失信息")
	@RequestMapping("/deletelose.do")
	@ResponseBody
	public Message deleteLose(ModelAndView mav,XsCustomerLose lose){
		System.out.println("进入删除流失记录:"+lose);
		xsLoseService.deletelose(lose.getLoseId());	
	    return new Message("1", "success", "成功");
	}
	
	/** 
	 *@function  删除方法
	*/
	@MyLog("批量删除客户流失信息")
	@RequestMapping("/deleteloseall.do")
	public String deleteLoseAll(ModelAndView mav,long[] ids){
		System.out.println("进入批量删除流失记录:"+Arrays.toString(ids));
		if(ids!=null&&ids.length>0){
			for (long id : ids) {
				xsLoseService.deletelose(id);
			}
		}		
		return "redirect:selectlose.do";
	}
}
