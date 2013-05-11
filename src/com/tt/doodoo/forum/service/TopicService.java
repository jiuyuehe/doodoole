package com.tt.doodoo.forum.service;

import com.tt.doodoo.forum.model.Topic;
import com.tt.doodoo.forum.utils.Page;

public interface TopicService {
	
	public Topic publishTopic(Topic topic);
	
	public Topic editTopic(Topic topic);
	
	public void  removeTopic(Topic topic);
	
	public Topic getTopicById(int id);
	
	public Page<Topic> getTopicByPage(int pageIndex,int pageSize,int broadId);
	
	
	

}
