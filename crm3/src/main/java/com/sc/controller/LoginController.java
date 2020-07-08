package com.sc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sc.entity.XtUserAccount;



@Controller   //把该类注册成bean对象，并且作为控制器组件
@RequestMapping("/loginctrl")  //给该类配置一个请求映射的url地址
public class LoginController {
	
	 
	//登陆失败的方法
	@RequestMapping("/login.do")
	public ModelAndView login(ModelAndView mav,HttpServletRequest req) {
		System.out.println("用户认证失败");
		//通过认证失败的属性名称获取对应的值
		String msg = (String) req.getAttribute(FormAuthenticationFilter.DEFAULT_ERROR_KEY_ATTRIBUTE_NAME);
		System.out.println("认证失败的消息："+msg);
		String fail = "";
		if (msg!=null) {
			if (msg.equals(UnknownAccountException.class.getName())) {
				fail = "unknown";//账户不存在
			}else if (msg.equals(IncorrectCredentialsException.class.getName())) {
				fail = "error";
			}else if (msg.equals("randomCodeError")) {
				fail = "code";
			}else {
				fail = "other";
			}
		}
		mav.setViewName("redirect:../login.jsp?isfail="+fail); 
		return mav;
	}
	
	@RequestMapping("/main.do")
	public ModelAndView main(ModelAndView mav,HttpSession session) {
		System.out.println("用户认证成功");
		
		Subject subject = SecurityUtils.getSubject();
		XtUserAccount xtUserAccount = (XtUserAccount) subject.getPrincipal();
		session.setAttribute("nowuser", xtUserAccount);
		
		mav.setViewName("redirect:../index.jsp"); 
		return mav;
	}
	

}
