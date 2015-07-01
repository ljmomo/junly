package com.it.junly.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.it.junly.mapper.UserMapper;
import com.it.junly.po.User;
import com.it.junly.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService {
	@Resource
	private UserMapper userMapper;
	@Override
	@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
	public User getUserById(int id) throws Exception {
		return userMapper.selectUserById(id);
	}

}
