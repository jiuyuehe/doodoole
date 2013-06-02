package com.tt.doodoo.forum.utils;

import java.util.Map;
/**
 * 
 * @author jiuyuehe
 *	服务器返回的错误信息
 */
public class ErrorMessage {
	
	//错误标志
	private boolean successed = false;
	//错误内容
	private Map<String,String> errorMsg=null;
	public boolean isSuccessed() {
		return successed;
	}
	public void setSuccessed(boolean successed) {
		this.successed = successed;
	}
	public Map<String, String> getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(Map<String, String> errorMsg) {
		this.errorMsg = errorMsg;
	}
	
	
	//private Object returnObj =null;
	
	

}
