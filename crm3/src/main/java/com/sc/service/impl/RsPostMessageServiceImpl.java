package com.sc.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.RsCompnayMessage;
import com.sc.entity.RsCompnayMessageExample;
import com.sc.entity.RsPostMessage;
import com.sc.entity.RsPostMessageExample;
import com.sc.entity.RsPostMessageExample.Criteria;
import com.sc.mapper.RsPostMessageMapper;
import com.sc.service.RsPostMessageService;

@Service
public class RsPostMessageServiceImpl implements RsPostMessageService {
	
	//依赖注入
	@Autowired
	RsPostMessageMapper rsPostMessageMapper;
	
	//添加
	@Override
	@Transactional(rollbackFor = Exception.class)
	public void addRsPost(RsPostMessage rspost) {
		rsPostMessageMapper.insert(rspost);

	}
	//修改
	@Override
	@Transactional(rollbackFor = Exception.class)
	public void updateRsPost(RsPostMessage rspost) {
		if(rspost!=null&&rspost.getPostId()!=null){
			rsPostMessageMapper.updateByPrimaryKey(rspost);
		}

	}
	//删除
	@Override
	@Transactional(rollbackFor = Exception.class)
	public void deleteRsPost(Long postId) {
		if(postId!=null){
			rsPostMessageMapper.deleteByPrimaryKey(postId);
		}

	}
	//主键
	@Override
	@Transactional(rollbackFor = Exception.class)
	public RsPostMessage getRsPost(Long postId) {
		if(postId!=null){
			return rsPostMessageMapper.selectByPrimaryKey(postId);
			}
			return null;
			
	}
	//分页查询
	@Override
	@Transactional(rollbackFor = Exception.class)
	public PageInfo<RsPostMessage> selectRsPost(Integer pageNum, Integer pageSize, RsPostMessage rspost) {
		
		RsPostMessageExample example=new RsPostMessageExample();
		
		if(rspost!=null){
			 Criteria criteria = example.createCriteria();
			//if(depot.getDepotName()!=null&&!depot.getDepotName().equals(""))
			if(!StringUtils.isEmpty(rspost.getPostName())){//仓库名称模糊查询
				criteria.andPostNameLike("%"+rspost.getPostName()+"%");
				System.out.println("进入模糊查询"+rspost.getPostName());
			}
			if(!StringUtils.isEmpty(rspost.getDatemin())){//最后修改时间大于等于最小日期
				System.out.println("----小----"+rspost.getDatemin());
				criteria.andLastModifyDateGreaterThanOrEqualTo(rspost.getDatemin());
			}
			if(!StringUtils.isEmpty(rspost.getDatemax())){//最后修改时间小于等于最大日期
				Date d=rspost.getDatemax();
				d.setHours(23);
				d.setMinutes(59);
				d.setSeconds(59);
				System.out.println("----大----"+d);
				criteria.andLastModifyDateLessThanOrEqualTo(d);
			}
		}
			
		
		PageHelper.startPage(pageNum, pageSize);
		List<RsPostMessage> list= rsPostMessageMapper.selectByExample(example);
		PageInfo<RsPostMessage> page=new PageInfo<RsPostMessage>(list);
		
		return page;
	}

}
