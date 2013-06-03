package com.tt.doodoo.forum.service;

import com.tt.doodoo.forum.model.Topic;
import com.tt.doodoo.forum.utils.Page;

public interface TopicService {
	
	/**
	 * 发帖子，发博客
	 * @param topic
	 * @return
	 */
	public Topic publishTopic(Topic topic);
	
	/**
	 * 编辑
	 * @param topic
	 * @return
	 */
	public Topic editTopic(Topic topic);
	
	/**
	 * 删除
	 * @param topicId
	 */
	public void  delTopic( int topicId);
	
	/**
	 * 查看
	 * @param id
	 * @return
	 */
	public Topic getTopicById(int topicId);
	
	/**
	 * 根据用户分页查看
	 * @param pageIndex
	 * @param pageSize
	 * @param userId
	 * @return
	 */
	public Page<Topic> getTopicByUser(int pageIndex,int pageSize,int userId);
	
	/**
	 * 根据板块分页查看
	 * @param pageIndex
	 * @param pageSize
	 * @param broadId
	 * @return
	 */
	Page<Topic> getTopicByBroad(int pageIndex,int pageSize,int broadId);
	
	

}
