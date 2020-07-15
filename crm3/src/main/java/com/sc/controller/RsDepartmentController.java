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



@Controller
@RequestMapping("/rsdeptmentctrl")
public class RsDepartmentController {
	
	@Autowired
	RsDepartmentService rsDepartmentService;
	 
	@RequestMapping("/selectrsdeptment.do")
	public ModelAndView selectDepartment(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum, 
			@RequestParam(defaultValue="10")Integer pageSize,
			RsDepartment rsdepartment){
		
		 PageInfo<RsDepartment> page = rsDepartmentService.selectRsDepartment(pageNum, pageSize, rsdepartment);
		 mav.addObject("p", page);
		 mav.addObject("rsdepartment", rsdepartment);
		 mav.setViewName("rs/rsdepartment-list");  // /WB-INF/rs/rscompnay-list.jsp 
		 return mav;
	}
	

	@RequestMapping("/goaddrsdepartment.do")
	public ModelAndView goAddDepartment(ModelAndView mav, 	
			RsDepartment rsdepartment){
	 System.out.println("获取到的人事部门信息是："+rsdepartment);
	 if(rsdepartment.getDepartmentId()!=null){
		 rsdepartment=rsDepartmentService.getRsDeptment(rsdepartment.getDepartmentId());
	 }
		 mav.setViewName("rs/rsdepartment-add");  // /WB-INF/rs/rscompnay-add.jsp
		 mav.addObject("rsdepartment", rsdepartment);
		 return mav;
	}
	 
	 @RequestMapping("/addrsdepartment.do")
	 @ResponseBody
	 public Message AddDepartment(ModelAndView mav, 	
			 RsDepartment rsdepartment){
		 System.out.println("添加的人事部门信息是："+rsdepartment);
		 if(rsdepartment.getDepartmentId()!=null){
			 rsDepartmentService.updateRsDeptment(rsdepartment);
		 }else{
			 rsDepartmentService.addRsDepartment(rsdepartment);
		 }
		 return new Message("1", "success", "成功");
		}
	 
	 @RequestMapping("/deletedepartment.do")
	 @ResponseBody
	 public Message deleteDepartment(ModelAndView mav, 	
			 RsDepartment rsdepartment){
		 System.out.println("删除的人事部门信息是:"+rsdepartment);
		 rsDepartmentService.deleteRsDeptment(rsdepartment.getDepartmentId());
		 return new Message("1", "success", "成功");
	 }
	 
	@RequestMapping("/showrsdepartment.do")
	public ModelAndView showDepartment(ModelAndView mav,
			 RsDepartment rsdepartment){	
		 rsdepartment=rsDepartmentService.getRsDeptment(rsdepartment.getDepartmentId());
		 System.out.println("展示人事部门详细信息:"+rsdepartment);
		 mav.setViewName("rs/rsdepartment-show");
		 mav.addObject("rsdepartment", rsdepartment);
		 
		 return mav;
	}
	 
	 @RequestMapping("/deletedepartmentall.do")
	 @ResponseBody
	 public ModelAndView deleteDepartmentAll(ModelAndView mav, 	
			 Long[] ids){
		 System.out.println("多个删除人事部门的的ID是:"+Arrays.toString(ids));
		 if(ids!=null&&ids.length>0){
			 for(Long id : ids) {
				 rsDepartmentService.deleteRsDeptment(id);
			 }
		 }
		 
		 mav.setViewName("redirect:selectrsdeptment.do");
		 return mav;
		}	 
}
