package com.tt.doodoo.forum.service;

import java.util.List;

import com.tt.doodoo.forum.model.Broad;

public interface BroadService {
	
	/**
	 * 添加新板块
	 * @param broad
	 * @return
	 */
	Broad addBroad(Broad broad);
	
	/**
	 * 查询 某个板块的子板块
	 * @param parentId
	 * @param level
	 * @return
	 */
	List<Broad> getBroadByLevel(int parentId, int level);
	
	/**
	 * 删除子模块
	 * @param broadId
	 * @return
	 */
	boolean delBroad(int broadId);

}
