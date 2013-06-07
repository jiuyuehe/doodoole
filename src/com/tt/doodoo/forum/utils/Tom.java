package com.tt.doodoo.forum.utils;

import com.google.gson.annotations.Expose;

public class Tom {
	@Expose
	private String name;
	@Expose
	private String age;
	private String big;
	@Expose
	private Pet pet;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getBig() {
		return big;
	}
	public void setBig(String big) {
		this.big = big;
	}
	public Pet getPet() {
		return pet;
	}
	public void setPet(Pet pet) {
		this.pet = pet;
	}
	
	

}
