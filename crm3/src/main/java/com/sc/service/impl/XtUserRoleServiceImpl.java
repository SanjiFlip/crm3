package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.XtUserRole;
import com.sc.entity.XtUserRoleExample;
import com.sc.entity.XtUserRoleExample.Criteria;
import com.sc.mapper.XtUserRoleMapper;
import com.sc.service.XtUserRoleService;

/**
 * 
 * @author Sanji
 *
 */
@Service
public class XtUserRoleServiceImpl implements XtUserRoleService {
	
	@Autowired
	XtUserRoleMapper xtUserRoleMapper;
	
	/**
	 * @function ����û���ɫ
	 */
	@Override
	@Transactional(rollbackFor = Exception.class)
	public void addXtUserRole(XtUserRole xtUserRole) {
		if (xtUserRole!=null) {
			xtUserRoleMapper.insert(xtUserRole);
		}

	}
	
	/**
	 * @function ɾ���û���ɫ
	 */
	@Override
	@Transactional(rollbackFor = Exception.class)
	public void deleteXtUserRole(Long id) {
		if (id != null) {
			xtUserRoleMapper.deleteByPrimaryKey(id);
		}

	}

	/**
	 * @function �޸��û���ɫ
	 */
	@Override
	@Transactional(rollbackFor = Exception.class)
	public void updateXtUserRole(XtUserRole xtUserRole) {
		if (xtUserRole.getId()!=null&&xtUserRole!=null) {
			xtUserRoleMapper.updateByPrimaryKey(xtUserRole);
		}

	}
	
	/**
	 * @function ��ȡ�����û���ɫ
	 */
	@Override
	@Transactional(rollbackFor = Exception.class)
	public XtUserRole getXtUserRole(Long id) {
		if (id!=null) {
			return xtUserRoleMapper.selectByPrimaryKey(id);
		}
		return null;
	}
	
	/**
	 * @function ��ҳ��ѯ����
	 */
	@Override
	@Transactional(rollbackFor = Exception.class)
	public PageInfo<XtUserRole> selectXtUserRole(Integer pageNum, Integer pageSize, XtUserRole xtUserRole) {
		PageHelper.startPage(pageNum, pageSize);
		List<XtUserRole> list = xtUserRoleMapper.selectByExample(null);
		PageInfo<XtUserRole> page = new PageInfo<XtUserRole>(list);
		return page;
	}
	
	/**
	 * @function ͨ��UserId ��ѯ��ɫ��Ϣ
	 */
	@Override
	@Transactional(rollbackFor = Exception.class)
	public List<XtUserRole> selectByUserId(Long id) {
		if(id!=null) {
			List<XtUserRole> list = xtUserRoleMapper.selectByUserId(id);
			return list;
		}
		return null;
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void deleteXtUserRoleByRoleId(Long roleId) {
		XtUserRoleExample example = new XtUserRoleExample();
		Criteria criteria = example.createCriteria();
		criteria.andRoleIdEqualTo(roleId);
		xtUserRoleMapper.deleteByExample(example);
	}

}
