package com.springmvc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerClass {

	@RequestMapping(value = "/get",method = RequestMethod.GET)
	public StudentRecord firstRestCpntrollerMethod() {
		return new StudentRecord();
	}
}
