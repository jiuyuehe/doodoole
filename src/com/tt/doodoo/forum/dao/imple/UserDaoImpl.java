package com.tt.doodoo.forum.dao.imple;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tt.doodoo.forum.dao.UserDao;
import com.tt.doodoo.forum.model.TtUser;

@Repository
public class UserDaoImpl extends BaseDaoImpl<TtUser> implements UserDao{

	public TtUser login(String userName, String password) {
		String hql = "from TtUser where userAccount=? and userPassword =?";
		List<TtUser> userList =  super.find(hql, userName,password);
		if(userList.size()==1){
			return userList.get(0);
		}
		return null;
	}

}
