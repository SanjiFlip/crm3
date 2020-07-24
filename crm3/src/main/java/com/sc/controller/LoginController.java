package com.sc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.io.ResolverUtil.IsA;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sc.annotation.MyLog;
import com.sc.entity.XtRoles;
import com.sc.entity.XtUserAccount;
import com.sc.service.XtRoleService;
import com.sc.service.XtUserAccountService;



@Controller   
@RequestMapping("/loginctrl")
public class LoginController {
	
	@Autowired
	XtRoleService xtRoleService;
	
	@Autowired
	XtUserAccountService xtUserAccountService;
	 
	//登陆控制器
	@RequestMapping("/login.do")
	public ModelAndView login(ModelAndView mav,HttpServletRequest req) {
		System.out.println("登陆失败");
		//获取到回传的错误信息
		String msg = (String) req.getAttribute(FormAuthenticationFilter.DEFAULT_ERROR_KEY_ATTRIBUTE_NAME);
		System.out.println("登陆错误信息是："+msg);
		String fail = "";
		Subject subject = SecurityUtils.getSubject();
		//是否已经登陆
		if(subject.isAuthenticated()){
			subject.logout();
		}else {
			if (msg!=null) {
				if (msg.equals(UnknownAccountException.class.getName())) {
					fail = "unknown";// 未知账户异常
				}else if (msg.equals(IncorrectCredentialsException.class.getName())) {
					fail = "error";
				}else if (msg.equals("randomCodeError")) {
					fail = "code";
				}else if (msg.equals(LockedAccountException.class.getName())) {
					fail = "locked";
				}else {
					fail = "other";
				}
			}
		}
		mav.setViewName("redirect:../login.jsp?isfail="+fail); 
		return mav;
	}
	
	@MyLog("登陆成功")
	@RequestMapping("/main.do")
	public ModelAndView main(ModelAndView mav,HttpSession session) {
		System.out.println("认证成功");
		Subject subject = SecurityUtils.getSubject();
		XtUserAccount xtUserAccount = (XtUserAccount) subject.getPrincipal();
		//获取到单个登陆账户的完整信息
		XtUserAccount account = xtUserAccountService.login(xtUserAccount.getUserName());
		//根据账户id查询账户角色名称
	    XtRoles role = xtRoleService.getXtRplesByUserId(account.getUserId());
	    session.setAttribute("nowrole", role);
		session.setAttribute("nowuser", xtUserAccount);
		mav.setViewName("index"); 
		return mav;
	}
	

}
