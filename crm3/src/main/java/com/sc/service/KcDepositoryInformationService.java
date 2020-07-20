package com.sc.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.sc.entity.KcDepositoryInformation;

public interface KcDepositoryInformationService {
	
	public void addDept(KcDepositoryInformation dept);
	
	public void deleteDept(Long depositoryId);
	
	public void updateDept(KcDepositoryInformation dept);
	//通过主键获取对象
	public KcDepositoryInformation getDept(Long depositoryId);
	
	public List<KcDepositoryInformation> selectAll();
	
	public PageInfo<KcDepositoryInformation> selectDept(KcDepositoryInformation dept,Integer pageNum,Integer pageSize);

}
