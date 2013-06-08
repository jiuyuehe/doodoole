package com.tt.doodoo.forum.utils;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class CheckAuthor implements MethodBeforeAdvice {
	/**
	 * 此处处理登录信息
	 */
	public void before(Method method, Object[] args, Object target)
			throws Throwable {
		System.out.println("--------testBeforeAdvice------------");
	}

}
