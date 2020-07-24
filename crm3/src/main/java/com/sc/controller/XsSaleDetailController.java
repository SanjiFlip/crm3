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
	 *@function  查询方法
	*/
	@MyLog("查询销售详情单")
	@RequestMapping("/selectdetail.do")
	public ModelAndView selectdetail(ModelAndView mav,
			@RequestParam(defaultValue="1") Integer pageNum, 
			@RequestParam(defaultValue="10")Integer pageSize,
			XsSaleDetail detail){
		System.out.println("进入查询销售详情单分页方法了"+detail);
		System.out.println("----"+detail.getDatemin());
		System.out.println("----"+detail.getDatemax());	
		PageInfo<XsSaleDetail> page = xsDetailService.selectdetail(pageNum, pageSize, detail);
		System.out.println();
		mav.addObject("p", page);	
        mav.setViewName("xs/saledetail-list");//视图名称  /WEB-INF/xs/detail-list.jsp
		mav.addObject("detail",detail);
		return mav;
	}
	
	/** 
	 *@function  跳转添加页面or修改页面
	*/
	@MyLog("跳转添加页面or修改页面")
	@RequestMapping("/goadddetail.do")
	public ModelAndView goAddDetail(ModelAndView mav,XsSaleDetail detail){
		System.out.println("进入添加页面"+detail);
		if(detail.getSalesDetailId()!=null){
			detail=xsDetailService.getdetail(detail.getSalesDetailId());
		}		
		mav.setViewName("xs/saledetail-add");
		mav.addObject("detail",detail);
		return mav;
	}
	
	/** 
	 *@function  添加/修改方法
	*/
	@MyLog("添加销售详情单/修改销售详情单")
	@RequestMapping("/adddetail.do")
	@ResponseBody
	public Message addDetail(ModelAndView mav,XsSaleDetail detail){
		System.out.println("进入添加销售详情单:"+detail);
		if(detail.getSalesDetailId()!=null){//如果id不为空就是修改
			xsDetailService.updatedetail(detail);
		}else{
			xsDetailService.adddetail(detail);//否则就是添加  //添加修改共用一个页面
		}		
		return new Message("1", "success", "成功");
	}
	

	/** 
	 *@function  删除方法
	*/
	@MyLog("删除销售详情单")
	@RequestMapping("/deletedetail.do")
	@ResponseBody
	public Message deleteDetail(ModelAndView mav,XsSaleDetail detail){
		System.out.println("进入删除销售详情单:"+detail);
		xsDetailService.deletedetail(detail.getSalesDetailId());	
	   return new Message("1", "success", "成功");
	}
	
	/** 
	 *@function  批量删除方法
	*/
	@MyLog("批量删除销售详情单")
	@RequestMapping("/deletedetailall.do")
	public String deleteDetailAll(ModelAndView mav,long[] ids){
		System.out.println("进入批量删除销售详情单:"+Arrays.toString(ids));
		if(ids!=null&&ids.length>0){
			for (long id : ids) {
				xsDetailService.deletedetail(id);
			}
		}		
		return "redirect:selectdetail.do";
	}
	
}
