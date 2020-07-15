package com.sc.service;

import com.github.pagehelper.PageInfo;
import com.sc.entity.XtUserAccount;

/**
 * 
 * @param xtUserAccount
 * @return
 */

public interface XtUserAccountService {
	
	XtUserAccount login(String userName);

	void addXtUserAccount(XtUserAccount xtUserAccount);
	
	void updateXtUserAccount(XtUserAccount xtUserAccount);
	
	void deleteXtUserAccount(Long userId);
	
	XtUserAccount getXtUserAccount(Long userId);
	
	PageInfo<XtUserAccount> selectXtUserAccount(Integer pageNum,Integer pageSize,XtUserAccount xtUserAccount);
	
	PageInfo<XtUserAccount> selectByRoleId(Integer pageNum,Integer pageSize,Long roleId);
	
	PageInfo<XtUserAccount> selectByNotRoleId1(Integer pageNum,Integer pageSize,Long roleId);
}
