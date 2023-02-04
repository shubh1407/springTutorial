package com.springmvc.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springmvc.bean.User;

@RestController // Controller and ResponseBody
public class RestControllerClass {

	@PostMapping("/restController/{num}")
	public User getWelcomeString(@RequestBody User user,@PathVariable int num,@RequestParam String name) {
		System.out.println(user.getUserName());
		System.out.println(user.getPassword());
		user.setUserName(name);
		user.setPassword(""+num);
		return user;
		
	}
	
}
