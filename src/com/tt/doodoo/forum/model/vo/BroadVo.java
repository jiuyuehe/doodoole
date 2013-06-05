package com.tt.doodoo.forum.model.vo;

public class BroadVo implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5343420845250555492L;
	private Integer broadId;
	private String broadName;
	private String broadDesc;
	private Integer broadTopicNum;
	private Integer broadParentId;
	private Integer broadLevel;
	private String broadIcon;

	public Integer getBroadId() {
		return broadId;
	}

	public void setBroadId(Integer broadId) {
		this.broadId = broadId;
	}

	public String getBroadName() {
		return broadName;
	}

	public void setBroadName(String broadName) {
		this.broadName = broadName;
	}

	public String getBroadDesc() {
		return broadDesc;
	}

	public void setBroadDesc(String broadDesc) {
		this.broadDesc = broadDesc;
	}

	public Integer getBroadTopicNum() {
		return broadTopicNum;
	}

	public void setBroadTopicNum(Integer broadTopicNum) {
		this.broadTopicNum = broadTopicNum;
	}

	public Integer getBroadParentId() {
		return broadParentId;
	}

	public void setBroadParentId(Integer broadParentId) {
		this.broadParentId = broadParentId;
	}

	public Integer getBroadLevel() {
		return broadLevel;
	}

	public void setBroadLevel(Integer broadLevel) {
		this.broadLevel = broadLevel;
	}

	public String getBroadIcon() {
		return broadIcon;
	}

	public void setBroadIcon(String broadIcon) {
		this.broadIcon = broadIcon;
	}

}
