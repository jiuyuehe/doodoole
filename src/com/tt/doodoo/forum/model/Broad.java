package com.tt.doodoo.forum.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.google.gson.annotations.Expose;

/**
 * Broad entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "broad", catalog = "forum")
public class Broad implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 2561544286512884798L;
	@Expose
	private Integer broadId;
	@Expose
	private String broadName;
	@Expose
	private String broadDesc;
	@Expose
	private Integer broadTopicNum;
	@Expose
	private Integer broadParentId;
	@Expose
	private	Integer broadLevel;
	@Expose
	private	String  broadIcon;
	
	private Set<Manager> managers = new HashSet<Manager>(0);
	private Set<Topic> topics = new HashSet<Topic>(0);

	// Constructors


	// Property accessors
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "broad_id", unique = true, nullable = false)
	public Integer getBroadId() {
		return this.broadId;
	}

	public void setBroadId(Integer broadId) {
		this.broadId = broadId;
	}

	@Column(name = "broad_name", nullable = false, length = 20)
	public String getBroadName() {
		return this.broadName;
	}

	public void setBroadName(String broadName) {
		this.broadName = broadName;
	}

	@Column(name = "broad_desc", nullable = false, length = 50)
	public String getBroadDesc() {
		return this.broadDesc;
	}

	public void setBroadDesc(String broadDesc) {
		this.broadDesc = broadDesc;
	}

	@Column(name = "broad_topicNum")
	public Integer getBroadTopicNum() {
		return this.broadTopicNum;
	}

	public void setBroadTopicNum(Integer broadTopicNum) {
		this.broadTopicNum = broadTopicNum;
	}
	
	
	@Column(name = "broad_parentId")
	public Integer getBroadParentId() {
		return broadParentId;
	}

	public void setBroadParentId(Integer broadParentId) {
		this.broadParentId = broadParentId;
	}
	
	@Column(name = "broad_level")
	public Integer getBroadLevel() {
		return broadLevel;
	}

	public void setBroadLevel(Integer broadLevel) {
		this.broadLevel = broadLevel;
	}
	
	
	@Column(name = "broad_icon")
	public String getBroadIcon() {
		return broadIcon;
	}

	public void setBroadIcon(String broadIcon) {
		this.broadIcon = broadIcon;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "broad")
	public Set<Manager> getManagers() {
		return this.managers;
	}

	public void setManagers(Set<Manager> managers) {
		this.managers = managers;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "broad")
	public Set<Topic> getTopics() {
		return this.topics;
	}

	public void setTopics(Set<Topic> topics) {
		this.topics = topics;
	}

}