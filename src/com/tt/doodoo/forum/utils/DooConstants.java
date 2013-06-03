package com.tt.doodoo.forum.utils;

/**
 * 系统中的常量定义
 * 
 * @author jiuyuehe
 * 
 */
public class DooConstants {

	/**
	 * 整个系统中用户角色 枚举
	 * 
	 * @author jiuyuehe
	 * 超级管理员，二级管理员，认证用户，vip用户，普通用户
	 * 
	 */
	public enum UserRoles {

		superAdmin(1), subAdmin(2), authen(3), vip(4), common(5);

		public int index;

		private UserRoles(int index) {

			this.index = index;
		}

		public static int getName(int index) {
			for (int i = 0; i < UserRoles.values().length; i++) {
				if (i == index) {
					return index;
				}
			}
			return 0;
		}

		public int getIndex() {
			return index;
		}

		public void setIndex(int index) {
			this.index = index;
		}

	}

}
