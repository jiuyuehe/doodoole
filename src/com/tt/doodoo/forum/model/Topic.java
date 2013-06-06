package com.tt.doodoo.forum.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.google.gson.annotations.Expose;

/**
 * Topic entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "topic", catalog = "forum")
public class Topic implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 3661635948135530994L;
	@Expose
	private Integer topicId;
	@Expose
	private TtUser ttUser;
	@Expose
	private Broad broad;
	@Expose
	private String topicTitile;
	@Expose
	private String topicContent;
	@Expose
	private Date topicUpdatetime;
	@Expose
	private Date topicCreatetime;
	@Expose
	private Integer topicLevel;
	@Expose
	private Integer topicStatus;
	@Expose
	private Integer topicZan;
	@Expose
	private Integer topicCai;
	private Set<Retopic> retopics = new HashSet<Retopic>(0);

	// Constructors

	// Property accessors
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "topic_id", unique = true, nullable = false)
	public Integer getTopicId() {
		return this.topicId;
	}

	public void setTopicId(Integer topicId) {
		this.topicId = topicId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	public TtUser getTtUser() {
		return this.ttUser;
	}

	public void setTtUser(TtUser ttUser) {
		this.ttUser = ttUser;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "broad_id")
	public Broad getBroad() {
		return this.broad;
	}

	public void setBroad(Broad broad) {
		this.broad = broad;
	}

	@Column(name = "topic_titile", length = 60)
	public String getTopicTitile() {
		return this.topicTitile;
	}

	public void setTopicTitile(String topicTitile) {
		this.topicTitile = topicTitile;
	}

	@Column(name = "topic_content", length = 65535)
	public String getTopicContent() {
		return this.topicContent;
	}

	public void setTopicContent(String topicContent) {
		this.topicContent = topicContent;
	}

	@Column(name = "topic_updatetime", length = 19)
	public Date getTopicUpdatetime() {
		return this.topicUpdatetime;
	}

	public void setTopicUpdatetime(Date topicUpdatetime) {
		this.topicUpdatetime = topicUpdatetime;
	}

	@Column(name = "topic_createtime", length = 19)
	public Date getTopicCreatetime() {
		return this.topicCreatetime;
	}

	public void setTopicCreatetime(Date topicCreatetime) {
		this.topicCreatetime = topicCreatetime;
	}

	@Column(name = "topic_level")
	public Integer getTopicLevel() {
		return this.topicLevel;
	}

	public void setTopicLevel(Integer topicLevel) {
		this.topicLevel = topicLevel;
	}

	@Column(name = "topic_status")
	public Integer getTopicStatus() {
		return this.topicStatus;
	}

	public void setTopicStatus(Integer topicStatus) {
		this.topicStatus = topicStatus;
	}

	@Column(name = "topic_zan")
	public Integer getTopicZan() {
		return this.topicZan;
	}

	public void setTopicZan(Integer topicZan) {
		this.topicZan = topicZan;
	}

	@Column(name = "topic_cai")
	public Integer getTopicCai() {
		return this.topicCai;
	}

	public void setTopicCai(Integer topicCai) {
		this.topicCai = topicCai;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "topic")
	public Set<Retopic> getRetopics() {
		return this.retopics;
	}

	public void setRetopics(Set<Retopic> retopics) {
		this.retopics = retopics;
	}

}