package com.sc.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.XtUserAccount;
import com.sc.entity.XtUserAccountExample;
import com.sc.entity.XtUserAccountExample.Criteria;
import com.sc.mapper.XtUserAccountMapper;
import com.sc.service.XtUserAccountService;

/**
 * 
 * @author Sanji
 *
 */
@Service
public class XtUserAccountServiceImpl implements XtUserAccountService {
	
	
	@Autowired
	XtUserAccountMapper xtUserAccountMapper;
	
	/**
	 * @return 单个用户
	 */
	@Override
	@Transactional(rollbackFor = Exception.class)
	public XtUserAccount login(String userName) {
		
		XtUserAccountExample example = new XtUserAccountExample();
		Criteria criteria = example.createCriteria();
		//设置用户账号的条件
		criteria.andUserNameEqualTo(userName);
		List<XtUserAccount> list = xtUserAccountMapper.selectByExample(example);
		if (list!=null&&list.size()>0) {
			return	list.get(0);
		}
		return null;
	}
	
	/**
	 * @function 添加单个用户
	 */
	@Override
	@Transactional(rollbackFor = Exception.class)
	public void addXtUserAccount(XtUserAccount xtUserAccount) {
		if (xtUserAccount!=null) {
			xtUserAccountMapper.insert(xtUserAccount);
		}	
	}
	
	/**
	 * @function 修改单个用户
	 */
	@Override
	@Transactional(rollbackFor = Exception.class)
	public void updateXtUserAccount(XtUserAccount xtUserAccount) {
		if(xtUserAccount!=null&&xtUserAccount.getUserId()!=null) {
			xtUserAccountMapper.updateByPrimaryKey(xtUserAccount);
		}
		
	}

	
	/**
	 * @function 删除单个用户
	 */
	@Override
	@Transactional(rollbackFor = Exception.class)
	public void deleteXtUserAccount(Long userId) {
		if(userId!=null) {
			xtUserAccountMapper.deleteByPrimaryKey(userId);
		}
	}
	
	/**
	 * @function 查询单个用户
	 */
	@Override
	@Transactional(rollbackFor = Exception.class)
	public XtUserAccount getXtUserAccount(Long userId) {
		if(userId!=null) {
			return xtUserAccountMapper.selectByPrimaryKey(userId);
		}
		return null;
	}
	
	/**
	 * @function 分页查询单个用户--可实现条件查询
	 */
	@Override
	@Transactional(rollbackFor = Exception.class)
	public PageInfo<XtUserAccount> selectXtUserAccount(Integer pageNum, Integer pageSize, XtUserAccount xtUserAccount) {
		XtUserAccountExample example = new XtUserAccountExample();
		if (xtUserAccount!=null) {
			Criteria criteria = example.createCriteria();
			if (!StringUtils.isEmpty(xtUserAccount.getUserName())) {
				criteria.andUserNameLike("%"+xtUserAccount.getUserName()+"%");
			}
			if (!StringUtils.isEmpty(xtUserAccount.getDatemin())) {
				criteria.andLastModifyDateGreaterThanOrEqualTo(xtUserAccount.getDatemin());
			}
			if (!StringUtils.isEmpty(xtUserAccount.getDatemax())) {
				Date d = new Date();
				d.setDate(xtUserAccount.getDatemax().getDate()+1);
				criteria.andLastModifyDateLessThan(d);
			}
		}
		PageHelper.startPage(pageNum, pageSize);
		List<XtUserAccount> list = xtUserAccountMapper.selectByExample(example);
		PageInfo<XtUserAccount> page = new PageInfo<XtUserAccount>(list);
		return page;
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public PageInfo<XtUserAccount> selectByRoleId(Integer pageNum, Integer pageSize, Long roleId) {
		PageHelper.startPage(pageNum, pageSize);
		List<XtUserAccount> list = xtUserAccountMapper.selectByRoleId(roleId);
		PageInfo<XtUserAccount> page = new PageInfo<XtUserAccount>(list);
		return page;
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public PageInfo<XtUserAccount> selectByNotRoleId1(Integer pageNum, Integer pageSize, Long roleId) {
		PageHelper.startPage(pageNum, pageSize);
		List<XtUserAccount> list = xtUserAccountMapper.selectByNotInRoleId(roleId);
		System.out.println("============================="+list);
		PageInfo<XtUserAccount> page = new PageInfo<XtUserAccount>(list);
		return page;
	}

}
