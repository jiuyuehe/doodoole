package com.tt.doodoo.forum.service;

import com.tt.doodoo.forum.model.Retopic;
import com.tt.doodoo.forum.utils.Page;

public interface RetopicService {
	
	/**
	 * 获取回复分页列表
	 * @param topicId
	 * @return
	 */
	Page<Retopic> getRetopicsByTopicId(int topicId, int pageIndex,int pageSize);

}
