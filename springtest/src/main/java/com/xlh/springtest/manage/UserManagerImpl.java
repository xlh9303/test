package com.xlh.springtest.manage;

import com.xlh.springtest.dao.UserDao;
import com.xlh.springtest.dao.UserDao4OrclImpl;

public class UserManagerImpl implements UserManager {

	private UserDao userDao;
	
	
	
	public UserManagerImpl(UserDao userDao) {
		this.userDao = userDao;
	}



	@Override
	public void addUser(String username, String password) {
		
		userDao.addUser(username, password);
	}

}
