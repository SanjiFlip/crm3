package com.sc.controller;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.sc.annotation.MyLog;
import com.sc.entity.Message;
import com.sc.entity.XtPermissionColumns;
import com.sc.entity.XtPermissionInfo;
import com.sc.entity.XtPermissonRole;
import com.sc.entity.XtRoles;
import com.sc.entity.XtUserAccount;
import com.sc.entity.XtUserRole;
import com.sc.service.XtPermissionColumnsService;
import com.sc.service.XtPermissionInfoService;
import com.sc.service.XtPermissionRoleService;
import com.sc.service.XtRoleService;
import com.sc.service.XtUserAccountService;
import com.sc.service.XtUserRoleService;

@Controller
@RequestMapping("/xtrolectrl")
public class XtRoleController {
	
	@Autowired
	XtRoleService xtRoleService;
	
	@Autowired
	XtUserAccountService xtUserAccountService;
	
	@Autowired
	XtUserRoleService xtUserRoleService;
	
	@Autowired
	XtPermissionColumnsService xtPermissionColumnsService;
	
	@Autowired
	XtPermissionInfoService xtPermissionInfoService;
	
	@Autowired
	XtPermissionRoleService xtPermissionRoleService;
	
	@MyLog("�鿴ϵͳ��ɫ")
	@RequestMapping("/selectxtrole.do")
	public ModelAndView selectXtRole(ModelAndView mav,
			@RequestParam(defaultValue="1") Integer pageNum,
			@RequestParam(defaultValue="10") Integer pageSize,
			XtRoles xtRoles
			) {
		PageInfo<XtRoles> page = xtRoleService.selectXtRoles(pageNum, pageSize, null);
		mav.addObject("p",page);
		mav.setViewName("xt/xtrole_list");
		return mav;
	}
	
	@MyLog("ɾ��ϵͳ��ɫ")
	@RequestMapping("/deletextrole.do")
	@ResponseBody
	public Message deleteRole(Long roleId) {
		System.out.println("���뵽��ɾ���˻�������");
		xtRoleService.deleteXtRole(roleId);
		xtUserRoleService.deleteXtUserRoleByRoleId(roleId);
		return new Message("1", "success", "�ɹ�");
	}
	
	@MyLog("����ɾ��ϵͳ��ɫ")
	@RequestMapping("/deletemore.do")
	public ModelAndView deleteMore(ModelAndView mav,Long[] ids) {
		if (ids!=null&&ids.length>0) {
			for (Long id : ids) {
				xtRoleService.deleteXtRole(id);
				xtUserRoleService.deleteXtUserRoleByRoleId(id);
			}
		}
		mav.setViewName("redirect:selectxtrole.do");
		return mav;
	}
	
	
	@MyLog("��ת���ϵͳ��ɫ")
	@RequestMapping("/goaddxtrole.do")
	public ModelAndView goaddXtRole(ModelAndView mav) {
		List<XtRoles> list = xtRoleService.selectAllRole();
		mav.addObject("roles",list);
		mav.setViewName("xt/add_role");
		return mav;
	}
	
	@MyLog("���ϵͳ��ɫ")
	@RequestMapping("/addxtrole.do")
	public Message addXtRole(XtRoles xtRoles) {
		XtUserAccount account = (XtUserAccount) SecurityUtils.getSubject().getPrincipal();
		xtRoles.setOperator(account.getUserName());
		xtRoleService.addXtRole(xtRoles);
		return new Message("1", "success", "�ɹ�");	
	}
	
	@MyLog("�鿴��ǰ��ɫ���³�Ա")
	@RequestMapping("/selectrolemem.do")
	public ModelAndView selectRoleMember(ModelAndView mav,
			@RequestParam(defaultValue="1") Integer pageNum,
			@RequestParam(defaultValue="10") Integer pageSize,
			Long roleId) {
		PageInfo<XtUserAccount> page = xtUserAccountService.selectByRoleId(pageNum, pageSize, roleId);
		mav.addObject("p",page);
		mav.addObject("roleId",roleId);
		mav.setViewName("xt/find_role");
		return mav;
	}
	
	@MyLog("�鿴��ǰ��ɫ���²����ڳ�Ա")
	@RequestMapping("/selectnotrole.do")
	public ModelAndView selectNotRoleMember(ModelAndView mav,
			@RequestParam(defaultValue="1") Integer pageNum,
			@RequestParam(defaultValue="10") Integer pageSize,
			Long roleId) {
		PageInfo<XtUserAccount> page = xtUserAccountService.selectByNotRoleId1(pageNum, pageSize, roleId);
		mav.addObject("p",page);
		mav.addObject("roleId",roleId);
		mav.setViewName("xt/add_roles");
		return mav;
	}
	
	@MyLog("�����ɫ")
	@RequestMapping("/giverole.do")
	public ModelAndView giveRole(ModelAndView mav,Long[] ids,Long roleId) {
		Date date = new Date();
		XtUserAccount account = (XtUserAccount) SecurityUtils.getSubject().getPrincipal();
		XtUserAccount xtUserAccount = xtUserAccountService.login(account.getUserName());
		if(ids!=null&&ids.length>0) {
			for (Long id : ids) {
				List<XtUserRole> list = xtUserRoleService.selectByUserId(id);
				if(list!=null&&list.size()>0) {
					for (XtUserRole role : list) {
						xtUserRoleService.deleteXtUserRole(role.getId());
					}
				}	
				XtUserRole role2 = new XtUserRole();
				role2.setUserId(id);
				role2.setRoleId(roleId);
				role2.setOperaterId(xtUserAccount.getUserId());
				role2.setLastModifyDate(date);
				xtUserRoleService.addXtUserRole(role2);
			}
		}
		mav.setViewName("redirect:selectnotrole.do?roleId="+roleId);
		return mav;
	}
	
	@MyLog("��תȨ�޹������")
	@RequestMapping("/gorolemanage.do")
	public ModelAndView goRoleManage(ModelAndView mav,Long roleId) {
		List<XtPermissionColumns> list1 = xtPermissionColumnsService.selectAll();
		//Ȩ�޼���
		List<XtPermissionInfo> list2 = xtPermissionInfoService.selectInfo();
		//Ȩ��ѡ�м���
		List<XtPermissionInfo> list3 = xtPermissionInfoService.checkInfos(roleId);
		//Ȩ����һЩѡ������
		for (XtPermissionInfo info1 : list2) {
				for (XtPermissionInfo obj : list3) {
					if(obj != null) {
						if(info1.getPermissonId() == obj.getPermissonId()) {
							info1.setChecked(true);
							break;
						}
					}
				}
		}
		mav.addObject("list1",list1);
		mav.addObject("list2",list2);
		mav.addObject("roleId",roleId);
		mav.setViewName("xt/role_manage");
		return mav;
	}
	
	@MyLog("���Ȩ��")
	@RequestMapping("/rolemanage.do")
	@ResponseBody
	public Message roleManage(ModelAndView mav,Long roleId,Long[] permissonIds) {
		System.out.println("ѡ�е�Ȩ��IDΪ:"+Arrays.toString(permissonIds));
		List<XtPermissionInfo> list = xtPermissionInfoService.checkInfos(roleId); //��ǰ��ɫ����Ȩ��
		XtUserAccount account = (XtUserAccount) SecurityUtils.getSubject().getPrincipal();	//��ȡ�˻���Ϣ
		XtUserAccount xtUserAccount = xtUserAccountService.login(account.getUserName());	//��ȡ�û�������Ϣ
		Date d = new Date();
		if (permissonIds!=null&&permissonIds.length>0) { 
			try {
				if (list != null&&list.size()>0) {
					for (XtPermissionInfo info : list) {//ɾ��֮ǰ���е�Ȩ��
						if (info.getPermissonId()!=null&&info!=null) {
							xtPermissionRoleService.deleteXtPermissionRole(info.getPermissonId(), roleId);
						}		
					}
				}
			}catch(NullPointerException e) {
//				e.printStackTrace();
			}
			for (Long pid : permissonIds) {//���ѡ�е�����Ȩ��
				XtPermissonRole permrole = new XtPermissonRole();
				permrole.setRoleId(roleId);
				permrole.setPermissonId(pid);
				permrole.setOperaterId(xtUserAccount.getUserId());
				permrole.setLastModifyDate(d);
				xtPermissionRoleService.addXtPermissionRole(permrole);
			}
		}		
		return new Message("1", "success", "�ɹ�");
	}
}
