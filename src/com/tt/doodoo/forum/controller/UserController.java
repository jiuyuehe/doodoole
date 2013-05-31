package com.tt.doodoo.forum.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.tt.doodoo.forum.service.UserService;
import com.tt.doodoo.forum.utils.RandomValidateCode;

/**
 * 用户业务控制
 * @author jiuyuehe
 *
 */

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	private HttpServletRequest request ;
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
	
	@RequestMapping(value="/doRegister",method=RequestMethod.POST)
	public String doRegister(HttpServletRequest request ,HttpServletResponse response) {
		//String code = (String)request.getAttribute("RANDOMVALIDATECODEKEY");
		HttpSession session = request.getSession();
		String code  = (String)session.getAttribute("RANDOMVALIDATECODEKEY");
		System.out.println("yan  zheng ma shi :::"+code);
		
		
		
		return null;
	}
	
	/**
	 * 单个上傳文件
	 * @param name
	 * @param file
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "/pic/uploadOne", method = RequestMethod.POST)
	public String handleFormUpload(@RequestParam("Filedata" ) MultipartFile file,HttpServletRequest request,HttpServletResponse response) throws IOException {
		String ctxPath = request.getSession().getServletContext().getRealPath("/")+ "images/";  
		
		if (!file.isEmpty()) {
		String type = 	file.getContentType();
		String realFileName = file.getOriginalFilename();
		 File dirPath = new File(ctxPath);  
	        if (!dirPath.exists()) {  
	            dirPath.mkdir();  
	        }  
	        File uploadFile = new File(ctxPath + realFileName);  
	        FileCopyUtils.copy(file.getBytes(), uploadFile); 
		}
		
		return null;
	}

	

	
	
}


