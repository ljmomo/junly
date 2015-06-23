package com.it.junly.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.it.junly.po.User;
import com.it.junly.service.UserService;

@Controller
public class UserController {
	@Resource
	private UserService userService;
	@RequestMapping("/helloWorld")
	public String helloWorld(Model model) throws Exception
	{
		User user  = userService.getUserById(3);
		System.out.println("返回"+user.getUsername());
		model.addAttribute("user", user);
		return "helloworld";
	}
}
