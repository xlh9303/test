package com.xlh.springtest.dao;

import org.springframework.stereotype.Repository;

@Repository("userDao4MySqlImpl")
public class UserDao4MySqlImpl implements UserDao {

	public void addUser(String username, String password) {
		// TODO Auto-generated method stub
		System.out.println("UserDao4MySqlImpl.addUser()");
	}

}
