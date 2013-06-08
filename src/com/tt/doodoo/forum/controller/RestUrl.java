package com.tt.doodoo.forum.controller;

public interface RestUrl {

	public static String index = "/index";

	// 仅仅网站跳转用
	public static String tologin = "/link/login";
	public static String toregist = "/link/regist";

	// 普通用户操作
	public static String login = "/pub/login";
	public static String regist = "/pub/regist";

	// forum操作
	/***
	 * 发表
	 * @param TopicVo 
	 * @method post
	 */
	public static String publishTopic = "/ch/addTopic";
	
	/**
	 * 获取
	 * @param int topicId 
	 * @method get
	 */
	public static String getTopicById = "/ch/topicInfo/{topicId}";
	/**
	 * 编辑
	 * @param TopicVo vo
	 * @method post
	 */
	public static String editTopic = "/ch/topic/{topicId}";
	


}
