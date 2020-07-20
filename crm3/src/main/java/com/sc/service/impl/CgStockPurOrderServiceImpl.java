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
import com.sc.entity.CgStockPurchaseOrder;
import com.sc.entity.CgStockPurchaseOrderExample;
import com.sc.entity.CgStockPurchaseOrderExample.Criteria;
import com.sc.mapper.CgStockPurchaseOrderMapper;
import com.sc.service.CgStockPurchaseOrderService;

@Service
public class CgStockPurOrderServiceImpl implements CgStockPurchaseOrderService {
	
	@Autowired
	CgStockPurchaseOrderMapper cgpurorder;

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void addcgpurorder(CgStockPurchaseOrder purorder) {
		cgpurorder.insert(purorder);

	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void deletecgpurorder(BigDecimal purchaseOrderId) {
		if(purchaseOrderId!=null){
		cgpurorder.deleteByPrimaryKey(purchaseOrderId);
		}

	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void updatecgpurorder(CgStockPurchaseOrder purorder) {
		if(purorder!=null&&purorder.getPurchaseOrderId()!=null){
			cgpurorder.updateByPrimaryKey(purorder);
		}

	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public CgStockPurchaseOrder getcgpurorder(BigDecimal purchaseOrderId) {
		if(purchaseOrderId!=null){
		return this.cgpurorder.selectByPrimaryKey(purchaseOrderId);
	}
		return null;
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public PageInfo<CgStockPurchaseOrder> selectcgpurorder(Integer pageSize, Integer pageNum,
			CgStockPurchaseOrder purorder) {
		
		CgStockPurchaseOrderExample example=new CgStockPurchaseOrderExample();
		
		if(purorder!=null){
			Criteria criteria = example.createCriteria();
			
			if(!StringUtils.isEmpty(purorder.getDatemin())){
				criteria.andLastModifyDateGreaterThanOrEqualTo(purorder.getDatemin());
			}
			
			if(!StringUtils.isEmpty(purorder.getDatemax())){
				Date d=purorder.getDatemax();
				d.setHours(23);
				d.setMinutes(59);
				d.setSeconds(59);
				System.out.println("@@@@"+purorder.getDatemax());
				criteria.andLastModifyDateLessThanOrEqualTo(d);
			}
			
			if(!StringUtils.isEmpty(purorder.getPaymentStatus())){
				criteria.andPaymentStatusLike("%"+purorder.getPaymentStatus()+"%");
			}
			
		}
		PageHelper.startPage(pageNum, pageSize);
		List<CgStockPurchaseOrder> list = cgpurorder.selectByExample(example);
		PageInfo<CgStockPurchaseOrder> page=new PageInfo<CgStockPurchaseOrder>(list);
		
		
		return page;
	}

	@Override
	public PageInfo<CgStockPurchaseOrder> selectcgpurorderbyid(Integer pageSize, Integer pageNum,
			BigDecimal purchaseOrderId) {
        
		CgStockPurchaseOrderExample example=new CgStockPurchaseOrderExample();
		Criteria criteria = example.createCriteria();
		
		criteria.andPurchaseOrderIdEqualTo(purchaseOrderId);


		PageHelper.startPage(pageNum, pageSize);
		List<CgStockPurchaseOrder> list = cgpurorder.selectByExample(example);
		PageInfo<CgStockPurchaseOrder> page=new PageInfo<CgStockPurchaseOrder>(list);
		
		
		return page;
	}
	
	

}
