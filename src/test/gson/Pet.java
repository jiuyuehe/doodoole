package test.gson;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.google.gson.annotations.Expose;
import com.tt.doodoo.forum.model.Manager;

public class Pet{
	
	@Expose
	private String ma;
	@Expose()
	private String ses;
	@Expose()
	private String add;
	
	private String oct;
	
	@Expose
	private List<Integer> managers = new ArrayList<Integer>();
	
	
	
	
	
	public String getMa() {
		return ma;
	}
	public void setMa(String ma) {
		this.ma = ma;
	}
	public String getSes() {
		return ses;
	}
	public void setSes(String ses) {
		this.ses = ses;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public String getOct() {
		return oct;
	}
	public void setOct(String oct) {
		this.oct = oct;
	}
	public List<Integer> getManagers() {
		return managers;
	}
	public void setManagers(List<Integer> managers) {
		this.managers = managers;
	}
	
	
	
}
