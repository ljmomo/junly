package com.it.junly.dao;

import com.it.junly.po.User;

public interface UserDao {
	public User getUserById(int id) throws Exception;
	public void insertUser(User user) throws Exception;
}