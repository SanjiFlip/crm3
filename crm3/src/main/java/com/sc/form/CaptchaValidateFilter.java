package com.sc.form;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;

import com.google.code.kaptcha.Constants;

//另外一种验证码生成方式
public class CaptchaValidateFilter extends FormAuthenticationFilter {
	@Override
	protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {
		System.out.println("我进入验证码匹配阶段！");
		//Session session = SecurityUtils.getSubject().getSession();
		HttpServletRequest req=(HttpServletRequest) request;
		String code1 = req.getParameter("randomcode");
		System.out.println("用户输入的验证码:"+code1);
		String code2 = (String)req.getSession().getAttribute(Constants.KAPTCHA_SESSION_KEY);
		System.out.println("系统生成的验证码是:"+code2);
		if(code1==null||code2==null) {
			req.setAttribute(FormAuthenticationFilter.DEFAULT_ERROR_KEY_ATTRIBUTE_NAME, "randomCodeError");
			return true;
		}else {
			if(!code1.equals(code2)) {
				req.setAttribute(FormAuthenticationFilter.DEFAULT_ERROR_KEY_ATTRIBUTE_NAME, "randomCodeError");
				return true;
			}
		}

		return super.onAccessDenied(request, response);
	}
}