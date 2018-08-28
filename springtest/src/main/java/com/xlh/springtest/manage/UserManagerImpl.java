package com.xlh.springtest.manage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.xlh.springtest.dao.UserDao;
import com.xlh.springtest.dao.UserDao4OrclImpl;

@Service("userManager")
public class UserManagerImpl implements UserManager {

	@Autowired
	@Qualifier("userDao4OrclImpl")
	private UserDao userDao4OrclImpl;
	
	
	public UserManagerImpl() {
		super();
		// TODO Auto-generated constructor stub
	}



	public UserManagerImpl(UserDao userDao4OrclImpl) {
		this.userDao4OrclImpl = userDao4OrclImpl;
	}



	public void addUser(String username, String password) {
		
		userDao4OrclImpl.addUser(username, password);
	}

}
