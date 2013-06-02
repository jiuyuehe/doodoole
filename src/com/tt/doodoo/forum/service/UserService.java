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

}
