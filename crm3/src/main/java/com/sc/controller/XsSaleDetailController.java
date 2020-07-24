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
import com.sc.entity.XsSaleDeliveryList;
import com.sc.entity.XsSaleDetail;
import com.sc.service.XsSaleDetailService;
import com.sc.service.XsSaleListService;

@Controller
@RequestMapping("/detailctrl")
public class XsSaleDetailController {
	@Autowired
	XsSaleDetailService  xsDetailService;	
	
	/** 
	 *@function  ��ѯ����
	*/
	@MyLog("��ѯ�������鵥")
	@RequestMapping("/selectdetail.do")
	public ModelAndView selectdetail(ModelAndView mav,
			@RequestParam(defaultValue="1") Integer pageNum, 
			@RequestParam(defaultValue="10")Integer pageSize,
			XsSaleDetail detail){
		System.out.println("�����ѯ�������鵥��ҳ������"+detail);
		System.out.println("----"+detail.getDatemin());
		System.out.println("----"+detail.getDatemax());	
		PageInfo<XsSaleDetail> page = xsDetailService.selectdetail(pageNum, pageSize, detail);
		System.out.println();
		mav.addObject("p", page);	
        mav.setViewName("xs/saledetail-list");//��ͼ����  /WEB-INF/xs/detail-list.jsp
		mav.addObject("detail",detail);
		return mav;
	}
	
	/** 
	 *@function  ��ת���ҳ��or�޸�ҳ��
	*/
	@MyLog("��ת���ҳ��or�޸�ҳ��")
	@RequestMapping("/goadddetail.do")
	public ModelAndView goAddDetail(ModelAndView mav,XsSaleDetail detail){
		System.out.println("�������ҳ��"+detail);
		if(detail.getSalesDetailId()!=null){
			detail=xsDetailService.getdetail(detail.getSalesDetailId());
		}		
		mav.setViewName("xs/saledetail-add");
		mav.addObject("detail",detail);
		return mav;
	}
	
	/** 
	 *@function  ���/�޸ķ���
	*/
	@MyLog("����������鵥/�޸��������鵥")
	@RequestMapping("/adddetail.do")
	@ResponseBody
	public Message addDetail(ModelAndView mav,XsSaleDetail detail){
		System.out.println("��������������鵥:"+detail);
		if(detail.getSalesDetailId()!=null){//���id��Ϊ�վ����޸�
			xsDetailService.updatedetail(detail);
		}else{
			xsDetailService.adddetail(detail);//����������  //����޸Ĺ���һ��ҳ��
		}		
		return new Message("1", "success", "�ɹ�");
	}
	

	/** 
	 *@function  ɾ������
	*/
	@MyLog("ɾ���������鵥")
	@RequestMapping("/deletedetail.do")
	@ResponseBody
	public Message deleteDetail(ModelAndView mav,XsSaleDetail detail){
		System.out.println("����ɾ���������鵥:"+detail);
		xsDetailService.deletedetail(detail.getSalesDetailId());	
	   return new Message("1", "success", "�ɹ�");
	}
	
	/** 
	 *@function  ����ɾ������
	*/
	@MyLog("����ɾ���������鵥")
	@RequestMapping("/deletedetailall.do")
	public String deleteDetailAll(ModelAndView mav,long[] ids){
		System.out.println("��������ɾ���������鵥:"+Arrays.toString(ids));
		if(ids!=null&&ids.length>0){
			for (long id : ids) {
				xsDetailService.deletedetail(id);
			}
		}		
		return "redirect:selectdetail.do";
	}
	
}
