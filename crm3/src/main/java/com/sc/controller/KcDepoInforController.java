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
	
	@MyLog("��ѯ�ֿⷽ�� ")
	@RequestMapping("/selectdepo.do")
	public ModelAndView selectDept(ModelAndView mav,
			@RequestParam(defaultValue="1") Integer pageNum,
			@RequestParam(defaultValue="10")Integer pageSize,
			KcDepositoryInformation dept){
		System.out.println("�����ѯ�ֿⷽ����");
		
		PageInfo<KcDepositoryInformation> selectDept = kcdeposervice.selectDept(dept, pageNum, pageSize);
		
		mav.addObject("selectDept", selectDept);
		
		mav.addObject("dept", dept);
		
		mav.setViewName("kc/kcdept-list");
		
		
		return mav;
	}
	
	@MyLog("����ֿ����ҳ��")
	   @RequestMapping("/goadddepo.do")
	   public ModelAndView goadddept(ModelAndView mav,KcDepositoryInformation dept){
		   
		   System.out.println("�������ҳ�� ");
		   
		   //�޸�
		   if(dept.getDepositoryId()!=null){
			   dept=kcdeposervice.getDept(dept.getDepositoryId());
		   }
		   
		   mav.setViewName("kc/kcdept-add");
		   
		   mav.addObject("dept", dept);
		   
		   return mav;
	   }
	   
	   //������˾ͰѲ���ˣ�����Ҫ�����κζ���������ʹ��Ajax�ύ
	@MyLog("����ֿ����")
	   @RequestMapping("/adddepo.do")
	   @ResponseBody
	   public Message adddept(ModelAndView mav,KcDepositoryInformation dept){
		   
		   System.out.println("������ӷ��� "+dept);
		 //�޸�
		   if(dept.getDepositoryId()!=null){
			     kcdeposervice.updateDept(dept);
		   }else{
		        kcdeposervice.addDept(dept);
		   }
		   return new Message("1","success","�ɹ�");
		   
	   }
	   
	@MyLog("ɾ���ֿ���Ϣ")
	   @RequestMapping("/deletedepo.do")
	   @ResponseBody
	   public Message deletedepo(ModelAndView mav,KcDepositoryInformation dept){
		   
		   System.out.println("����ɾ������ "+dept);
		   kcdeposervice.deleteDept(dept.getDepositoryId());
		   
		   return new Message("1","success","�ɹ�");
	   }
	   
	@MyLog("����ɾ���ֿ���Ϣ")
	   @RequestMapping("/deletedepoall.do")
		public String deletedepoall(Long[] ids){
			System.out.println("��������ɾ��������");
			
			if(ids!=null&&ids.length>0){
				for (Long id : ids) {
			kcdeposervice.deleteDept(id);
				}
			}
			return "redirect:selectgoods.do";
		}
	   
}