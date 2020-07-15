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
	
	//鐢ㄦ埛鎺堟潈
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection arg0) {
		XtUserAccount account = (XtUserAccount) arg0.getPrimaryPrincipal();
		System.out.println("正在给当前用户授权:");
		//从数据库查询改用户拥有哪些权限
		List<String> list = new ArrayList<String>();
		List<XtPermissionInfo> perms = XtPermissionInfoService.getUserPerm(account.getUserId());
		if (perms!=null&&perms.size()>0) {
			System.out.println("该用户拥有以下权限：");
			for (XtPermissionInfo perm : perms) {
				String code = perm.getPermission();
				if(code!=null&&!code.equals("")) {
					System.out.println("========================="+code);
					list.add(code);//把权限源添加到list集合
				}
			}
		}
		SimpleAuthorizationInfo  info = new SimpleAuthorizationInfo();
		info.addStringPermissions(list);
		return info;

	}
	
	
	//鐢ㄦ埛璁よ瘉证
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		
		String username = (String) token.getPrincipal();
		System.out.println("褰撳墠琚璇佺殑鐢ㄦ埛鏄�:"+username);
		
		
		//1.闇�瑕佷粠鏁版嵁搴撴煡璇㈡槸鍚︽湁璇ョ敤鎴�
		XtUserAccount xtUserAccount = xtUserAccountService.login(username);
		if(xtUserAccount == null) {
			System.out.println("不存在此用户");
			throw new UnknownAccountException(); 
		}
		//2.璇ョ敤鎴风殑瀵嗙爜
		String password = xtUserAccount.getUserPassword();
		String salt = "qwerty";
		if ("已停用".equals(xtUserAccount.getAccountState())) {
			throw new LockedAccountException();
		}
		//第一个参数可以是任意类型object
		SimpleAuthenticationInfo info =new SimpleAuthenticationInfo(xtUserAccount, password,ByteSource.Util.bytes(salt), super.getName());
		return info;
	}

}
