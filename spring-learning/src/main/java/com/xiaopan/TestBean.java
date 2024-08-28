package com.xiaopan;

import com.xiaopan.config.ApplicationConfigure;
import com.xiaopan.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestBean {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfigure.class);
		UserService userService = (UserService) applicationContext.getBean("userServiceImpl");
		userService.show();
	}
}
