package com.sc.service;


import java.util.List;

import com.github.pagehelper.PageInfo;
import com.sc.entity.RsDepartment;

public interface RsDepartmentService {

	public void addRsDepartment(RsDepartment rsdepartment); 

	public void updateRsDeptment(RsDepartment rsdepartment);

	public void deleteRsDeptment(Long departmentId);

	public RsDepartment getRsDeptment(Long departmentId);

	public PageInfo<RsDepartment> selectRsDepartment(Integer pageNum,Integer pageSize, RsDepartment rsdepartment);
	
	List<RsDepartment> selectDepartment();
}
