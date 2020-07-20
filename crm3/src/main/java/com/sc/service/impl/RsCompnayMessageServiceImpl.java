package com.sc.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.RsCompnayMessageExample.Criteria;
import com.sc.entity.RsCompnayMessage;
import com.sc.entity.RsCompnayMessageExample;
import com.sc.mapper.RsCompnayMessageMapper;
import com.sc.service.RsCompnayMessageService;

@Service
public class RsCompnayMessageServiceImpl implements RsCompnayMessageService {

	@Autowired
	RsCompnayMessageMapper rsCompnayMessageMapper;
	

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void addRsCompnay(RsCompnayMessage rscompnay) {
		rsCompnayMessageMapper.insert(rscompnay);

	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void updateRsCompnay(RsCompnayMessage rscompnay) {
		if(rscompnay!=null&&rscompnay.getCompnayId()!=null){
			rsCompnayMessageMapper.updateByPrimaryKey(rscompnay);
		}

	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void deleteRsCompnay(Long compnayId) {
		if(compnayId!=null){
			rsCompnayMessageMapper.deleteByPrimaryKey(compnayId);
		}

	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public RsCompnayMessage getRsCompnay(Long compnayId) {
		if(compnayId!=null){
		return rsCompnayMessageMapper.selectByPrimaryKey(compnayId);
		}
		return null;
		
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public PageInfo<RsCompnayMessage> selectRsCompnay(Integer pageNum, Integer pageSize, RsCompnayMessage rscompnay) {
		RsCompnayMessageExample example=new RsCompnayMessageExample();
		
		if(rscompnay!=null){
			Criteria criteria = example.createCriteria();
			if(!StringUtils.isEmpty(rscompnay.getCompnayName())){
				criteria.andCompnayNameLike("%"+rscompnay.getCompnayName()+"%");
			}
			if(!StringUtils.isEmpty(rscompnay.getDatemin())){
				criteria.andLastModifyDateGreaterThanOrEqualTo(rscompnay.getDatemin());
			}
			if(!StringUtils.isEmpty(rscompnay.getDatemax())){
				Date d=rscompnay.getDatemax();
				d.setHours(23);
				d.setMinutes(59);
				d.setSeconds(59);
				criteria.andLastModifyDateLessThanOrEqualTo(d);
			}
		}
		PageHelper.startPage(pageNum, pageSize);
		List<RsCompnayMessage> list= rsCompnayMessageMapper.selectByExample(example);
		PageInfo<RsCompnayMessage> page=new PageInfo<RsCompnayMessage>(list);
		return page;
	}
	
	@Override
	@Transactional(rollbackFor = Exception.class)
	public List<RsCompnayMessage> selectRsCompnay() {
		List<RsCompnayMessage> list1 = rsCompnayMessageMapper.selectByExample(null);
		return list1;
	}
	

}
