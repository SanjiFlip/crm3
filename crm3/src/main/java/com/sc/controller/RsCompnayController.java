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
//人事——公司信息表控制器


@Controller   //把该类注册成bean对象，并且作为控制器组件
@RequestMapping("/rscompnayctrl")  //给该类配置一个请求映射的url地址ַ
public class RsCompnayController {
	
	 @Autowired //依赖注入
	 RsCompnayMessageService rsCompnayMessageService;
	 
	 //分页查询
	 @RequestMapping("/selectcompnay.do")  //给该类配置一个请求映射的url地址
	public ModelAndView selectCompnay(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum, 
			@RequestParam(defaultValue="10")Integer pageSize,
			RsCompnayMessage rscompnay){
		
		 System.out.println("进入查询公司信息分页方法"+rscompnay);
		 System.out.println("输出最小日期"+rscompnay.getDatemin());
		 System.out.println("输出最大日期"+rscompnay.getDatemax());
		 
		 PageInfo<RsCompnayMessage> page = rsCompnayMessageService.selectRsCompnay(pageNum, pageSize, rscompnay);
		 
		 mav.addObject("p", page);
		 mav.addObject("rscompnay", rscompnay);
		 mav.setViewName("rs/rscompnay-list");  // /WB-INF/rs/rscompnay-list.jsp
		 
		 
		 return mav;
	}
	
	 //跳转添加页面
	 @RequestMapping("/goaddcompnay.do")  //给该类配置一个请求映射的url地址
		public ModelAndView goAddCompnay(ModelAndView mav, 	
				RsCompnayMessage rscompnay){
		 System.out.println("进入添加页面"+rscompnay);
		 //修改
		 if(rscompnay.getCompnayId()!=null){
			 rscompnay=rsCompnayMessageService.getRsCompnay(rscompnay.getCompnayId());
		 }
		 
		 
			 //跳转添加页面 
			 mav.setViewName("rs/rscompnay-add");  // /WB-INF/rs/rscompnay-add.jsp
			 
			 mav.addObject("rscompnay", rscompnay);
			 return mav;
		}
	 
	 //添加
	 @RequestMapping("/addcompnay.do")  //给该类配置一个请求映射的url地址
	 @ResponseBody
	 public Message AddCompnay(ModelAndView mav, 	
				RsCompnayMessage rscompnay){
		 System.out.println("进入添加公司"+rscompnay);
		 if(rscompnay.getCompnayId()!=null){//修改操作
			 rsCompnayMessageService.updateRsCompnay(rscompnay);
		 }else{//添加操作
			 rsCompnayMessageService.addRsCompnay(rscompnay);
		 }
			 //调用添加方法
			 //rsCompnayMessageService.addRsCompnay(rscompnay);
			 return new Message("1", "success", "成功");
		} 
	 
	 
	 //删除
	 @RequestMapping("/deletecompnay.do")  //给该类配置一个请求映射的url地址
	 @ResponseBody
	 public Message deleteCompnay(ModelAndView mav, 	
				RsCompnayMessage rscompnay){
		 System.out.println("进入删除公司"+rscompnay);
			 //调用删除方法
			 rsCompnayMessageService.deleteRsCompnay(rscompnay.getCompnayId());
			return new Message("1", "success", "成功");
		}
	 
	//修改状态
		 @RequestMapping("/enabledcompnay.do")  //给该类配置一个请求映射的url地址
		 @ResponseBody
		 public Message enabledCompnay(ModelAndView mav, 	
					RsCompnayMessage rscompnay){
			 System.out.println("进入删除公司"+rscompnay);
			 if(rscompnay.getCompnayId()!=null){
				 RsCompnayMessage comp=rsCompnayMessageService.getRsCompnay(rscompnay.getCompnayId());
				 comp.setEnabled(rscompnay.getEnabled());
				 rsCompnayMessageService.updateRsCompnay(comp);
			 }
				return new Message("1", "success", "成功");
			}
	 
	 //分页查询
	 @RequestMapping("/showcompnay.do")  //给该类配置一个请求映射的url地址
		public ModelAndView showCompnay(ModelAndView mav,
				RsCompnayMessage rscompnay){
			
			 System.out.println("进入查询公司详情页面");		
				 rscompnay=rsCompnayMessageService.getRsCompnay(rscompnay.getCompnayId());
			 System.out.println("输出"+rscompnay);
			 mav.setViewName("rs/rscompnay-show");  // /WB-INF/rs/rscompnay-list.jsp
			 mav.addObject("rscompnay", rscompnay);
			 
			 return mav;
		}
	 
	 //批量删除
	 @RequestMapping("/deletecompnayall.do")  //给该类配置一个请求映射的url地址
	 @ResponseBody
	 public ModelAndView deleteCompnayall(ModelAndView mav, 	
			 Long[] ids){
		 System.out.println("进入批量删除公司"+Arrays.toString(ids));
		 if(ids!=null&&ids.length>0){
			 for(Long id : ids) {
				 rsCompnayMessageService.deleteRsCompnay(id);
			 }
		 }
			 //调用添加方法
			 
		 mav.setViewName("redirect:selectcompnay.do");//路径：/WEB-INF/test.jsp
			return mav;
		} 
}
