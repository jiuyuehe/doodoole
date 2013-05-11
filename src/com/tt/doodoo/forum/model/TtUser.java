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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TtUser entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tt_user", catalog = "forum")
public class TtUser implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 7319428989537732033L;
	private Integer userId;
	private String userAccount;
	private String userEmail;
	private String userPassword;
	private Date userRegistdate;
	private Integer userRole;
	private Set<Topic> topics = new HashSet<Topic>(0);
	private Set<Manager> managers = new HashSet<Manager>(0);
	private Set<Retopic> retopics = new HashSet<Retopic>(0);
	private Set<Userinfo> userinfos = new HashSet<Userinfo>(0);
	private Set<Attachment> attachments = new HashSet<Attachment>(0);

	// Constructors


	// Property accessors
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id", unique = true, nullable = false)
	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Column(name = "user_account", nullable = false, length = 16)
	public String getUserAccount() {
		return this.userAccount;
	}

	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}

	@Column(name = "user_email", nullable = false, length = 32)
	public String getUserEmail() {
		return this.userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	@Column(name = "user_password", nullable = false, length = 64)
	public String getUserPassword() {
		return this.userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	@Column(name = "user_registdate", nullable = false, length = 19)
	public Date getUserRegistdate() {
		return this.userRegistdate;
	}

	public void setUserRegistdate(Date userRegistdate) {
		this.userRegistdate = userRegistdate;
	}

	@Column(name = "user_role", nullable = false)
	public Integer getUserRole() {
		return this.userRole;
	}

	public void setUserRole(Integer userRole) {
		this.userRole = userRole;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "ttUser")
	public Set<Topic> getTopics() {
		return this.topics;
	}

	public void setTopics(Set<Topic> topics) {
		this.topics = topics;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "ttUser")
	public Set<Manager> getManagers() {
		return this.managers;
	}

	public void setManagers(Set<Manager> managers) {
		this.managers = managers;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "ttUser")
	public Set<Retopic> getRetopics() {
		return this.retopics;
	}

	public void setRetopics(Set<Retopic> retopics) {
		this.retopics = retopics;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "ttUser")
	public Set<Userinfo> getUserinfos() {
		return this.userinfos;
	}

	public void setUserinfos(Set<Userinfo> userinfos) {
		this.userinfos = userinfos;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "ttUser")
	public Set<Attachment> getAttachments() {
		return this.attachments;
	}

	public void setAttachments(Set<Attachment> attachments) {
		this.attachments = attachments;
	}

}