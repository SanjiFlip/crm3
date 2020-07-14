package com.sc.service;


import com.github.pagehelper.PageInfo;
import com.sc.entity.RsCompnayMessage;

public interface RsCompnayMessageService {
	//添加方法
	public void addRsCompnay(RsCompnayMessage rscompnay); 
	//修改方法
	public void updateRsCompnay(RsCompnayMessage rscompnay);
	//删除方法
	public void deleteRsCompnay(Long compnayId);
	//获取id
	public RsCompnayMessage getRsCompnay(Long compnayId);
	//分页查询
	public PageInfo<RsCompnayMessage> selectRsCompnay(Integer pageNum,Integer pageSize, RsCompnayMessage rscompnay);
}
