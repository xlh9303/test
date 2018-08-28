package com.xlh.springtest.dao;

import org.springframework.stereotype.Repository;

@Repository("userDao4OrclImpl")
public class UserDao4OrclImpl implements UserDao {

	public void addUser(String username, String password) {
		// TODO Auto-generated method stub
		System.out.println("UserDao4OrclImpl.addUser()");
	}

}
