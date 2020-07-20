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
import com.sc.entity.CgStockDetailOrder;
import com.sc.entity.CgStockDetailOrderExample;
import com.sc.entity.CgStockDetailOrderExample.Criteria;
import com.sc.mapper.CgStockDetailOrderMapper;
import com.sc.service.CgStockDetailOrderService;

@Service
public class CgStockDetailOrderServiceImpl implements CgStockDetailOrderService {

	@Autowired
	CgStockDetailOrderMapper cgdetail;
	
	@Override
	@Transactional(rollbackFor = Exception.class)
	public void addcgdetailorder(CgStockDetailOrder detorder) {
		cgdetail.insert(detorder);

	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void deletecgdetailorder(BigDecimal purchaseOrderDetailId) {
		if(purchaseOrderDetailId!=null){
			cgdetail.deleteByPrimaryKey(purchaseOrderDetailId);
		}

	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void updatecgdetailorder(CgStockDetailOrder detorder) {
		if(detorder!=null&&detorder.getPurchaseOrderDetailId()!=null){
			cgdetail.updateByPrimaryKey(detorder);
		}

	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public CgStockDetailOrder getcgdetailorder(BigDecimal purchaseOrderDetailId) {
		if(purchaseOrderDetailId!=null){
			return this.cgdetail.selectByPrimaryKey(purchaseOrderDetailId);
		}
		return null;
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public PageInfo<CgStockDetailOrder> selectcgdetailorder(Integer pageSize, Integer pageNum,
			CgStockDetailOrder detorder) {
		
		CgStockDetailOrderExample example=new CgStockDetailOrderExample();
		if(detorder!=null){
		Criteria criteria = example.createCriteria();
		
		if(!StringUtils.isEmpty(detorder.getDatemin())){
			criteria.andLastModifyDateGreaterThanOrEqualTo(detorder.getDatemin());
		}
		
		if(!StringUtils.isEmpty(detorder.getDatemax())){
			Date d=detorder.getDatemax();
			d.setHours(23);
			d.setMinutes(59);
			d.setSeconds(59);
			System.out.println("@@@@"+detorder.getDatemax());
			criteria.andLastModifyDateLessThanOrEqualTo(d);
		}
		
		if(!StringUtils.isEmpty(detorder.getIsnotInStorage())){
			criteria.andIsnotInStorageLike("%"+detorder.getIsnotInStorage()+"%");
		}
		
		
		}
        PageHelper.startPage(pageNum, pageSize);
        List<CgStockDetailOrder> list = cgdetail.selectByExample(example);
        PageInfo<CgStockDetailOrder> page=new PageInfo<CgStockDetailOrder>(list);
		
		
		return page;
	}

	@Override
	public PageInfo<CgStockDetailOrder> selectcgdetailorderbyid(Integer pageSize, Integer pageNum,
			BigDecimal purchaseOrderId) {
		
		CgStockDetailOrderExample example=new CgStockDetailOrderExample();
		
		Criteria criteria = example.createCriteria();
		criteria.andPurchaseOrderIdEqualTo(purchaseOrderId);
		
		
		PageHelper.startPage(pageNum, pageSize);
        List<CgStockDetailOrder> list = cgdetail.selectByExample(example);
        PageInfo<CgStockDetailOrder> page=new PageInfo<CgStockDetailOrder>(list);
		
		
		return page;
	}

}
