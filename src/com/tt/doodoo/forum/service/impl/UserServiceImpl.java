package com.tt.doodoo.forum.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tt.doodoo.forum.dao.UserDao;
import com.tt.doodoo.forum.model.TtUser;
import com.tt.doodoo.forum.service.UserService;
import com.tt.doodoo.forum.utils.DooConstants.UserRoles;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;

	public TtUser registUser(TtUser tu) {
		tu.setUserRegistdate(new Date());
		tu.setUserRole(UserRoles.common.index);
		userDao.save(tu);
		return tu;
	}

	public TtUser login(String userName, String password) {
		
		return userDao.login(userName,password);
	}

	public TtUser editUserInfo(TtUser user) {
		// TODO Auto-generated method stub
		return null;
	}

	public TtUser getUserInfo(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void logout(int userId) {
		// TODO Auto-generated method stub
		
	}

}
