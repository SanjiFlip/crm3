package com.sc.service;


import com.github.pagehelper.PageInfo;
import com.sc.entity.RsUserMessage;

public interface RsUserMessageService {
	//添加方法
	public void addRsUser(RsUserMessage rsuser); 
	//修改方法
	public void updateRsUser(RsUserMessage rsuser);
	//删除方法
	public void deleteRsUser(Long staffId);
	//获取id
	public RsUserMessage getRsUser(Long staffId);
	//分页查询
	public PageInfo<RsUserMessage> selectRsCompnay(Integer pageNum,Integer pageSize, RsUserMessage rsuser);
}
