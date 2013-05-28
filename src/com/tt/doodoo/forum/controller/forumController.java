package com.tt.doodoo.forum.controller;

/**
 * @author jiuyuehe
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tt.doodoo.forum.service.TopicService;
import com.tt.doodoo.forum.utils.RandomValidateCode;



@Controller
public class forumController {

	private static final Logger log = LoggerFactory
			.getLogger(forumController.class);

	@Resource
	private TopicService topService;

	@RequestMapping("/index")
	public String welcome() {
		
		return "index";
	}

	@RequestMapping("/categoryList")
	public String catagoryList() {
		return "categoryList";
	}
	
	
	
	@RequestMapping("/toaddTopic")
	public String toaddTopic() {
		System.out.println("hello");
		return "toaddTopic";
	}
	
	@RequestMapping("/addTopic")
	public String addTopic(HttpServletRequest req,HttpServletResponse res) {
		try {
			req.setCharacterEncoding("UTF-8");
			String  categoryName = req.getParameter("categoryName");
			String  topicName = req.getParameter("topicName");
			String  topicContent = req.getParameter("topicContent");
			System.out.println(categoryName+topicName+topicContent);
//			TtTopic tt= new TtTopic();
//			tt.setCategoryName(categoryName);
//			tt.setTopicContent(topicContent);
//			tt.setTopicTheme(topicName);
//			tt = topService.publishTopic(tt);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	@RequestMapping("/showCategory")
	public String showCategory(HttpServletRequest req,HttpServletResponse res) {
		res.setCharacterEncoding("UTF-8");
		res.setContentType("html");
		 try {
			PrintWriter writer  = res.getWriter();
			writer.write("hello");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("hello");
		return null;
	}
	
	@RequestMapping("/topic/{categoryName}")
	public String showCategory(@RequestParam("categoryName") String categoryName,HttpServletRequest req,HttpServletResponse res) {
		res.setCharacterEncoding("UTF-8");
		res.setContentType("html");
		 try {
			PrintWriter writer  = res.getWriter();
			writer.write("hello");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("hello");
		return null;
	}
	
	@RequestMapping("/topic/{topicId}")
	public String topicInfo(@RequestParam("topicId") int topicId,HttpServletRequest req,HttpServletResponse res) {
		res.setCharacterEncoding("UTF-8");
		res.setContentType("html");
		 try {
			PrintWriter writer  = res.getWriter();
			writer.write("hello");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("hello");
		return null;
	}

	
	
	
	
}
