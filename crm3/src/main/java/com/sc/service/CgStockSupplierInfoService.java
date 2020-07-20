package com.sc.service;

import com.github.pagehelper.PageInfo;
import com.sc.entity.CgStockSupplierInformation;

public interface CgStockSupplierInfoService {
	
	public void addcgsup(CgStockSupplierInformation cgsup);

	public void deletecgsup(Long supplierId);
	
	public void updatecgsup(CgStockSupplierInformation cgsup);
	
	public CgStockSupplierInformation getcgsup(Long supplierId);
	
	public PageInfo<CgStockSupplierInformation> selectcgsup(Integer pageNum,Integer pageSize,CgStockSupplierInformation cgsup);

}
