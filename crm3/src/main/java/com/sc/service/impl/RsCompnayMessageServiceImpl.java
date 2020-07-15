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
	//依赖注入 
	@Autowired
	RsCompnayMessageMapper rsCompnayMessageMapper;
	
	//添加
	@Override
	@Transactional(rollbackFor = Exception.class)
	public void addRsCompnay(RsCompnayMessage rscompnay) {
		rsCompnayMessageMapper.insert(rscompnay);

	}
	//修改
	@Override
	@Transactional(rollbackFor = Exception.class)
	public void updateRsCompnay(RsCompnayMessage rscompnay) {
		if(rscompnay!=null&&rscompnay.getCompnayId()!=null){
			rsCompnayMessageMapper.updateByPrimaryKey(rscompnay);
		}

	}
	//删除
	@Override
	@Transactional(rollbackFor = Exception.class)
	public void deleteRsCompnay(Long compnayId) {
		if(compnayId!=null){
			rsCompnayMessageMapper.deleteByPrimaryKey(compnayId);
		}

	}
	//获取主键
	@Override
	@Transactional(rollbackFor = Exception.class)
	public RsCompnayMessage getRsCompnay(Long compnayId) {
		if(compnayId!=null){
		return rsCompnayMessageMapper.selectByPrimaryKey(compnayId);
		}
		return null;
		
	}
	//详细查询
	@Override
	@Transactional(rollbackFor = Exception.class)
	public PageInfo<RsCompnayMessage> selectRsCompnay(Integer pageNum, Integer pageSize, RsCompnayMessage rscompnay) {
		RsCompnayMessageExample example=new RsCompnayMessageExample();
		
		if(rscompnay!=null){
			Criteria criteria = example.createCriteria();
			//if(depot.getDepotName()!=null&&!depot.getDepotName().equals(""))
			if(!StringUtils.isEmpty(rscompnay.getCompnayName())){//仓库名称模糊查询
				criteria.andCompnayNameLike("%"+rscompnay.getCompnayName()+"%");
				System.out.println("进入模糊查询"+rscompnay.getCompnayName());
			}
			if(!StringUtils.isEmpty(rscompnay.getDatemin())){//最后修改时间大于等于最小日期
				System.out.println("----小----"+rscompnay.getDatemin());
				criteria.andLastModifyDateGreaterThanOrEqualTo(rscompnay.getDatemin());
			}
			if(!StringUtils.isEmpty(rscompnay.getDatemax())){//最后修改时间小于等于最大日期
				Date d=rscompnay.getDatemax();
				d.setHours(23);
				d.setMinutes(59);
				d.setSeconds(59);
				System.out.println("----大----"+d);
				criteria.andLastModifyDateLessThanOrEqualTo(d);
			}
		}
		PageHelper.startPage(pageNum, pageSize);
		List<RsCompnayMessage> list= rsCompnayMessageMapper.selectByExample(example);
		PageInfo<RsCompnayMessage> page=new PageInfo<RsCompnayMessage>(list);
		
		return page;
	}

}
