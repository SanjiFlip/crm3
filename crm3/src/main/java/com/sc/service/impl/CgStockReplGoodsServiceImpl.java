package com.sc.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.CgStockReplenishmentGoods;
import com.sc.entity.CgStockReplenishmentGoodsExample;
import com.sc.entity.CgStockReplenishmentGoodsExample.Criteria;
import com.sc.mapper.CgStockReplenishmentGoodsMapper;
import com.sc.service.CgStockReplGoodsService;

@Service
public class CgStockReplGoodsServiceImpl implements CgStockReplGoodsService {
    
	@Autowired
	CgStockReplenishmentGoodsMapper cgrepgoods;
	
	@Override
	public void addcgrep(CgStockReplenishmentGoods repgoods) {
		cgrepgoods.insert(repgoods);

	}

	@Override
	public void deletecgrep(Long id) {
		if(id!=null){
	     cgrepgoods.deleteByPrimaryKey(id);
		}

	}

	@Override
	public void updatecgrep(CgStockReplenishmentGoods repgoods) {
		cgrepgoods.updateByPrimaryKey(repgoods);

	}

	@Override
	public CgStockReplenishmentGoods getcgrep(Long id) {
		
		return this.cgrepgoods.selectByPrimaryKey(id);
	}

	@Override
	public PageInfo<CgStockReplenishmentGoods> selectcgrep(Integer pageNum, Integer pageSize,
			CgStockReplenishmentGoods repgoods) {
		
		CgStockReplenishmentGoodsExample example=new CgStockReplenishmentGoodsExample();
		
		if(repgoods!=null){
			Criteria criteria = example.createCriteria();
			
			if(!StringUtils.isEmpty(repgoods.getDatemin())){
				criteria.andLastModifyDateGreaterThanOrEqualTo(repgoods.getDatemin());
			}
			
			if(!StringUtils.isEmpty(repgoods.getDatemax())){
				Date d=repgoods.getDatemax();
				d.setHours(23);
				d.setMinutes(59);
				d.setSeconds(59);
				System.out.println("@@@@"+repgoods.getDatemax());
				criteria.andLastModifyDateLessThanOrEqualTo(d);
			}
			
			if(!StringUtils.isEmpty(repgoods.getState())){
				criteria.andStateLike("%"+repgoods.getState()+"%");
			}
		}
		
		PageHelper.startPage(pageNum, pageSize);
		List<CgStockReplenishmentGoods> list = cgrepgoods.selectByExample(example);
		PageInfo<CgStockReplenishmentGoods> page=new PageInfo<CgStockReplenishmentGoods>(list);
		
		return page;
	}

	@Override
	public List<CgStockReplenishmentGoods> selectall() {
		List<CgStockReplenishmentGoods> list = cgrepgoods.selectByExample(null);
		return list;
	}

}
