package com.tt.doodoo.forum.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tt.doodoo.forum.dao.RetopicDao;
import com.tt.doodoo.forum.model.Retopic;
import com.tt.doodoo.forum.service.RetopicService;
import com.tt.doodoo.forum.utils.Page;

/**
 * 
 * @author jiuyuehe
 *
 */

@Service
public class RetopicServiceImpl implements RetopicService {
	
	@Autowired
	private RetopicDao retopicDao;
	
	public Page<Retopic> getRetopicsByTopicId(int topicId,int pageIndex,int pageSize) {
		
		return retopicDao.getRetopicsByTopicId(topicId,pageIndex,pageSize);
	}

}
