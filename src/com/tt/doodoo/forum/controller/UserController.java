package com.tt.doodoo.forum.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class UserController {
	
	@RequestMapping("/admin/tologin")
	public String admintoLogin(HttpServletRequest request,HttpServletResponse response) {
		
		return "managerLogin";
	}
	
	@RequestMapping("/adminlogin")
	public String adminlogin(HttpServletRequest request,HttpServletResponse response) {
		
		return "managerIndex";
	}
	
	
	@RequestMapping("/tologin")
	public String toLogin(HttpServletRequest request,HttpServletResponse response) {
		
		return "login";
	}
	
	@RequestMapping("/login")
	public String login(HttpServletRequest request,HttpServletResponse response) {
		
		return "login";
	}
	

}
