package com.sc.controller;

import java.math.BigDecimal;
import java.util.List;

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

//�ɹ����鵥������
@RequestMapping("/cgdetailorder")
public class CgStockDetailOrderController {
	
	@Autowired
	CgStockPurchaseOrderService cgpurorder;//�ɹ���service
	@Autowired
	CgStockDetailOrderService cgdetailorder;//�ɹ������service
	@Autowired
	CgStockReplGoodsService cgrepgoods;//��ɹ���service
	@Autowired
	KcGoodsInformationService kcgoods;
	
	//��ѯ���������
	@MyLog("��ѯ���������")
	@RequestMapping("/selectcgdetail.do")
	public ModelAndView selectcgdetail(ModelAndView mav,
			@RequestParam(defaultValue="1") Integer pageNum,
			@RequestParam(defaultValue="10") Integer pageSize
			,CgStockDetailOrder detorder,
			CgStockPurchaseOrder purorder,BigDecimal purchaseOrderId){
		System.out.println("@@##$$��ѯ���������");
		//��ѯ���������
		PageInfo<CgStockDetailOrder> info = cgdetailorder.selectcgdetailorder(pageSize, pageNum, detorder);
		mav.addObject("detorder", detorder);
		mav.addObject("p", info);
		
		/*PageInfo<CgStockPurchaseOrder> pageInfo = cgpurorder.selectcgpurorderbyid(pageSize, pageNum, purchaseOrderId);
		mav.addObject("purchase", pageInfo);*/
		
		mav.setViewName("cg/cgdetailorder-list");
		return mav;
	}
	
	
	
	//�����������ɹ�����ҳ��
	@MyLog("�����������ɹ�����ҳ��")
	@RequestMapping("/goadddetail.do")
	public ModelAndView goadddetail(ModelAndView mav,CgStockDetailOrder detorder,
			KcGoodsInformation goods){
		System.out.println("@@�����������ɹ�����ҳ��%%");
		
		if(detorder.getPurchaseOrderDetailId()!=null){
			detorder=cgdetailorder.getcgdetailorder(detorder.getPurchaseOrderDetailId());
		}
		
		//����ɹ����в����Ʒ��Ϣ
		List<CgStockReplenishmentGoods> list = cgrepgoods.selectall();
		mav.addObject("list", list);
		
		mav.addObject("detail", detorder);
		mav.setViewName("cg/goadddetorder-list");
		
		return mav;
	}
	
	//�������ɹ���
	@MyLog("�������ɹ���")
	@RequestMapping("/adddetail.do")
	@ResponseBody
	public Message adddetail(CgStockDetailOrder detorder,ModelAndView mav){
		
		System.out.println("@@#�������ɹ���#$$");
		
		if(detorder.getPurchaseOrderDetailId()!=null){
			cgdetailorder.updatecgdetailorder(detorder);
		}else{
			cgdetailorder.addcgdetailorder(detorder);
		}
		mav.setViewName("redirect:cg/cgdetailorder-list");
		
		return new Message("1","success","�ɹ�");
	}
	
	
	@MyLog("ɾ������ɹ���")
	@RequestMapping("/deletedetorder.do")
	@ResponseBody
	public Message deletedetorder(CgStockDetailOrder detorder){
		System.out.println("����ɾ��������");
		
		cgdetailorder.deletecgdetailorder(detorder.getPurchaseOrderDetailId());
		
		return new Message("1","success","�ɹ�");
		
	}
	
	@MyLog("����ɾ������ɹ���")
	@RequestMapping("/deletedetorderall.do")
	@ResponseBody
	public String deletedetorderall(BigDecimal[] ids){
		System.out.println("��������ɾ��������");
		
		if(ids!=null&&ids.length>0){
			for (BigDecimal id : ids) {
				cgdetailorder.deletecgdetailorder(id);
			}
		}
		
		return "redirect:selectcgdetail.do";
		
	}
	
	//�ı����״̬
	@MyLog("�ı����״̬")
		@RequestMapping("/updatestorage.do")
		@ResponseBody
		public Message updatestorage(CgStockDetailOrder detorder,KcGoodsInformation goods){
			System.out.println("&&^�ı����״̬^$$");
			
			if(detorder.getPurchaseOrderDetailId()!=null){
				CgStockDetailOrder det=cgdetailorder.getcgdetailorder(detorder.getPurchaseOrderDetailId());
				det.setIsnotInStorage(detorder.getIsnotInStorage());
				cgdetailorder.updatecgdetailorder(det);
				
			}
			
			return new Message("1","success","�ɹ�");
			
		}
		
		//���
	@MyLog("���")
		@RequestMapping("/updategoodsNum.do")
		@ResponseBody
		public Message updategoodsNum(CgStockDetailOrder detorder,KcGoodsInformation goods,
				@RequestParam(defaultValue="1") Integer pageNum,
				@RequestParam(defaultValue="10") Integer pageSize,
				BigDecimal goodsId){
			System.out.println("&&^��ӹ������������^$$");
			
			if(detorder.getPurchaseOrderDetailId()!=null){
				CgStockDetailOrder det=cgdetailorder.getcgdetailorder(detorder.getPurchaseOrderDetailId());
				KcGoodsInformation good=new KcGoodsInformation();
				good.setGoodsId(det.getGoodsId());
				KcGoodsInformation g=kcgoods.getgoods(goodsId);
				
				if(g.getGoodsId()!=null){
					BigDecimal num=null;
					BigDecimal c=new BigDecimal(det.getGoodsNum());
					num=c.add(g.getStockNumber());
					g.setStockNumber(num);
					kcgoods.updatekcgoods(g);	
					
										
				}
				
				
				
				
			}
			
			return new Message("1","success","�ɹ�");
			
		}

}