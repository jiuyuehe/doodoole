package com.tt.doodoo.forum.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Retopic entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "retopic", catalog = "forum")
public class Retopic implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = -3016465762910092815L;
	private Integer retopicId;
	private TtUser ttUser;
	private Topic topic;
	private String retopicContent;
	private Date retopicCreatetime;
	private Integer retopicParentId;
	private Integer retopicZan;
	private Integer retopicCai;
	private Integer retopicAuthority;

	// Constructors

	
	// Property accessors
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "retopic_id", unique = true, nullable = false)
	public Integer getRetopicId() {
		return this.retopicId;
	}

	public void setRetopicId(Integer retopicId) {
		this.retopicId = retopicId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", nullable = false)
	public TtUser getTtUser() {
		return this.ttUser;
	}

	public void setTtUser(TtUser ttUser) {
		this.ttUser = ttUser;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "topic_id", nullable = false)
	public Topic getTopic() {
		return this.topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	@Column(name = "retopic_content", nullable = false, length = 500)
	public String getRetopicContent() {
		return this.retopicContent;
	}

	public void setRetopicContent(String retopicContent) {
		this.retopicContent = retopicContent;
	}



	@Column(name = "retopic_parentId")
	public Integer getRetopicParentId() {
		return this.retopicParentId;
	}

	@Column(name = "retopic_createtime", nullable = false, length = 19)
	public Date getRetopicCreatetime() {
		return retopicCreatetime;
	}

	public void setRetopicCreatetime(Date retopicCreatetime) {
		this.retopicCreatetime = retopicCreatetime;
	}


	@Column(name = "retopic_zan")
	public Integer getRetopicZan() {
		return this.retopicZan;
	}

	public void setRetopicZan(Integer retopicZan) {
		this.retopicZan = retopicZan;
	}

	@Column(name = "retopic_cai")
	public Integer getRetopicCai() {
		return this.retopicCai;
	}

	public void setRetopicCai(Integer retopicCai) {
		this.retopicCai = retopicCai;
	}

	@Column(name = "retopic_authority")
	public Integer getRetopicAuthority() {
		return this.retopicAuthority;
	}

	public void setRetopicParentId(Integer retopicParentId) {
		this.retopicParentId = retopicParentId;
	}

	public void setRetopicAuthority(Integer retopicAuthority) {
		this.retopicAuthority = retopicAuthority;
	}

}