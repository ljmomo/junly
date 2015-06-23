package com.it.junly.service;

import java.util.List;

import com.it.junly.po.Authority;

public interface AuthorityService {
	public List<Authority> selectAuthorityALL(String parentMenucode);
}
