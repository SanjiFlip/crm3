package com.sc.service;


import com.github.pagehelper.PageInfo;
import com.sc.entity.RsDepartment;

public interface RsDepartmentService {
	//添加方法
	public void addRsDepartment(RsDepartment rsdepartment); 
	//修改方法
	public void updateRsDeptment(RsDepartment rsdepartment);
	//删除方法
	public void deleteRsDeptment(Long departmentId);
	//获取id
	public RsDepartment getRsDeptment(Long departmentId);
	//分页查询
	public PageInfo<RsDepartment> selectRsDepartment(Integer pageNum,Integer pageSize, RsDepartment rsdepartment);
}
