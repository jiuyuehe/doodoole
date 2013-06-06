/**
 * 
 */
package com.tt.doodoo.forum.dao.imple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tt.doodoo.forum.dao.RetopicDao;
import com.tt.doodoo.forum.model.Retopic;
import com.tt.doodoo.forum.service.RetopicService;
import com.tt.doodoo.forum.utils.Page;

/**
 * @author jiuyuehe
 *
 */
@Repository
public class RetopicDaoImpl extends BaseDaoImpl<Retopic> implements RetopicDao{
	
	public Page<Retopic> getRetopicsByTopicId(int topicId,int pageIndex,int pageSize) {
		String hql ="from Retopic  t where  t.topic.topicId =? order by retopicCreatetime desc";
		return pagedQuery(hql, pageIndex, pageSize, topicId);
	}

	

}
