package com.sc.service;


import com.github.pagehelper.PageInfo;
import com.sc.entity.RsPostMessage;

public interface RsPostMessageService {
	//添加方法
	public void addRsPost(RsPostMessage rspost); 
	//修改方法
	public void updateRsPost(RsPostMessage rspost);
	//删除方法
	public void deleteRsPost(Long postId);
	//获取id
	public RsPostMessage getRsPost(Long postId);
	//分页查询
	public PageInfo<RsPostMessage> selectRsPost(Integer pageNum,Integer pageSize, RsPostMessage rspost);
}
