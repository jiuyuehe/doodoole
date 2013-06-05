package com.tt.doodoo.forum.dao.imple;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tt.doodoo.forum.dao.BroadDao;
import com.tt.doodoo.forum.model.Broad;

@Repository
public class BroadDaoImpl extends BaseDaoImpl<Broad> implements BroadDao {

	public List<Broad> getBroadByLevel(int parentId, int level) {
		String hql ="from Broad where broadParentId=? and broadLevel=?";
		return super.find(hql,parentId,level);
	}


}
