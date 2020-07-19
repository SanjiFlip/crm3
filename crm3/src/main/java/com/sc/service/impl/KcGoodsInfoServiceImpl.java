package com.sc.service.impl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.KcGoodsInformation;
import com.sc.entity.KcGoodsInformationExample;
import com.sc.entity.KcGoodsInformationExample.Criteria;
import com.sc.mapper.KcGoodsInformationMapper;
import com.sc.service.KcGoodsInformationService;

@Service
public class KcGoodsInfoServiceImpl implements KcGoodsInformationService {

	@Autowired
	KcGoodsInformationMapper kcgoodsmapper;
	
	@Override
	@Transactional(rollbackFor = Exception.class)
	public void addkcgoods(KcGoodsInformation goods) {
		kcgoodsmapper.insert(goods);

	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void deletekcgoods(BigDecimal goodsId) {
		kcgoodsmapper.deleteByPrimaryKey(goodsId);

	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void updatekcgoods(KcGoodsInformation goods) {
		if(goods!=null&&goods.getGoodsId()!=null){
		kcgoodsmapper.updateByPrimaryKey(goods);
		}

	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public PageInfo<KcGoodsInformation> selectgoods(Integer pageNum, Integer pageSize, KcGoodsInformation goods) {
		
		KcGoodsInformationExample example = new KcGoodsInformationExample();
		if(goods!=null){
			Criteria criteria = example.createCriteria();
			//判断名字是否为空
			if(!StringUtils.isEmpty(goods.getGoodsName())){
				System.out.println("QQQQQQ");
				criteria.andGoodsNameLike("%"+goods.getGoodsName()+"%");
				System.out.println("HHHHHH");
			}
			
			
			//判断最小的日期是否为空
			if(!StringUtils.isEmpty(goods.getDatemin())){//最后修改时间大于等于最小时间
				System.out.println("@@@@"+goods.getDatemin());
				criteria.andLastModifyDateGreaterThanOrEqualTo(goods.getDatemin());
			} 
			
			if(!StringUtils.isEmpty(goods.getDatemax())){//最后修改时间小于等于最大时间
				Date d=goods.getDatemax();
				d.setHours(23);
				d.setMinutes(59);
				d.setSeconds(59);
				System.out.println("@@@@"+goods.getDatemax());
				criteria.andLastModifyDateLessThanOrEqualTo(d);
			} 
			
		}
		
		
		PageHelper.startPage(pageNum, pageSize);
		List<KcGoodsInformation> list = kcgoodsmapper.selectByExample(example);
		PageInfo<KcGoodsInformation> page=new PageInfo<KcGoodsInformation>(list);
		
		
		return page;
		
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public KcGoodsInformation getgoods(BigDecimal goodsId) {
		if(goodsId!=null){
		return kcgoodsmapper.selectByPrimaryKey(goodsId);
		}
		return null;
	}

	
	@Override
	@Transactional(rollbackFor = Exception.class)
	public PageInfo<KcGoodsInformation> selectrepgoods(Integer pageNum, Integer pageSize, KcGoodsInformation goods) {
		
		KcGoodsInformationExample example = new KcGoodsInformationExample();
		if(goods!=null){
			Criteria criteria = example.createCriteria();
			
			int num=10;
			BigDecimal kcnum=new BigDecimal(num);
			System.out.println("RRRRRRR");
		    criteria.andStockNumberLessThan(kcnum);
		}
		
		
		
		PageHelper.startPage(pageNum, pageSize);
		List<KcGoodsInformation> list = kcgoodsmapper.selectByExample(example);
		PageInfo<KcGoodsInformation> page=new PageInfo<KcGoodsInformation>(list);
		
		
		return page;
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public PageInfo<KcGoodsInformation> selectrepgoodsbyid(Integer pageNum, Integer pageSize, Long depositoryId) {
		PageHelper.startPage(pageNum, pageSize);
		KcGoodsInformationExample example = new KcGoodsInformationExample();
		Criteria criteria = example.createCriteria();
		System.out.println("我是商品service");
		criteria.andDepositoryIdEqualTo(depositoryId);
		
		List<KcGoodsInformation> list = kcgoodsmapper.selectByExample(example);
		PageInfo<KcGoodsInformation> page=new PageInfo<KcGoodsInformation>(list);
		return page;
	}

	@Override
	public List<KcGoodsInformation> selectall() {

		List<KcGoodsInformation> list = kcgoodsmapper.selectByExample(null);
		return list;
	}

	
	@Override
	@Transactional(rollbackFor = Exception.class)
	public PageInfo<KcGoodsInformation> selectgoodsbyid(Integer pageNum, Integer pageSize, BigDecimal goodsId) {
		PageHelper.startPage(pageNum, pageSize);
		KcGoodsInformationExample example = new KcGoodsInformationExample();
		Criteria criteria = example.createCriteria();
		System.out.println("YTUERERTYUEU");
		criteria.andGoodsIdEqualTo(goodsId);
		
		List<KcGoodsInformation> list = kcgoodsmapper.selectByExample(example);
		PageInfo<KcGoodsInformation> page=new PageInfo<KcGoodsInformation>(list);
		return page;
	}
	}


