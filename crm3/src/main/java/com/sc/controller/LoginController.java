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
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sc.annotation.MyLog;
import com.sc.entity.XtUserAccount;



@Controller   //鎶婅绫绘敞鍐屾垚bean瀵硅薄锛屽苟涓斾綔涓烘帶鍒跺櫒缁勪欢
@RequestMapping("/loginctrl")  //缁欒绫婚厤缃竴涓姹傛槧灏勭殑url鍦板潃址
public class LoginController {
	
	 
	//鐧婚檰澶辫触鐨勬柟娉�
	@RequestMapping("/login.do")
	public ModelAndView login(ModelAndView mav,HttpServletRequest req) {
		System.out.println("鐢ㄦ埛璁よ瘉澶辫触");
		//閫氳繃璁よ瘉澶辫触鐨勫睘鎬у悕绉拌幏鍙栧搴旂殑鍊贾�
		String msg = (String) req.getAttribute(FormAuthenticationFilter.DEFAULT_ERROR_KEY_ATTRIBUTE_NAME);
		System.out.println("璁よ瘉澶辫触鐨勬秷鎭�"+msg);
		String fail = "";
		boolean reLogin = true;//重新登录
		Subject subject = SecurityUtils.getSubject();
		//判断是否重新登录
		if(subject.isAuthenticated()){
			subject.logout();
		}else {
			if (msg!=null) {
				if (msg.equals(UnknownAccountException.class.getName())) {
					fail = "unknown";//账户不存在
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
	
	@MyLog("用户登录成功")
	@RequestMapping("/main.do")
	public ModelAndView main(ModelAndView mav,HttpSession session) {
		System.out.println("鐢ㄦ埛璁よ瘉鎴愬姛");
		
		Subject subject = SecurityUtils.getSubject();
		XtUserAccount xtUserAccount = (XtUserAccount) subject.getPrincipal();
		session.setAttribute("nowuser", xtUserAccount);
		
		mav.setViewName("redirect:../index.jsp"); 
		return mav;
	}
	

}
