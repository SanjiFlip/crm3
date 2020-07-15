package com.sc.controller;

import java.util.Arrays;
import java.util.Date;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.sc.annotation.MyLog;
import com.sc.entity.Message;
import com.sc.entity.XtUserAccount;
import com.sc.service.XtUserAccountService;

/**
 * 
 * @author Sanji
 * @function 系统用户账户
 */
@Controller
@RequestMapping("/xtaccountctrl")
public class XtUserAccountController {
	
	@Autowired
	XtUserAccountService xtUserAccountService;
	
	@MyLog("查看系统用户账户")
	@RequestMapping("/selectaccount.do")
	public ModelAndView selectAccount(ModelAndView mav,
			@RequestParam(defaultValue="1") Integer pageNum,
			@RequestParam(defaultValue="10") Integer pageSize,
			XtUserAccount xtUserAccount
			) {
		System.out.println("进入分页查询方法了！");
		PageInfo<XtUserAccount> page = xtUserAccountService.selectXtUserAccount(pageNum, pageSize, xtUserAccount);
		System.out.println("参数是："+page);
		mav.addObject("p",page);
		mav.addObject("xtUserAccount",xtUserAccount);
		mav.setViewName("xt/xtaccount_list");  // /WEB-INF/kc/cpdepot-list.jsp
		return mav;
	}
	
	/*
	 * @function 删除方法
	 */
	@MyLog("删除系统用户账户")
	@RequestMapping("/deleteaccount.do")
	@ResponseBody
	public Message deleteAccount(XtUserAccount xtUserAccount) {
		System.out.println("进入到了删除账户方法！");
		xtUserAccountService.deleteXtUserAccount(xtUserAccount.getUserId());
		return new Message("1", "success", "成功");
	}
	
	/*
	 * @function 跳转添加界面 or 跳转修改界面
	 */
	@MyLog(" 跳转添加界面 or 跳转修改界面")
	@RequestMapping("/goaccount.do")
	public ModelAndView goAddAccount(ModelAndView mav,XtUserAccount xtUserAccount) {
		if(xtUserAccount.getUserId()!=null) {
			xtUserAccount = xtUserAccountService.getXtUserAccount(xtUserAccount.getUserId());
		}
		mav.addObject("userAccount",xtUserAccount);
		mav.setViewName("xt/operator_account");
		return mav;
	}
	
	/*
	 * @function 添加用户 or 修改用户
	 */
	@MyLog("添加用户账户 or 修改用户账户")
	@RequestMapping("/operataccount.do")
	@ResponseBody
	public Message operatAccount(XtUserAccount xtUserAccount) {
		if(xtUserAccount.getUserId()!=null) {//修改操作
			xtUserAccountService.updateXtUserAccount(xtUserAccount);	
		}else {//添加操作
			SimpleHash s = new SimpleHash("md5", xtUserAccount.getUserPassword(), "qwerty", 3);
			xtUserAccount.setUserPassword(s.toString());
			xtUserAccountService.addXtUserAccount(xtUserAccount);
		}
		return new Message("1", "success", "成功");	
	}
	
	/*
	 * @function 跳转修改密码界面
	 */
	@MyLog("跳转修改账户密码界面")
	@RequestMapping("/goupdatepass.do")
	public ModelAndView goUpdatePass(ModelAndView mav,XtUserAccount xtUserAccount) {
		XtUserAccount account = xtUserAccountService.getXtUserAccount(xtUserAccount.getUserId());
		mav.addObject("account",account);
		mav.setViewName("xt/change_password");
		return mav;
	}
	
	/*
	 * @function 修改密码方法
	 */
	@MyLog("修改账户密码")
	@RequestMapping("/updatepass.do")
	@ResponseBody
	public Message updatePass(XtUserAccount xtUserAccount) {
		XtUserAccount account = xtUserAccountService.getXtUserAccount(xtUserAccount.getUserId());
		Date date = new Date();
		SimpleHash s = new SimpleHash("md5", xtUserAccount.getUserPassword(), "qwerty", 3);
		System.out.println("修改后的密码为:"+s.toString());
		account.setUserPassword(s.toString());
		//修改密码并修改操作的时间
		account.setLastModifyDate(date);
		xtUserAccountService.updateXtUserAccount(account);
		return new Message("1", "success", "成功");
	}
	
	/*
	 * @function 停用 启用
	 */
	@MyLog("停用/启用账户")
	@RequestMapping("/updatestate.do")
	@ResponseBody
	public Message updateState(XtUserAccount xtUserAccount) {
		if(xtUserAccount.getUserId()!=null&&xtUserAccount.getAccountState()!=null) {
			Date date = new Date();
			System.out.println("进入到修改用户状态方法！"+xtUserAccount);
			XtUserAccount account = xtUserAccountService.getXtUserAccount(xtUserAccount.getUserId());
			//修改状态并，修改时间
			account.setLastModifyDate(date);
			account.setAccountState(xtUserAccount.getAccountState());
			xtUserAccountService.updateXtUserAccount(account);
			return new Message("1", "success", "成功");
		}else {
			return new Message("2", "error", "错误");
		}
	}
	
	/*
	 * @function 批量删除
	 */
	@MyLog("批量删除账户")
	@RequestMapping("/deletemore.do")
	public ModelAndView deleteMore(ModelAndView mav,Long[] ids) {
		System.out.println("进入批量删除用户方法！"+Arrays.toString(ids));
		if (ids!=null&&ids.length>0) {
			for (Long id : ids) {
				xtUserAccountService.deleteXtUserAccount(id);
			}
		}
		mav.setViewName("redirect:selectaccount.do");
		return mav;
	}
}
