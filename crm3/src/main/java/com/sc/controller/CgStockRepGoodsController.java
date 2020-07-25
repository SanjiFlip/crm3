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
	CgStockReplGoodsService cgrepgoods;//��ɹ���Ʒservice
	@Autowired
	KcGoodsInformationService kcgoodsinfo;//�����Ʒ��Ϣservice
	@Autowired
	CgStockPurchaseOrderService cgpurorder;//�ɹ���Ʒ����service
	@Autowired
	CgStockDetailOrderService cgdetailorder;//�ɹ���������service
	
	@MyLog("��Ѱ�貹����Ʒ")
	@RequestMapping("/selectcgrep.do")
	public ModelAndView selectcgrep(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum,
			@RequestParam(defaultValue="10")Integer pageSize,
			CgStockReplenishmentGoods repgoods,
			KcGoodsInformation goods){
		System.out.println("�����Ѱ�貹����Ʒ����");
		PageInfo<CgStockReplenishmentGoods> page = cgrepgoods.selectcgrep(pageNum, pageSize, repgoods);
		
		mav.addObject("repgoods", repgoods);
		
		mav.setViewName("cg/cgrepgoods-list");
		mav.addObject("page", page);
		return mav;
	}
	
	@MyLog("��Ѱ�貹����Ʒ")
	@RequestMapping("/selectkcgoods.do")
	public ModelAndView selectkcgoods(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum,
			@RequestParam(defaultValue="10")Integer pageSize,
			CgStockReplenishmentGoods repgoods,
			KcGoodsInformation goods){
		System.out.println("��Ѱ�貹����Ʒ");
		
		
		PageInfo<KcGoodsInformation> pageInfo = kcgoodsinfo.selectrepgoods(pageNum, pageSize, goods);
		
		mav.setViewName("cg/kcrepgoods-list1");
		mav.addObject("page", pageInfo);
		return mav;
	}
	@MyLog("������貹����Ʒҳ��")
	@RequestMapping("/goaddrepgoods.do")
	public ModelAndView goaddrepgoods(ModelAndView mav,CgStockReplenishmentGoods repgoods,
			KcGoodsInformation goods){
		System.out.println("����ȥ���ҳ��Ŀ�����");
		System.out.println("@@@@@@@@@@----------@@@@@@@@@@");
		
		mav.setViewName("cg/cgrepgoods-add");
		 
		return mav;
		
	}
	
	//��ӽ�����ɹ���
	@MyLog("����貹����Ʒ")
	@RequestMapping("/addrepgoods.do")
	@ResponseBody
	public Message addrepgoods(ModelAndView mav,CgStockReplenishmentGoods repgoods,
			KcGoodsInformation goods){
		System.out.println("������ӵĿ�����");
		System.out.println("-----@@###$$$%%%^^&&**-------");
		cgrepgoods.addcgrep(repgoods);
		
		mav.setViewName("redirect:cg/cgrepgoods-list.jsp");
		return new Message("1","success","�ɹ�");
		
	}
	
	
	//����ɹ�����ӽ��ɹ����鵥
	/*@RequestMapping("/goadddetorder.do")
	public ModelAndView addpurorder(ModelAndView mav,CgStockReplenishmentGoods repgoods,//��ɹ���Ʒ
			KcGoodsInformation goods,CgStockPurchaseOrder purorder,//������
			CgStockDetailOrder detorder,//�����
			@RequestParam(defaultValue="1")Integer pageNum,
			@RequestParam(defaultValue="10")Integer pageSize){
		System.out.println("ȥ����ɹ�����ӽ��ɹ�����ҳ��");
		System.out.println("-----@@###$$ȥ����ɹ�����ӽ��ɹ�����ҳ��%%^^&&**-------");
		
		PageInfo<CgStockDetailOrder> info = cgdetailorder.selectcgdetailorder(pageSize, pageNum, detorder);
		
		mav.addObject("detorder", info);
			
		mav.setViewName("cg/goadddetorder-list");
		
		return mav;
		
	}*/
	
	/*//��ӽ���ɹ����鵥
		@RequestMapping("/adddetorder.do")
		@ResponseBody
		public Message adddetorder(ModelAndView mav,CgStockReplenishmentGoods repgoods,
				KcGoodsInformation goods,CgStockDetailOrder detorder){
			System.out.println("��ӽ���ɹ����鵥");
			System.out.println("-----@@###$$$%%%^^&&**-------");
			
			cgdetailorder.addcgdetailorder(detorder);
			
			mav.setViewName("redirect:cg/cgdetailorder-list.jsp");
			
			return new Message("1","success","�ɹ�");
		}*/
		
	
		
	//ɾ��
	@MyLog("ɾ���貹����Ʒ")
		@RequestMapping("/deleterepgoods.do")
		@ResponseBody
		public Message deleterepgoods(CgStockReplenishmentGoods repgoods){
			System.out.println("����ɾ��������");
			
			cgrepgoods.deletecgrep(repgoods.getId());
			
			return new Message("1","success","�ɹ�");
			
		}
		//����ɾ��
	@MyLog("����ɾ���貹����Ʒ")
		@RequestMapping("/deleterepgoodsall.do")
		@ResponseBody
		public String deleterepgoodsall(Long[] ids){
			System.out.println("��������ɾ��������");
			
			if(ids!=null&&ids.length>0){
				for (Long id : ids) {
					cgrepgoods.deletecgrep(id);
				}
			}
			
			return "redirect:selectcgdetail.do";
			
		}
		
		//�����޸�ҳ��
	@MyLog("ȥ�޸��貹����Ʒ")
		@RequestMapping("/goupdaterepgoods.do")
		public ModelAndView goupdaterepgoods(ModelAndView mav,CgStockReplenishmentGoods repgoods,
				KcGoodsInformation goods){
			System.out.println("����ȥ�޸�ҳ��Ŀ�����");
			System.out.println("@@@@@@@@@@----------@@@@@@@@@@");
			
			if(repgoods.getId()!=null){
				repgoods=cgrepgoods.getcgrep(repgoods.getId());
			}
			mav.addObject("replenishment", repgoods);
			
			mav.setViewName("cg/cgrepgoods-update");
			 
			return mav;
			
		}
		
		
		//ִ���޸�
		@MyLog("�޸��貹����Ʒ")
		@RequestMapping("/updaterepgoods.do")
		@ResponseBody
		public Message updaterepgoods(ModelAndView mav,CgStockReplenishmentGoods repgoods,
				KcGoodsInformation goods){
			System.out.println("�����޸ĵĿ�����");
			System.out.println("-----@@###$$$%%%^^&&**-------");
			if(repgoods.getId()!=null){
				cgrepgoods.updatecgrep(repgoods);
			}
			
			mav.setViewName("redirect:cg/cgrepgoods-list.jsp");
			return new Message("1","success","�ɹ�");
			
		}
		
		
		//�ı�״̬
		@MyLog("�ı�״̬��Ϣ")
		@RequestMapping("/updatestate.do")
		@ResponseBody
		public Message updatepaystate(CgStockReplenishmentGoods repgoods){
			System.out.println("&&^�ı�״̬^$$");
			
			if(repgoods.getId()!=null){
				CgStockReplenishmentGoods repl=cgrepgoods.getcgrep(repgoods.getId());
				repl.setState(repgoods.getState());
				cgrepgoods.updatecgrep(repl);
			}
			return new Message("1","success","�ɹ�");
			
		}

}