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
import com.sc.entity.KcDepositoryInformation;
import com.sc.entity.KcGoodsInformation;
import com.sc.entity.Message;
import com.sc.service.KcDepositoryInformationService;
import com.sc.service.KcGoodsInformationService;

@Controller

@RequestMapping("/KcDeptCtrl")
public class KcDepoInforController {
	
	@Autowired
	KcDepositoryInformationService kcdeposervice;
	@Autowired
	KcGoodsInformationService kcgoods;
	
	@MyLog("查询仓库方法 ")
	@RequestMapping("/selectdepo.do")
	public ModelAndView selectDept(ModelAndView mav,
			@RequestParam(defaultValue="1") Integer pageNum,
			@RequestParam(defaultValue="10")Integer pageSize,
			KcDepositoryInformation dept){
		System.out.println("进入查询仓库方法了");
		
		PageInfo<KcDepositoryInformation> selectDept = kcdeposervice.selectDept(dept, pageNum, pageSize);
		
		mav.addObject("selectDept", selectDept);
		
		mav.addObject("dept", dept);
		
		mav.setViewName("kc/kcdept-list");
		
		
		return mav;
	}
	
	@MyLog("进入仓库添加页面")
	   @RequestMapping("/goadddepo.do")
	   public ModelAndView goadddept(ModelAndView mav,KcDepositoryInformation dept){
		   
		   System.out.println("进入添加页面 ");
		   
		   //修改
		   if(dept.getDepositoryId()!=null){
			   dept=kcdeposervice.getDept(dept.getDepositoryId());
		   }
		   
		   mav.setViewName("kc/kcdept-add");
		   
		   mav.addObject("dept", dept);
		   
		   return mav;
	   }
	   
	   //添加完了就把层关了，不需要返回任何东西，这里使用Ajax提交
	@MyLog("进入仓库添加")
	   @RequestMapping("/adddepo.do")
	   @ResponseBody
	   public Message adddept(ModelAndView mav,KcDepositoryInformation dept){
		   
		   System.out.println("进入添加方法 "+dept);
		 //修改
		   if(dept.getDepositoryId()!=null){
			     kcdeposervice.updateDept(dept);
		   }else{
		        kcdeposervice.addDept(dept);
		   }
		   return new Message("1","success","成功");
		   
	   }
	   
	@MyLog("删除仓库信息")
	   @RequestMapping("/deletedepo.do")
	   @ResponseBody
	   public Message deletedepo(ModelAndView mav,KcDepositoryInformation dept){
		   
		   System.out.println("进入删除方法 "+dept);
		   kcdeposervice.deleteDept(dept.getDepositoryId());
		   
		   return new Message("1","success","成功");
	   }
	   
	@MyLog("批量删除仓库信息")
	   @RequestMapping("/deletedepoall.do")
		public String deletedepoall(Long[] ids){
			System.out.println("进入批量删除方法了");
			
			if(ids!=null&&ids.length>0){
				for (Long id : ids) {
			kcdeposervice.deleteDept(id);
				}
			}
			return "redirect:selectgoods.do";
		}
	   
}