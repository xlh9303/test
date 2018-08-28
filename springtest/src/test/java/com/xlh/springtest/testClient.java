package com.xlh.springtest;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xlh.springtest.manage.UserManager;

public class testClient {

	private ClassPathXmlApplicationContext app;
	
	@Before
	public void init() {
        app = new ClassPathXmlApplicationContext("applicationContext.xml");
    }
	
	@Test
	public void test(){
		
		UserManager userManagaer = (UserManager)app.getBean("userManager");
		
		userManagaer.addUser("张三", "123");
	}
}
