/*
Navicat MySQL Data Transfer

Source Server         : 192.168.1.68
Source Server Version : 50530
Source Host           : 192.168.1.68:3306
Source Database       : forum

Target Server Type    : MYSQL
Target Server Version : 50530
File Encoding         : 65001

Date: 2013-06-03 16:20:40
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `attachment`
-- ----------------------------
DROP TABLE IF EXISTS `attachment`;
CREATE TABLE `attachment` (
  `attach_id` int(11) NOT NULL AUTO_INCREMENT,
  `attach_name` varchar(50) DEFAULT NULL,
  `attach_path` varchar(128) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `attach_type` int(1) DEFAULT NULL,
  `attach_uploadtime` datetime DEFAULT NULL,
  PRIMARY KEY (`attach_id`),
  KEY `u-att` (`user_id`),
  CONSTRAINT `u-att` FOREIGN KEY (`user_id`) REFERENCES `tt_user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of attachment
-- ----------------------------

-- ----------------------------
-- Table structure for `broad`
-- ----------------------------
DROP TABLE IF EXISTS `broad`;
CREATE TABLE `broad` (
  `broad_id` int(11) NOT NULL AUTO_INCREMENT,
  `broad_name` varchar(20) NOT NULL,
  `broad_desc` varchar(50) NOT NULL DEFAULT '0' COMMENT '板块描述',
  `broad_topicNum` int(11) DEFAULT NULL COMMENT '所属帖子总数',
  `broad_parentId` int(11) DEFAULT NULL,
  `broad_level` int(1) DEFAULT '0',
  `broad_icon` varchar(128) DEFAULT NULL COMMENT '板块图片',
  PRIMARY KEY (`broad_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of broad
-- ----------------------------

-- ----------------------------
-- Table structure for `manager`
-- ----------------------------
DROP TABLE IF EXISTS `manager`;
CREATE TABLE `manager` (
  `manager_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `broad_id` int(11) NOT NULL,
  `manager_status` int(1) NOT NULL,
  PRIMARY KEY (`manager_id`),
  KEY `u-ma` (`user_id`),
  KEY `b-ma` (`broad_id`),
  CONSTRAINT `b-ma` FOREIGN KEY (`broad_id`) REFERENCES `broad` (`broad_id`),
  CONSTRAINT `u-ma` FOREIGN KEY (`user_id`) REFERENCES `tt_user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of manager
-- ----------------------------

-- ----------------------------
-- Table structure for `retopic`
-- ----------------------------
DROP TABLE IF EXISTS `retopic`;
CREATE TABLE `retopic` (
  `retopic_id` int(11) NOT NULL AUTO_INCREMENT,
  `retopic_content` varchar(500) NOT NULL,
  `retopic_createtime` datetime NOT NULL,
  `topic_id` int(11) NOT NULL,
  `retopic_parentId` int(11) DEFAULT NULL,
  `user_id` int(11) NOT NULL,
  `retopic_zan` int(5) DEFAULT NULL,
  `retopic_cai` int(5) DEFAULT NULL,
  `retopic_authority` int(11) DEFAULT NULL COMMENT '权威度',
  PRIMARY KEY (`retopic_id`),
  KEY `t-re` (`topic_id`),
  KEY `u-re` (`user_id`),
  CONSTRAINT `t-re` FOREIGN KEY (`topic_id`) REFERENCES `topic` (`topic_id`),
  CONSTRAINT `u-re` FOREIGN KEY (`user_id`) REFERENCES `tt_user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of retopic
-- ----------------------------

-- ----------------------------
-- Table structure for `topic`
-- ----------------------------
DROP TABLE IF EXISTS `topic`;
CREATE TABLE `topic` (
  `topic_id` int(11) NOT NULL AUTO_INCREMENT,
  `topic_titile` varchar(60) DEFAULT NULL,
  `topic_content` text,
  `user_id` int(11) DEFAULT NULL,
  `topic_updatetime` datetime DEFAULT NULL,
  `topic_createtime` datetime DEFAULT NULL,
  `broad_id` int(11) DEFAULT NULL COMMENT '所属板块',
  `topic_level` int(1) DEFAULT NULL COMMENT '主题状态',
  `topic_status` int(1) DEFAULT NULL COMMENT '主题状态',
  `topic_zan` int(7) DEFAULT NULL COMMENT '赞',
  `topic_cai` int(7) DEFAULT NULL COMMENT '踩',
  PRIMARY KEY (`topic_id`),
  KEY `u-t` (`user_id`),
  KEY `b-t` (`broad_id`),
  CONSTRAINT `b-t` FOREIGN KEY (`broad_id`) REFERENCES `broad` (`broad_id`),
  CONSTRAINT `u-t` FOREIGN KEY (`user_id`) REFERENCES `tt_user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of topic
-- ----------------------------

-- ----------------------------
-- Table structure for `topicopt`
-- ----------------------------
DROP TABLE IF EXISTS `topicopt`;
CREATE TABLE `topicopt` (
  `opt_id` int(11) NOT NULL AUTO_INCREMENT,
  `topic_id` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `opt_type` int(1) DEFAULT NULL COMMENT '1:回复博客，2，回复回帖，3赞博客，4踩博客',
  `beuser_id` int(11) DEFAULT NULL COMMENT '被操作这id',
  `retopic_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`opt_id`),
  KEY `t-opt` (`topic_id`),
  KEY `u-opt` (`user_id`),
  KEY `bu-opt` (`beuser_id`),
  KEY `re-opt` (`retopic_id`),
  CONSTRAINT `bu-opt` FOREIGN KEY (`beuser_id`) REFERENCES `tt_user` (`user_id`),
  CONSTRAINT `re-opt` FOREIGN KEY (`retopic_id`) REFERENCES `retopic` (`retopic_id`),
  CONSTRAINT `t-opt` FOREIGN KEY (`topic_id`) REFERENCES `topic` (`topic_id`),
  CONSTRAINT `u-opt` FOREIGN KEY (`user_id`) REFERENCES `tt_user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of topicopt
-- ----------------------------

-- ----------------------------
-- Table structure for `tt_user`
-- ----------------------------
DROP TABLE IF EXISTS `tt_user`;
CREATE TABLE `tt_user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_account` varchar(16) NOT NULL,
  `user_email` varchar(32) NOT NULL,
  `user_password` varchar(64) NOT NULL,
  `user_registdate` datetime NOT NULL COMMENT '注册时间',
  `user_role` int(1) NOT NULL DEFAULT '0' COMMENT '用户角色 0普通用户，1，管理员，2超级管理员。',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tt_user
-- ----------------------------
INSERT INTO `tt_user` VALUES ('1', '1212', '1212', '1212', '2013-06-03 11:12:03', '5');
INSERT INTO `tt_user` VALUES ('2', '12312', '12312', '12312', '2013-06-03 11:17:27', '5');

-- ----------------------------
-- Table structure for `userinfo`
-- ----------------------------
DROP TABLE IF EXISTS `userinfo`;
CREATE TABLE `userinfo` (
  `info_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `info_name` varchar(32) DEFAULT NULL COMMENT '姓名',
  `info_sex` int(1) DEFAULT NULL,
  `info_icon` varchar(128) DEFAULT NULL COMMENT '头像',
  `info_address` varchar(128) DEFAULT NULL COMMENT '地址',
  `info_scores` int(6) NOT NULL DEFAULT '10' COMMENT '用户积分',
  `info_authority` int(4) NOT NULL DEFAULT '1',
  PRIMARY KEY (`info_id`),
  KEY `uuu` (`user_id`),
  CONSTRAINT `uuu` FOREIGN KEY (`user_id`) REFERENCES `tt_user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of userinfo
-- ----------------------------
