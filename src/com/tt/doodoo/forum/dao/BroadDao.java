package com.tt.doodoo.forum.dao;

import java.util.List;

import com.tt.doodoo.forum.model.Broad;

public interface BroadDao extends BaseDao<Broad>{
	
	/**
	 * 获取某一级子目录
	 * @param parentId
	 * @param level
	 * @return
	 */
	List<Broad> getBroadByLevel(int parentId, int level);

}
