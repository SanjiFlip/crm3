package com.sc.service;


import com.github.pagehelper.PageInfo;
import com.sc.entity.RsPostMessage;

public interface RsPostMessageService {

	public void addRsPost(RsPostMessage rspost); 

	public void updateRsPost(RsPostMessage rspost);

	public void deleteRsPost(Long postId);

	public RsPostMessage getRsPost(Long postId);

	public PageInfo<RsPostMessage> selectRsPost(Integer pageNum,Integer pageSize, RsPostMessage rspost);
}
