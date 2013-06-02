package com.tt.doodoo.forum.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tt.doodoo.forum.dao.UserDao;
import com.tt.doodoo.forum.model.TtUser;
import com.tt.doodoo.forum.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;

	public TtUser registUser(TtUser tu) {
		userDao.save(tu);
		return tu;
	}

}
