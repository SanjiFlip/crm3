package com.sc.controller;


import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.sc.entity.Message;
import com.sc.entity.RsUserMessage;
import com.sc.service.RsUserMessageService;



@Controller
@RequestMapping("/rsuserctrl")
public class RsUserController {
	
	@Autowired
	RsUserMessageService rsUserMessageService;
	 

	@RequestMapping("/selectuser.do")
	public ModelAndView selectUser(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum, 
			@RequestParam(defaultValue="10")Integer pageSize,
			RsUserMessage rsuser){
		 PageInfo<RsUserMessage> page = rsUserMessageService.selectRsCompnay(pageNum, pageSize, rsuser);
		 mav.addObject("p", page);
		 mav.addObject("rsuser", rsuser);
		 mav.setViewName("rs/rsuser-list");
		 return mav;
	}
	

 	@RequestMapping("/goadduser.do")
	public ModelAndView goAddUser(ModelAndView mav, 	
			RsUserMessage rsuser){
	 if(rsuser.getStaffId()!=null){
		 rsuser=rsUserMessageService.getRsUser(rsuser.getStaffId());
	 }
	 
	 mav.setViewName("rs/rsuser-add");
	 mav.addObject("rsuser", rsuser);
	 return mav;
	}
	 

	 @RequestMapping("/adduser.do")
	 @ResponseBody
	 public Message AddUser(ModelAndView mav, 	
			 RsUserMessage rsuser, MultipartFile upload,  HttpServletRequest req) throws IllegalStateException, IOException{
		
		 if(rsuser.getStaffId()!=null){
			 if(upload!=null){
					String name=upload.getOriginalFilename();
					if(name!=null&&!name.equals("")){
						String path=req.getServletContext().getRealPath("upload");
						name=System.currentTimeMillis()
								+name.substring(name.lastIndexOf("."));
						System.out.println(path+"/"+name);
						File file=new File(path+"/"+name);
						upload.transferTo(file);
						rsuser.setStaffPhoto(name);
					}
			 }
			 rsUserMessageService.updateRsUser(rsuser);
		 }else{
			 if(upload!=null){
					String name=upload.getOriginalFilename();
					if(name!=null&&!name.equals("")){
						String path=req.getServletContext().getRealPath("upload");
						name=System.currentTimeMillis()
								+name.substring(name.lastIndexOf("."));
						System.out.println(path+"/"+name);
						File file=new File(path+"/"+name);
						upload.transferTo(file);
						rsuser.setStaffPhoto(name);
					}
			 }
			 rsUserMessageService.addRsUser(rsuser);
		 }
		 return new Message("1", "success", "成功"); 
		}
	 

	 @RequestMapping("/deleteuser.do")
	 @ResponseBody
	 public Message deleteUser(ModelAndView mav, 	
			 RsUserMessage rsuser){
		 rsUserMessageService.deleteRsUser(rsuser.getStaffId());
		 return new Message("1", "success", "鎴愬姛");
	 }
	 
	 
	@RequestMapping("/showuser.do")
	public ModelAndView showUser(ModelAndView mav,
			RsUserMessage rsuser){		
		 rsuser=rsUserMessageService.getRsUser(rsuser.getStaffId());
		 mav.setViewName("rs/rsuser-show");
		 mav.addObject("rsuser", rsuser); 
		 return mav;
	}
	 
	
	 @RequestMapping("/deleteuserall.do")
	 @ResponseBody
	 public ModelAndView deleteCompnayall(ModelAndView mav, 	
			 Long[] ids){
		 System.out.println("删除的公司ID是:"+Arrays.toString(ids));
		 if(ids!=null&&ids.length>0){
			 for(Long id : ids) {
				 rsUserMessageService.deleteRsUser(id);
			 }
		 }	 
		 mav.setViewName("redirect:selectuser.do");
		 return mav;
	 } 
 
		
		@RequestMapping("/upload.do")
		public ModelAndView upload(ModelAndView mav,
				MultipartFile upload,
				HttpServletRequest req) throws IllegalStateException, IOException{
			if(upload!=null){
				String name=upload.getOriginalFilename();
				if(name!=null&&!name.equals("")){
					String path=req.getServletContext().getRealPath("upload");
					name=System.currentTimeMillis()
							+name.substring(name.lastIndexOf("."));
					System.out.println(path+"/"+name);
					File file=new File(path+"/"+name);
					upload.transferTo(file);
					mav.addObject("name",name);
				}
			}
			
			mav.setViewName("redirect:goadduser.do");
			return mav;
		}
		 
	 @RequestMapping("/examineStateuser.do")
	 @ResponseBody
	 public Message examineStateUser(ModelAndView mav, 	
			 RsUserMessage rsuser){
		 System.out.println("人事用户信息是:"+rsuser);
		 if(rsuser.getStaffId()!=null){
			 RsUserMessage comp=rsUserMessageService.getRsUser(rsuser.getStaffId());
			 comp.setExamineState(rsuser.getExamineState());
			 rsUserMessageService.updateRsUser(comp);
		 }
			return new Message("1", "success", "成功");
	  }
		 
		 
	 @RequestMapping("/staffStateuser.do")
	 @ResponseBody
	 public Message staffStateUser(ModelAndView mav, 	
			 RsUserMessage rsuser){
		 if(rsuser.getStaffId()!=null){
			 RsUserMessage comp=rsUserMessageService.getRsUser(rsuser.getStaffId());
			 comp.setStaffState(rsuser.getStaffState());
			 rsUserMessageService.updateRsUser(comp);
		 }
			return new Message("1", "success", "成功");
	}
	 
}
