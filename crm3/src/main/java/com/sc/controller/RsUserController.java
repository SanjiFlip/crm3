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
import com.sc.entity.RsCompnayMessage;
import com.sc.entity.RsUserMessage;
import com.sc.service.RsUserMessageService;
//人事——员工信息表控制器


@Controller   //把该类注册成bean对象，并且作为控制器组件
@RequestMapping("/rsuserctrl")  //给该类配置一个请求映射的url地址ַ
public class RsUserController {
	
	@Autowired //依赖注入
	 RsUserMessageService rsUserMessageService;
	 
	 //分页查询
	 @RequestMapping("/selectuser.do")  //给该类配置一个请求映射的url地址
	public ModelAndView selectUser(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum, 
			@RequestParam(defaultValue="10")Integer pageSize,
			RsUserMessage rsuser){
		 
		 System.out.println("进入查询员工信息分页方法"+rsuser);
		 System.out.println("输出最小日期"+rsuser.getDatemin());
		 System.out.println("输出最大日期"+rsuser.getDatemax());
		 
		 PageInfo<RsUserMessage> page = rsUserMessageService.selectRsCompnay(pageNum, pageSize, rsuser);
		 
		 mav.addObject("p", page);
		 mav.addObject("rsuser", rsuser);
		 mav.setViewName("rs/rsuser-list");  // /WB-INF/rs/rscompnay-list.jsp
		 
		 
		 return mav;
	}
	
	 //跳转添加页面
	 @RequestMapping("/goadduser.do")  //给该类配置一个请求映射的url地址
		public ModelAndView goAddUser(ModelAndView mav, 	
				RsUserMessage rsuser){
		 System.out.println("进入添加员工信息页面"+rsuser);
		 //修改
		 if(rsuser.getStaffId()!=null){
			 rsuser=rsUserMessageService.getRsUser(rsuser.getStaffId());
		 }
		 
		 
			 //跳转添加页面 
			 mav.setViewName("rs/rsuser-add");  // /WB-INF/rs/rscompnay-add.jsp
			 
			 mav.addObject("rsuser", rsuser);
			 return mav;
		}
	 
	 //添加
	 @RequestMapping("/adduser.do")  //给该类配置一个请求映射的url地址
	 @ResponseBody
	 public Message AddUser(ModelAndView mav, 	
			 RsUserMessage rsuser, MultipartFile upload,  HttpServletRequest req) throws IllegalStateException, IOException{
		 System.out.println("进入添加员工"+rsuser);
		
		 if(rsuser.getStaffId()!=null){//修改操作
			 if(upload!=null){
					//获取文件名称
					String name=upload.getOriginalFilename();
					if(name!=null&&!name.equals("")){
						//获取服务器中工程的upload文件夹的路径
						String path=req.getServletContext().getRealPath("upload");
					    //生成新的文件名，形如5435432543.jpg
						name=System.currentTimeMillis()
								+name.substring(name.lastIndexOf("."));
						System.out.println(path+"/"+name);
						File file=new File(path+"/"+name);
						upload.transferTo(file);//另存为
						System.out.println("获取name"+name);
						rsuser.setStaffPhoto(name);
					}
			 }
			 System.out.println("进入修改方法"+rsuser);
			 rsUserMessageService.updateRsUser(rsuser);
		 }else{//添加操作
			 if(upload!=null){
					//获取文件名称
					String name=upload.getOriginalFilename();
					if(name!=null&&!name.equals("")){
						//获取服务器中工程的upload文件夹的路径
						String path=req.getServletContext().getRealPath("upload");
					    //生成新的文件名，形如5435432543.jpg
						name=System.currentTimeMillis()
								+name.substring(name.lastIndexOf("."));
						System.out.println(path+"/"+name);
						File file=new File(path+"/"+name);
						upload.transferTo(file);//另存为
						System.out.println("获取name"+name);
						rsuser.setStaffPhoto(name);
					}
			 }
			 System.out.println("进入添加方法"+rsuser);
			 rsUserMessageService.addRsUser(rsuser);
		 }
			 //调用添加方法
		 //rsUserMessageService.addRsUser(rsuser);
		 return new Message("1", "success", "成功");
		 
		}
	 
	 //删除
	 @RequestMapping("/deleteuser.do")  //给该类配置一个请求映射的url地址
	 @ResponseBody
	 public Message deleteUser(ModelAndView mav, 	
			 RsUserMessage rsuser){
		 System.out.println("进入删除员工"+rsuser);
			 //调用添加方法
		 rsUserMessageService.deleteRsUser(rsuser.getStaffId());
			return new Message("1", "success", "成功");
		}
	 
	 
	 //分页查询
	 @RequestMapping("/showuser.do")  //给该类配置一个请求映射的url地址
		public ModelAndView showUser(ModelAndView mav,
				RsUserMessage rsuser){
			
			 System.out.println("进入查询员工详情页面");		
			 rsuser=rsUserMessageService.getRsUser(rsuser.getStaffId());
			 System.out.println("输出"+rsuser);
			 mav.setViewName("rs/rsuser-show");  // /WB-INF/rs/rscompnay-list.jsp
			 mav.addObject("rsuser", rsuser);
			 
			 return mav;
		}
	 
	 
	//批量删除
		 @RequestMapping("/deleteuserall.do")  //给该类配置一个请求映射的url地址
		 @ResponseBody
		 public ModelAndView deleteCompnayall(ModelAndView mav, 	
				 Long[] ids){
			 System.out.println("进入批量删除公司"+Arrays.toString(ids));
			 if(ids!=null&&ids.length>0){
				 for(Long id : ids) {
					 rsUserMessageService.deleteRsUser(id);
				 }
			 }
				 //调用添加方法
				 
			 mav.setViewName("redirect:selectuser.do");//路径：/WEB-INF/test.jsp
				return mav;
			} 
	 
		
		 @RequestMapping("/upload.do")
			public ModelAndView upload(ModelAndView mav,
					MultipartFile upload,
					HttpServletRequest req) throws IllegalStateException, IOException{
				System.out.println("2、进入控制器的列表方法了");	
				if(upload!=null){
					//获取文件名称
					String name=upload.getOriginalFilename();
					if(name!=null&&!name.equals("")){
						//获取服务器中工程的upload文件夹的路径
						String path=req.getServletContext().getRealPath("upload");
					    //生成新的文件名，形如5435432543.jpg
						name=System.currentTimeMillis()
								+name.substring(name.lastIndexOf("."));
						System.out.println(path+"/"+name);
						File file=new File(path+"/"+name);
						upload.transferTo(file);//另存为
						//把文件名存入模型
						mav.addObject("name",name);
					}
				}
				
				mav.setViewName("redirect:goadduser.do");//路径：/WEB-INF/success.jsp
				return mav;
			}
		 
		//修改审核状态
		 @RequestMapping("/examineStateuser.do")  //给该类配置一个请求映射的url地址
		 @ResponseBody
		 public Message examineStateUser(ModelAndView mav, 	
				 RsUserMessage rsuser){
			 System.out.println("进入删除公司"+rsuser);
			 if(rsuser.getStaffId()!=null){
				 RsUserMessage comp=rsUserMessageService.getRsUser(rsuser.getStaffId());
				 comp.setExamineState(rsuser.getExamineState());
				 rsUserMessageService.updateRsUser(comp);
			 }
				return new Message("1", "success", "成功");
			}
		 
		 
		//修改员工状态
		 @RequestMapping("/staffStateuser.do")  //给该类配置一个请求映射的url地址
		 @ResponseBody
		 public Message staffStateUser(ModelAndView mav, 	
				 RsUserMessage rsuser){
			 System.out.println("进入删除公司"+rsuser);
			 if(rsuser.getStaffId()!=null){
				 RsUserMessage comp=rsUserMessageService.getRsUser(rsuser.getStaffId());
				 comp.setStaffState(rsuser.getStaffState());
				 rsUserMessageService.updateRsUser(comp);
			 }
				return new Message("1", "success", "成功");
			}
	 
}
