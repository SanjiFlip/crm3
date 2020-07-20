package com.sc.service;


import com.github.pagehelper.PageInfo;
import com.sc.entity.RsUserMessage;

public interface RsUserMessageService {

	public void addRsUser(RsUserMessage rsuser); 

	public void updateRsUser(RsUserMessage rsuser);

	public void deleteRsUser(Long staffId);

	public RsUserMessage getRsUser(Long staffId);

	public PageInfo<RsUserMessage> selectRsCompnay(Integer pageNum,Integer pageSize, RsUserMessage rsuser);
}
