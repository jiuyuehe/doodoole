package com.tt.doodoo.forum.service;

import com.tt.doodoo.forum.model.TtUser;

/**
 * 
 * @author jiuyuehe
 * @date 2013-06-02 20:30
 *
 */
public interface UserService {
	/**
	 * register account
	 * @param tu
	 * @return
	 */
	TtUser registUser(TtUser tu);
	
	/**
	 * 登录
	 * @param userName
	 * @param password
	 * @return
	 */
	TtUser login(String userName, String password);
	
	/**
	 * 退出
	 * @param userId
	 * @return
	 */
	void logout(int userId);
	
	/**
	 * 查看用户资料
	 * @param userId
	 * @return
	 */
	TtUser getUserInfo(int userId);
	
	/**
	 * 编辑用户资料
	 * @param user
	 * @return
	 */
	TtUser editUserInfo(TtUser user);

}
