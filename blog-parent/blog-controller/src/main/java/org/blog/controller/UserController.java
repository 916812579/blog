package org.blog.controller;

import javax.annotation.Resource;

import org.blog.model.User;
import org.blog.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
// @RequestMapping("/admin/user")
public class UserController {

	@Resource
	UserService userService;
	
	@RequestMapping("/login")
	public String login(User user) {
		return "login";
	}
	
	@RequestMapping("/delete")
	public void delete(Integer id) {
		userService.deleteById(id);
	}
	
	@RequestMapping("/update")
	public void update(User user) {
		userService.update(user);
	}

}
