package com.sc.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import com.sc.entity.XtUserAccount;
import com.sc.service.XtUserAccountService;

public class CustomRealmMD5 extends AuthorizingRealm {
	
	@Autowired
	XtUserAccountService xtUserAccountService;
	
	
	//用户授权
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection arg0) {
		
		return null;

	}
	
	
	//用户认证֤
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		
		String username = (String) token.getPrincipal();
		System.out.println("当前被认证的用户是:"+username);
		
		
		//1.需要从数据库查询是否有该用户
		XtUserAccount xtUserAccount = xtUserAccountService.login(username);
		if(xtUserAccount == null) {
			System.out.println("不存在此用户");
		}
		//2.该用户的密码
		String password = xtUserAccount.getUserPassword();
		String salt = "qwerty";
		//第一个参数可以是任意类型object
		SimpleAuthenticationInfo info =new SimpleAuthenticationInfo(xtUserAccount, password,ByteSource.Util.bytes(salt), super.getName());
		
		return info;
	}

}
