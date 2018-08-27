package com.xlh.springtest.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xlh.springtest.dao.UserDao4OrclImpl;
import com.xlh.springtest.manage.UserManager;
import com.xlh.springtest.manage.UserManagerImpl;

public class Client {

	public static void main(String [] args){
		//由我们的应用程序负责定位
		BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		UserManager userManagaer = (UserManager)factory.getBean("userManager");
		
		userManagaer.addUser("张三", "123");
	}
}
