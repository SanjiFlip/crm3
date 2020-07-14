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
import com.sc.entity.RsDepartment;
import com.sc.service.RsDepartmentService;
//人事——部门信息表控制器


@Controller   //把该类注册成bean对象，并且作为控制器组件
@RequestMapping("/rsdeptmentctrl")  //给该类配置一个请求映射的url地址ַ
public class RsDepartmentController {
	
	 @Autowired //依赖注入
	 RsDepartmentService rsDepartmentService;
	 
	 //分页查询
	 @RequestMapping("/selectrsdeptment.do")  //给该类配置一个请求映射的url地址
	public ModelAndView selectDepartment(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum, 
			@RequestParam(defaultValue="10")Integer pageSize,
			RsDepartment rsdepartment){
		
		 System.out.println("进入查询部门信息分页方法"+rsdepartment);
		 System.out.println("输出最小日期"+rsdepartment.getDatemin());
		 System.out.println("输出最大日期"+rsdepartment.getDatemax());
		 
		 PageInfo<RsDepartment> page = rsDepartmentService.selectRsDepartment(pageNum, pageSize, rsdepartment);
		 
		 mav.addObject("p", page);
		 mav.addObject("rsdepartment", rsdepartment);
		 mav.setViewName("rs/rsdepartment-list");  // /WB-INF/rs/rscompnay-list.jsp
		 
		 
		 return mav;
	}
	
	 //跳转添加页面
	 @RequestMapping("/goaddrsdepartment.do")  //给该类配置一个请求映射的url地址
		public ModelAndView goAddDepartment(ModelAndView mav, 	
				RsDepartment rsdepartment){
		 System.out.println("进入添加页面"+rsdepartment);
		 //修改
		 if(rsdepartment.getDepartmentId()!=null){
			 rsdepartment=rsDepartmentService.getRsDeptment(rsdepartment.getDepartmentId());
		 }
		 
		 
			 //跳转添加页面 
			 mav.setViewName("rs/rsdepartment-add");  // /WB-INF/rs/rscompnay-add.jsp
			 
			 mav.addObject("rsdepartment", rsdepartment);
			 return mav;
		}
	 
	 //添加
	 @RequestMapping("/addrsdepartment.do")  //给该类配置一个请求映射的url地址
	 @ResponseBody
	 public Message AddDepartment(ModelAndView mav, 	
			 RsDepartment rsdepartment){
		 System.out.println("进入添加部门"+rsdepartment);
		 if(rsdepartment.getDepartmentId()!=null){//修改操作
			 rsDepartmentService.updateRsDeptment(rsdepartment);
		 }else{//添加操作
			 rsDepartmentService.addRsDepartment(rsdepartment);
		 }
			 //调用添加方法
		 //rsDepartmentService.addRsDepartment(rsdepartment);
			 return new Message("1", "success", "成功");
		}
	 
	 //删除
	 @RequestMapping("/deletedepartment.do")  //给该类配置一个请求映射的url地址
	 @ResponseBody
	 public Message deleteDepartment(ModelAndView mav, 	
			 RsDepartment rsdepartment){
		 System.out.println("进入删除公司"+rsdepartment);
			 //调用添加方法
		 rsDepartmentService.deleteRsDeptment(rsdepartment.getDepartmentId());
			return new Message("1", "success", "成功");
		}
	 
	 
	 //分页查询
	 @RequestMapping("/showrsdepartment.do")  //给该类配置一个请求映射的url地址
		public ModelAndView showDepartment(ModelAndView mav,
				 RsDepartment rsdepartment){
			
			 System.out.println("进入查询部门详情页面");		
			 rsdepartment=rsDepartmentService.getRsDeptment(rsdepartment.getDepartmentId());
			 System.out.println("输出"+rsdepartment);
			 mav.setViewName("rs/rsdepartment-show");  // /WB-INF/rs/rscompnay-list.jsp
			 mav.addObject("rsdepartment", rsdepartment);
			 
			 return mav;
		}
	 
	//批量删除
		 @RequestMapping("/deletedepartmentall.do")  //给该类配置一个请求映射的url地址
		 @ResponseBody
		 public ModelAndView deleteDepartmentAll(ModelAndView mav, 	
				 Long[] ids){
			 System.out.println("进入批量删除公司"+Arrays.toString(ids));
			 if(ids!=null&&ids.length>0){
				 for(Long id : ids) {//调用批量删除
					 rsDepartmentService.deleteRsDeptment(id);
				 }
			 }
			 
			 mav.setViewName("redirect:selectrsdeptment.do");//路径：/WEB-INF/test.jsp
				return mav;
			}	 
}
