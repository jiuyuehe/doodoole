package com.tt.doodoo.forum.controller;

public interface RestUrl {
	
	public static String index="index";
	
	//用户操作
	public static String login			="login";
	public static String regist			="regist";
	public static String userInfo		="userInfo";
	public static String editUserInfo	="editUserInfo";
	public static String resetPWD		="restPWD";
	
	
	//forum操作
	public static String addTopic		="addTopic";
	public static String getTopicInfo	="getTopicInfo";
	public static String editTopic		="editTopic";
	public static String removeTopic	="removeTopic";
	public static String getAreaBroad	="getAreaBroad";
	public static String getTopicByPage	="getTopicByPage";
	public static String getRetopicByPage	="getRetopicByPage";
	public static String addBroad		="addBroad";
	public static String editBroad		="editBroad";
	public static String removeBroad	="removeBroad";
	
	
	//验证码
	public static String getCode		="getCode";
	//public static String editTopic="editTopic";
	//public static String editTopic="editTopic";
	

}
