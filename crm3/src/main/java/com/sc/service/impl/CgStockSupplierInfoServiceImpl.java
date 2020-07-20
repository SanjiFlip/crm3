package com.sc.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.CgStockSupplierInformation;
import com.sc.entity.CgStockSupplierInformationExample;
import com.sc.entity.CgStockSupplierInformationExample.Criteria;
import com.sc.mapper.CgStockSupplierInformationMapper;
import com.sc.service.CgStockSupplierInfoService;

@Service
public class CgStockSupplierInfoServiceImpl implements CgStockSupplierInfoService {
    
	@Autowired
	CgStockSupplierInformationMapper cgsupinfo;
	
	@Override
	@Transactional(rollbackFor = Exception.class)
	public void addcgsup(CgStockSupplierInformation cgsup) {
		cgsupinfo.insert(cgsup);

	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void deletecgsup(Long supplierId) {
		if(supplierId!=null){
			cgsupinfo.deleteByPrimaryKey(supplierId);
		}

	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void updatecgsup(CgStockSupplierInformation cgsup) {
		if(cgsup!=null&&cgsup.getSupplierId()!=null){
			cgsupinfo.updateByPrimaryKey(cgsup);
		}

	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public CgStockSupplierInformation getcgsup(Long supplierId) {
		if(supplierId!=null){
		return this.cgsupinfo.selectByPrimaryKey(supplierId);
		
		}
		return null;
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public PageInfo<CgStockSupplierInformation> selectcgsup(Integer pageNum, Integer pageSize,
			CgStockSupplierInformation cgsup) {
		
		CgStockSupplierInformationExample example = new CgStockSupplierInformationExample();
		if(cgsup!=null){
		Criteria criteria = example.createCriteria();
		
		if(!StringUtils.isEmpty(cgsup.getDatemin())){
			criteria.andLastModifyDateGreaterThanOrEqualTo(cgsup.getDatemin());
		}
		
		if(!StringUtils.isEmpty(cgsup.getDatemax())){
			Date d=cgsup.getDatemax();
			d.setHours(23);
			d.setMinutes(59);
			d.setSeconds(59);
			System.out.println("@@@@"+cgsup.getDatemax());
			criteria.andLastModifyDateLessThanOrEqualTo(d);
		}
		
		if(!StringUtils.isEmpty(cgsup.getSupplierName())){
			criteria.andSupplierNameLike("%"+cgsup.getSupplierName()+"%");
		}
		
		
		}

       PageHelper.startPage(pageNum, pageSize);
       List<CgStockSupplierInformation> list = cgsupinfo.selectByExample(example);
       PageInfo<CgStockSupplierInformation> page=new PageInfo<CgStockSupplierInformation>(list);
		
		return page;
	}

}
