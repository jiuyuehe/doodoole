package com.tt.doodoo.forum.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tt.doodoo.forum.dao.BroadDao;
import com.tt.doodoo.forum.model.Broad;
import com.tt.doodoo.forum.service.BroadService;


@Service
public class BroadServiceImpl implements BroadService {
	
	@Autowired
	private BroadDao broadDao;
	
	public Broad addBroad(Broad broad) {
		return broadDao.save(broad);
	}

	public boolean delBroad(int broadId) {
		try {
			
			broadDao.remove(broadDao.get(broadId));
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public List<Broad> getBroadByLevel(int parentId, int level) {
		return broadDao.getBroadByLevel(parentId,level);
	}

}
