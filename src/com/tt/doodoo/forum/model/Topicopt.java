package com.tt.doodoo.forum.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Topicopt entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "topicopt", catalog = "forum")
public class Topicopt implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 2468654089548660712L;
	private Integer optId;
	private Integer topicId;
	private Integer userId;
	private Integer optType;
	private Integer beuserId;
	private Integer retopicId;

	// Constructors


	// Property accessors
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "opt_id", unique = true, nullable = false)
	public Integer getOptId() {
		return this.optId;
	}

	public void setOptId(Integer optId) {
		this.optId = optId;
	}

	@Column(name = "topic_id")
	public Integer getTopicId() {
		return this.topicId;
	}

	public void setTopicId(Integer topicId) {
		this.topicId = topicId;
	}

	@Column(name = "user_id")
	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Column(name = "opt_type")
	public Integer getOptType() {
		return this.optType;
	}

	public void setOptType(Integer optType) {
		this.optType = optType;
	}

	@Column(name = "beuser_id")
	public Integer getBeuserId() {
		return this.beuserId;
	}

	public void setBeuserId(Integer beuserId) {
		this.beuserId = beuserId;
	}

	@Column(name = "retopic_id")
	public Integer getRetopicId() {
		return this.retopicId;
	}

	public void setRetopicId(Integer retopicId) {
		this.retopicId = retopicId;
	}

}