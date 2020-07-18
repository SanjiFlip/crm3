package com.sc.controller;


import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.sc.annotation.MyLog;
import com.sc.entity.Message;
import com.sc.entity.RsCompnayMessage;
import com.sc.entity.RsPostMessage;
import com.sc.entity.RsUserMessage;
import com.sc.service.RsCompnayMessageService;
import com.sc.service.RsPostMessageService;
import com.sc.service.RsUserMessageService;



@Controller
@RequestMapping("/rsuserctrl")
public class RsUserController {
	
	@Autowired
	RsUserMessageService rsUserMessageService;
	
	 @Autowired 
	 RsPostMessageService rsPostMessageService;
	 
	 @Autowired 
	 RsCompnayMessageService rsCompnayMessageService;
	 
	@MyLog("分页查询")
	@RequestMapping("/selectuser.do")
	public ModelAndView selectUser(ModelAndView mav,
		 @RequestParam(defaultValue="1")Integer pageNum, 
		 @RequestParam(defaultValue="10")Integer pageSize,
		 RsUserMessage rsuser){
		 System.out.println("获取到的员工信息"+rsuser);
		 PageInfo<RsUserMessage> page = rsUserMessageService.selectRsCompnay(pageNum, pageSize, rsuser);
		 mav.addObject("p", page);
		 mav.addObject("rsuser", rsuser);
		 mav.setViewName("rs/rsuser-list");
		 return mav;
	}
	
	@MyLog("跳转添加/修改员工信息")
 	@RequestMapping("/goadduser.do")
	public ModelAndView goAddUser(ModelAndView mav, 	
			RsUserMessage rsuser, RsCompnayMessage rsCompnay,
			RsPostMessage rspost){
	 if(rsuser.getStaffId()!=null){
		 rsuser=rsUserMessageService.getRsUser(rsuser.getStaffId());
	 }
	 List<RsPostMessage> list =rsPostMessageService.selectPost(); 
	 List<RsCompnayMessage> list1 =rsCompnayMessageService.selectRsCompnay();
	 
	 mav.setViewName("rs/rsuser-add");
	 mav.addObject("rsuser", rsuser);
	 mav.addObject("list", list);
	 mav.addObject("list1", list1);
	 return mav;
	}
	 
	@MyLog("添加/修改员工信息")
	@RequestMapping("/adduser.do")
	@ResponseBody
	public Message AddUser(ModelAndView mav, 	
			RsUserMessage rsuser, MultipartFile upload,  HttpServletRequest req) 
			throws IllegalStateException, IOException{		
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
	 
	@MyLog("删除员工信息")
	 @RequestMapping("/deleteuser.do")
	 @ResponseBody
	 public Message deleteUser(ModelAndView mav, 	
			 RsUserMessage rsuser){
		 rsUserMessageService.deleteRsUser(rsuser.getStaffId());
		 return new Message("1", "success", "成功");
	 }
	 
	@MyLog("查询员工详细信息")
	@RequestMapping("/showuser.do")
	public ModelAndView showUser(ModelAndView mav,
			RsUserMessage rsuser){		
		 rsuser=rsUserMessageService.getRsUser(rsuser.getStaffId());
		 mav.setViewName("rs/rsuser-show");
		 mav.addObject("rsuser", rsuser); 
		 return mav;
	}
	 
	@MyLog("批量删除员工信息")
	@RequestMapping("/deleteuserall.do")
	@ResponseBody
	public ModelAndView deleteCompnayall(ModelAndView mav, 	
			 Long[] ids){
		 System.out.println("鍒犻櫎鐨勫叕鍙窱D鏄�:"+Arrays.toString(ids));
		 if(ids!=null&&ids.length>0){
			 for(Long id : ids) {
				 rsUserMessageService.deleteRsUser(id);
			 }
		 }	 
		 mav.setViewName("redirect:selectuser.do");
		 return mav;
	} 
 
	@MyLog("上传图片")
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
		 
			
		
	@MyLog("员工状态修改")
    @RequestMapping("/staffStateuser.do")
	@ResponseBody
	public Message examineStateUser(ModelAndView mav, 	
			RsUserMessage rsuser){
		System.out.println("鑾峰彇鍒扮殑"+rsuser);
		if(rsuser.getStaffId()!=null){
			RsUserMessage comp=rsUserMessageService.getRsUser(rsuser.getStaffId());
			comp.setStaffState(rsuser.getStaffState());
			rsUserMessageService.updateRsUser(comp);
		}
			return new Message("1", "success", "成功");
	 }
	 
}
