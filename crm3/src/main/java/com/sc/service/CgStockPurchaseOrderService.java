package com.sc.service;

import java.math.BigDecimal;

import com.github.pagehelper.PageInfo;
import com.sc.entity.CgStockPurchaseOrder;

public interface CgStockPurchaseOrderService {
	
	public void addcgpurorder(CgStockPurchaseOrder purorder);
	
	public void deletecgpurorder(BigDecimal purchaseOrderId);
	
	public void updatecgpurorder(CgStockPurchaseOrder purorder);
	
	public CgStockPurchaseOrder getcgpurorder(BigDecimal purchaseOrderId);
	
	public PageInfo<CgStockPurchaseOrder> selectcgpurorder(Integer pageSize,Integer pageNum,CgStockPurchaseOrder purorder);

	public PageInfo<CgStockPurchaseOrder> selectcgpurorderbyid(Integer pageSize,Integer pageNum,BigDecimal purchaseOrderId);
}
