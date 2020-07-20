package com.sc.config;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.Filter;

import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.filter.authc.LogoutFilter;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sc.entity.XtPermissionInfo;
import com.sc.form.CaptchaValidateFilter;
import com.sc.realm.CustomRealmMD5;
import com.sc.service.XtPermissionInfoService;

@Configuration  
public class ShiroConfig {
	
	@Autowired
	XtPermissionInfoService xtPermissionInfoService;
	

	@Bean
	public CustomRealmMD5 customRealmMD5() {
		CustomRealmMD5 realm = new CustomRealmMD5();
		HashedCredentialsMatcher matcher = new HashedCredentialsMatcher();
		matcher.setHashAlgorithmName("md5");
		matcher.setHashIterations(3);
		realm.setCredentialsMatcher(matcher);
		return realm;
	}
	

	@Bean
	public SecurityManager securityManager() {
		DefaultWebSecurityManager manager = new DefaultWebSecurityManager();
		manager.setRealm(this.customRealmMD5());
		return manager;
	}
	

	@Bean("shiroFilter")
	public ShiroFilterFactoryBean shiroFilter() {
		CaptchaValidateFilter form = new CaptchaValidateFilter();
		form.setLoginUrl("/loginctrl/login.do");
		form.setUsernameParam("userName");
		form.setPasswordParam("userPassword");
		
		ShiroFilterFactoryBean shiroFilter = new ShiroFilterFactoryBean();
		shiroFilter.setSecurityManager(this.securityManager());
		shiroFilter.setLoginUrl("/login.jsp");
		shiroFilter.setSuccessUrl("/loginctrl/main.do");
		shiroFilter.setUnauthorizedUrl("/nopermission.jsp");
		
		
		LogoutFilter logout = new LogoutFilter();
		logout.setRedirectUrl("/login.jsp");
		
		Map<String, Filter> filters = new HashMap<String, Filter>();
		filters.put("authc", form);
		filters.put("logout", logout);
		shiroFilter.setFilters(filters);
		

		Map<String, String> map = new LinkedHashMap<String, String>();
		map.put("/css/**", "anon");
		map.put("/images/**", "anon");
		map.put("/js/**", "anon");
		map.put("/sql/**", "anon");
		map.put("/upload/**", "anon");
		map.put("/login.jsp", "anon");
		map.put("/main.jsp", "anon");
		map.put("/captcha/**", "anon");	
		map.put("/static/**", "anon");
		map.put("/lib/**", "anon");
		map.put("/temp/**", "anon");
		map.put("/logout.do", "logout");
		List<XtPermissionInfo> list = xtPermissionInfoService.selectAllPerm();
		if (list!=null&&list.size()>0) {
			System.out.println("所有权限并设置如下:");
			for (XtPermissionInfo perm : list) {
				String url = perm.getPermissonName();
				String code = perm.getPermission();
				if (url!=null&&code!=null) {
					map.put(url, "perms["+code+"]");
				}	
			}
		}
		map.put("/**", "authc");
		shiroFilter.setFilterChainDefinitionMap(map);
		return shiroFilter;	
	}
}
