package com.tt.doodoo.forum.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tt.doodoo.forum.utils.RandomValidateCode;

/**
 * 用户业务控制
 * @author jiuyuehe
 *
 */

@Controller
public class UserController {
	/**
	 * 管理员
	 * @param request
	 * @param response
	 * @return
	 */
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
	
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(HttpServletRequest request,HttpServletResponse response) {
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		
		
		return "login";
	}
	
	@RequestMapping("/getCode")
	public String getCode(HttpServletRequest request,HttpServletResponse response) {
		 	response.setContentType("image/jpeg");
	        response.setHeader("Pragma", "No-cache");
	        response.setHeader("Cache-Control", "no-cache");
	        response.setDateHeader("Expire", 0);
	        RandomValidateCode randomValidateCode = new RandomValidateCode();
	        try {
	            randomValidateCode.getRandcode(request, response);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
		return null;
	}
	
	@RequestMapping("/toregister")
	public String register() {
		
		return "register";
	}
	
	@RequestMapping("/doRegister")
	public String doRegister() {
		
		return null;
	}

}
