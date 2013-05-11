package com.tt.doodoo.forum.model;

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
 * Manager entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "manager", catalog = "forum")
public class Manager implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer managerId;
	private TtUser ttUser;
	private Broad broad;
	private Integer managerStatus;

	// Constructors

	

	// Property accessors
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "manager_id", unique = true, nullable = false)
	public Integer getManagerId() {
		return this.managerId;
	}

	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
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
	@JoinColumn(name = "broad_id", nullable = false)
	public Broad getBroad() {
		return this.broad;
	}

	public void setBroad(Broad broad) {
		this.broad = broad;
	}

	@Column(name = "manager_status", nullable = false)
	public Integer getManagerStatus() {
		return this.managerStatus;
	}

	public void setManagerStatus(Integer managerStatus) {
		this.managerStatus = managerStatus;
	}

}