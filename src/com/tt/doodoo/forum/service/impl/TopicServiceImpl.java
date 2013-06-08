package com.tt.doodoo.forum.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tt.doodoo.forum.dao.TopicDao;
import com.tt.doodoo.forum.dao.imple.BaseDaoImpl;
import com.tt.doodoo.forum.model.Topic;
import com.tt.doodoo.forum.service.TopicService;
import com.tt.doodoo.forum.utils.Page;

@Service
public class TopicServiceImpl extends BaseDaoImpl<Topic> implements TopicService {
	
	@Autowired
	private TopicDao topicDao;

	public void delTopic(int topicId) {
		// TODO Auto-generated method stub
		
	}

	public Topic editTopic(Topic topic) {
		topicDao.update(topic);
		return topic;
	}

	public Page<Topic> getTopicByBroad(int pageIndex, int pageSize, int broadId) {
		String hql = "from Topic t where t.broad.broadId=? order by t.topicCreatetime desc";
		return topicDao.pagedQuery(hql, pageIndex, pageSize, broadId);
	}

	public Topic getTopicById(int topicId) {
		return topicDao.get(topicId);
	}

	public Page<Topic> getTopicByUser(int pageIndex, int pageSize, int userId) {
		String hql = "from Topic t where t.ttUser.userId=? order by t.topicCreatetime desc";
		return topicDao.pagedQuery(hql, pageIndex, pageSize, userId);
	}

	public Topic publishTopic(Topic topic) {
		topicDao.save(topic);
		return topic;
	}

	

}
