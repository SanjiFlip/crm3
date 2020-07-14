package com.sc.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.RsDepartmentExample;
import com.sc.entity.RsUserMessage;
import com.sc.entity.RsUserMessageExample;
import com.sc.entity.RsUserMessageExample.Criteria;
import com.sc.mapper.RsUserMessageMapper;
import com.sc.service.RsUserMessageService;
@Service
public class RsUserMessageServiceImpl implements RsUserMessageService {

	//依赖注入
	@Autowired
	RsUserMessageMapper rsUserMessageMapper;
	
	//添加
	@Override
	@Transactional(rollbackFor = Exception.class)
	public void addRsUser(RsUserMessage rsuser) {
		rsUserMessageMapper.insert(rsuser);

	}
	//修改
	@Override
	@Transactional(rollbackFor = Exception.class)
	public void updateRsUser(RsUserMessage rsuser) {
		if(rsuser!=null&&rsuser.getStaffId()!=null){
			rsUserMessageMapper.updateByPrimaryKey(rsuser);
		}

	}
	//删除
	@Override
	@Transactional(rollbackFor = Exception.class)
	public void deleteRsUser(Long staffId) {
		if(staffId!=null){
			rsUserMessageMapper.deleteByPrimaryKey(staffId);
		}

	}
	//主键
	@Override
	@Transactional(rollbackFor = Exception.class)
	public RsUserMessage getRsUser(Long staffId) {
		if(staffId!=null){
			return rsUserMessageMapper.selectByPrimaryKey(staffId);
			}
			return null;
	}
	//分页查询
	@Override
	@Transactional(rollbackFor = Exception.class)
	public PageInfo<RsUserMessage> selectRsCompnay(Integer pageNum, Integer pageSize, RsUserMessage rsuser) {
		RsUserMessageExample example=new RsUserMessageExample();
		
		if(rsuser!=null){
			 Criteria criteria = example.createCriteria();
			//if(depot.getDepotName()!=null&&!depot.getDepotName().equals(""))
			if(!StringUtils.isEmpty(rsuser.getStaffName())){//仓库名称模糊查询
				criteria.andStaffNameLike("%"+rsuser.getStaffName()+"%");
				System.out.println("进入模糊查询"+rsuser.getStaffName());
			}
			if(!StringUtils.isEmpty(rsuser.getDatemin())){//最后修改时间大于等于最小日期
				System.out.println("----小----"+rsuser.getDatemin());
				criteria.andLastModifyDateGreaterThanOrEqualTo(rsuser.getDatemin());
			}
			if(!StringUtils.isEmpty(rsuser.getDatemax())){//最后修改时间小于等于最大日期
				Date d=rsuser.getDatemax();
				d.setHours(23);
				d.setMinutes(59);
				d.setSeconds(59);
				System.out.println("----大----"+d);
				criteria.andLastModifyDateLessThanOrEqualTo(d);
			}
		}
		PageHelper.startPage(pageNum, pageSize);
		List<RsUserMessage> list= rsUserMessageMapper.selectByExample(example);
		PageInfo<RsUserMessage> page=new PageInfo<RsUserMessage>(list);
		
		return page;
	}

}
