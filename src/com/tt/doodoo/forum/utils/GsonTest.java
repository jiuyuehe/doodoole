package com.tt.doodoo.forum.utils;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonTest {
	
	
	public static void main(String[] args) {
		
		
		
		List<Integer> ilist = new ArrayList<Integer>();
		ilist.add(1);
		ilist.add(12);
		ilist.add(3);
		
		Pet p =new Pet();
		p.setAdd("add1");
		p.setMa("mamam");
		p.setOct("oct");
		p.setSes("sess");
		p.setManagers(ilist);
		Pet p1 =new Pet();
		p1.setAdd("add2");
		p1.setMa("mamam");
		p1.setOct("oct");
		p1.setSes("sess");
		p1.setManagers(ilist);
		Pet p2 =new Pet();
		p2.setAdd("add3");
		p2.setMa("mamam");
		p2.setOct("oct");
		p2.setSes("sess");
		p2.setManagers(ilist);
		
		
		List<Pet> oList = new ArrayList<Pet>();
		oList.add(p1);
		oList.add(p2);
		oList.add(p);
		
		Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
		System.out.println(gson.toJson(p));
		System.out.println(gson.toJson(oList));
		
		Gson g = new Gson();
		String json = g.toJson(p);
		Pet pt= g.fromJson(json, Pet.class);
	}
}
