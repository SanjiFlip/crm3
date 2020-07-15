package com.sc.controller;


import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.sc.entity.Message;
import com.sc.entity.RsCompnayMessage;
import com.sc.service.RsCompnayMessageService;


@Controller
@RequestMapping("/rscompnayctrl")
public class RsCompnayController {
	
	 @Autowired 
	 RsCompnayMessageService rsCompnayMessageService;
	 
	
	@RequestMapping("/selectcompnay.do")
	public ModelAndView selectCompnay(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum, 
			@RequestParam(defaultValue="10")Integer pageSize,
			RsCompnayMessage rscompnay){
		 PageInfo<RsCompnayMessage> page = rsCompnayMessageService.selectRsCompnay(pageNum, pageSize, rscompnay);
		 mav.addObject("p", page);
		 mav.addObject("rscompnay", rscompnay);
		 mav.setViewName("rs/rscompnay-list"); 
		 return mav;
	}
	

	@RequestMapping("/goaddcompnay.do")
	public ModelAndView goAddCompnay(ModelAndView mav, 	
			RsCompnayMessage rscompnay){
	 if(rscompnay.getCompnayId()!=null){
		 rscompnay=rsCompnayMessageService.getRsCompnay(rscompnay.getCompnayId());
	 }
	 mav.setViewName("rs/rscompnay-add");
	 
	 mav.addObject("rscompnay", rscompnay);
	 return mav;
	}
	 
	 @RequestMapping("/addcompnay.do")
	 @ResponseBody
	 public Message AddCompnay(ModelAndView mav, 	
				RsCompnayMessage rscompnay){
		 System.out.println("公司信息是："+rscompnay);
		 if(rscompnay.getCompnayId()!=null){//修改操作
			 rsCompnayMessageService.updateRsCompnay(rscompnay);
		 }else{
			 rsCompnayMessageService.addRsCompnay(rscompnay);
		 }
			 return new Message("1", "success", "成功");
		} 
	 
	 @RequestMapping("/deletecompnay.do")
	 @ResponseBody
	 public Message deleteCompnay(ModelAndView mav, 	
				RsCompnayMessage rscompnay){
		 System.out.println("删除的公司信息是:"+rscompnay);
		 rsCompnayMessageService.deleteRsCompnay(rscompnay.getCompnayId());
		 return new Message("1", "success", "成功");
		}
	 
	 @RequestMapping("/enabledcompnay.do")
	 @ResponseBody
	 public Message enabledCompnay(ModelAndView mav, 	
				RsCompnayMessage rscompnay){
		 System.out.println("公司可用信息是:"+rscompnay);
		 if(rscompnay.getCompnayId()!=null){
			 RsCompnayMessage comp=rsCompnayMessageService.getRsCompnay(rscompnay.getCompnayId());
			 comp.setEnabled(rscompnay.getEnabled());
			 rsCompnayMessageService.updateRsCompnay(comp);
		 }
			return new Message("1", "success", "成功");
		}
	 
	@RequestMapping("/showcompnay.do")
	public ModelAndView showCompnay(ModelAndView mav,
			RsCompnayMessage rscompnay){		
		 rscompnay=rsCompnayMessageService.getRsCompnay(rscompnay.getCompnayId());
		 mav.setViewName("rs/rscompnay-show");  // /WB-INF/rs/rscompnay-list.jsp
		 mav.addObject("rscompnay", rscompnay); 
		 return mav;
	}
	 
	 @RequestMapping("/deletecompnayall.do")
	 @ResponseBody
	 public ModelAndView deleteCompnayall(ModelAndView mav, 	
			 Long[] ids){
		 System.out.println("删除的ID是:"+Arrays.toString(ids));
		 if(ids!=null&&ids.length>0){
			 for(Long id : ids) {
				 rsCompnayMessageService.deleteRsCompnay(id);
			 }
		 }		 
		 mav.setViewName("redirect:selectcompnay.do");
			return mav;
		} 
}
