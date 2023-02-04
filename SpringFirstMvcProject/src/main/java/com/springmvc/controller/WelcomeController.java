package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springmvc.bean.User;

@Controller
public class WelcomeController {

	//@RequestMapping(value = "/",method = RequestMethod.GET)
	@GetMapping("/")
	public String welcomePage(@ModelAttribute("user") User user) {
		user.setUserName("shubham");
		return "login";
	}
	
	@PostMapping("/login")
	public String loginPage(Model model,@ModelAttribute User user) {
		System.out.println(user.getPassword());
		return "welcome";
	}
	
	@GetMapping("/logout")
	public String logOut() {
		return "redirect:/";
	}
	
	@GetMapping("/controller")
	public String getWelcomePage() {
		return "welcome";
		
	}
	
	
}
