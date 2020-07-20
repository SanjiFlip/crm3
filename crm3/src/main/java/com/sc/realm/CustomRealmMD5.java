package com.sc.realm;

import java.util.ArrayList;
import java.util.List;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import com.sc.entity.XtPermissionInfo;
import com.sc.entity.XtUserAccount;
import com.sc.service.XtPermissionInfoService;
import com.sc.service.XtUserAccountService;

public class CustomRealmMD5 extends AuthorizingRealm {
	
	@Autowired
	XtUserAccountService xtUserAccountService;
	
	@Autowired
	XtPermissionInfoService XtPermissionInfoService;
	
	//用户授权
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection arg0) {
		XtUserAccount account = (XtUserAccount) arg0.getPrimaryPrincipal();
		System.out.println("正在给用户查询权限:");
		//浠庢暟鎹簱鏌ヨ鏀圭敤鎴锋嫢鏈夊摢浜涙潈闄�
		List<String> list = new ArrayList<String>();
		List<XtPermissionInfo> perms = XtPermissionInfoService.getUserPerm(account.getUserId());
		if (perms!=null&&perms.size()>0) {
			System.out.println("用户的权限如下");
			for (XtPermissionInfo perm : perms) {
				String code = perm.getPermission();
				if(code!=null&&!code.equals("")) {
					System.out.println("========================="+code);
					list.add(code);
				}
			}
		}
		SimpleAuthorizationInfo  info = new SimpleAuthorizationInfo();
		info.addStringPermissions(list);
		return info;

	}
	
	
	//用户认证
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		
		String username = (String) token.getPrincipal();
		System.out.println("认证的用户名是:"+username);
		XtUserAccount xtUserAccount = xtUserAccountService.login(username);
		if(xtUserAccount == null) {
			throw new UnknownAccountException(); 
		}
		String password = xtUserAccount.getUserPassword();
		String salt = "qwerty";
		if ("已禁用".equals(xtUserAccount.getAccountState())) {
			throw new LockedAccountException();
		}
		SimpleAuthenticationInfo info =new SimpleAuthenticationInfo(xtUserAccount, password,ByteSource.Util.bytes(salt), super.getName());
		return info;
	}

}
