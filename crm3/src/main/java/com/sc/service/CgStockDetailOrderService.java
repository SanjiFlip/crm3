package com.sc.service;

import java.math.BigDecimal;

import com.github.pagehelper.PageInfo;
import com.sc.entity.CgStockDetailOrder;

public interface CgStockDetailOrderService {
	
    public void addcgdetailorder(CgStockDetailOrder detorder);
	
	public void deletecgdetailorder(BigDecimal purchaseOrderDetailId);
	
	public void updatecgdetailorder(CgStockDetailOrder detorder);
	
	public CgStockDetailOrder getcgdetailorder(BigDecimal purchaseOrderDetailId);
	
	public PageInfo<CgStockDetailOrder> selectcgdetailorder(Integer pageSize,Integer pageNum,CgStockDetailOrder detorder);

	public PageInfo<CgStockDetailOrder> selectcgdetailorderbyid(Integer pageSize,Integer pageNum,BigDecimal purchaseOrderId);

}
