package com.it.junly.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.it.junly.mapper.AuthorityMapper;
import com.it.junly.po.Authority;
import com.it.junly.service.AuthorityService;
@Service("authorityService")
public class AuthorityServiceImpl implements AuthorityService {

	@Resource
	private AuthorityMapper authorityMapper;
	@Override
	public List<Authority> selectAuthorityALL(String parentMenucode) {
		List<Authority> list =  authorityMapper.selectAuthorityALL(parentMenucode);
		return list;
	}

}
