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
 * Attachment entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "attachment", catalog = "forum")
public class Attachment implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = -8422416491438276374L;
	
	private Integer attachId;
	private TtUser ttUser;
	private String attachName;
	private String attachPath;
	private Integer attachType;
	private Date attachUploadtime;

	// Constructors


	// Property accessors
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "attach_id", unique = true, nullable = false)
	public Integer getAttachId() {
		return this.attachId;
	}

	public void setAttachId(Integer attachId) {
		this.attachId = attachId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	public TtUser getTtUser() {
		return this.ttUser;
	}

	public void setTtUser(TtUser ttUser) {
		this.ttUser = ttUser;
	}

	@Column(name = "attach_name", length = 50)
	public String getAttachName() {
		return this.attachName;
	}

	public void setAttachName(String attachName) {
		this.attachName = attachName;
	}

	@Column(name = "attach_path", length = 128)
	public String getAttachPath() {
		return this.attachPath;
	}

	public void setAttachPath(String attachPath) {
		this.attachPath = attachPath;
	}

	@Column(name = "attach_type")
	public Integer getAttachType() {
		return this.attachType;
	}

	public void setAttachType(Integer attachType) {
		this.attachType = attachType;
	}

	@Column(name = "attach_uploadtime")
	public Date getAttachUploadtime() {
		return attachUploadtime;
	}
	public void setAttachUploadtime(Date attachUploadtime) {
		this.attachUploadtime = attachUploadtime;
	}

	

}