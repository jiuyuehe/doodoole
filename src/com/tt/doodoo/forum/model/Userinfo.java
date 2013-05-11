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
 * Userinfo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "userinfo", catalog = "forum")
public class Userinfo implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1663687087586818574L;
	private Integer infoId;
	private TtUser ttUser;
	private String infoName;
	private Integer infoSex;
	private String infoIcon;
	private String infoAddress;
	private Integer infoScores;
	private Integer infoAuthority;

	// Constructors


	// Property accessors
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "info_id", unique = true, nullable = false)
	public Integer getInfoId() {
		return this.infoId;
	}

	public void setInfoId(Integer infoId) {
		this.infoId = infoId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	public TtUser getTtUser() {
		return this.ttUser;
	}

	public void setTtUser(TtUser ttUser) {
		this.ttUser = ttUser;
	}

	@Column(name = "info_name", length = 32)
	public String getInfoName() {
		return this.infoName;
	}

	public void setInfoName(String infoName) {
		this.infoName = infoName;
	}

	@Column(name = "info_sex")
	public Integer getInfoSex() {
		return this.infoSex;
	}

	public void setInfoSex(Integer infoSex) {
		this.infoSex = infoSex;
	}

	@Column(name = "info_icon", length = 128)
	public String getInfoIcon() {
		return this.infoIcon;
	}

	public void setInfoIcon(String infoIcon) {
		this.infoIcon = infoIcon;
	}

	@Column(name = "info_address", length = 128)
	public String getInfoAddress() {
		return this.infoAddress;
	}

	public void setInfoAddress(String infoAddress) {
		this.infoAddress = infoAddress;
	}

	@Column(name = "info_scores", nullable = false)
	public Integer getInfoScores() {
		return this.infoScores;
	}

	public void setInfoScores(Integer infoScores) {
		this.infoScores = infoScores;
	}

	@Column(name = "info_authority", nullable = false)
	public Integer getInfoAuthority() {
		return this.infoAuthority;
	}

	public void setInfoAuthority(Integer infoAuthority) {
		this.infoAuthority = infoAuthority;
	}

}