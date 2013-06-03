package com.tt.doodoo.forum.dao;


import com.tt.doodoo.forum.model.TtUser;


public interface UserDao extends BaseDao<TtUser>{
	/**
	 * 给登陆提供的独立查询
	 * @param userName
	 * @param password
	 * @return
	 */
	TtUser login(String userName, String password);

}
