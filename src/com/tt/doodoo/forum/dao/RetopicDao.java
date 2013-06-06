/**
 * 
 */
package com.tt.doodoo.forum.dao;

import com.tt.doodoo.forum.model.Retopic;
import com.tt.doodoo.forum.utils.Page;

/**
 * @author jiuyuehe
 *
 */
public interface RetopicDao extends BaseDao<Retopic> {

	Page<Retopic> getRetopicsByTopicId(int topicId,int pageIndex,int pageSize);

}
