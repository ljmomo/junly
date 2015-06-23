package com.it.junly.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.it.junly.mapper.UserMapper;
import com.it.junly.po.User;
import com.it.junly.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService {
	@Resource
	private UserMapper userMapper;
	@Override
	public User getUserById(int id) throws Exception {
		return userMapper.selectUserById(id);
	}

}
