package com.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

// localhost:8080/appName/admin/insert

@Controller
public class ControllerClass {

	@RequestMapping(value="/",method = RequestMethod.GET)
	public ModelAndView getIndexPage() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("first");
		return modelAndView;
	}
	
	
}
