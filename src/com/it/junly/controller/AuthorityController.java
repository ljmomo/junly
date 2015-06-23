package com.it.junly.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.it.junly.po.Authority;
import com.it.junly.service.AuthorityService;

@Controller
@RequestMapping("authority")
public class AuthorityController {
	@Resource
	private AuthorityService authorityService;
	@RequestMapping("/getAuthority")
	public ModelAndView getAuthority()
	{
	    List<Authority> list = authorityService.selectAuthorityALL("0");
		return new ModelAndView("back/index", "authority", list) ;
	}
	
}
