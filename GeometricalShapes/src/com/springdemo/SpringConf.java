package com.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;

@ComponentScan(basePackages ="com.springdemo")
public class SpringConf {

	@Bean
	public GetShape getShape() {
		GetShape getShape= new GetShape();  //
		getShape.num=10;  //
		return getShape;
		
	}
	
	@Bean(initMethod = "init", destroyMethod = "destroyMethod")
	@Scope(scopeName = "singleton")
	public Triangle getTriangle() {
		return new Triangle(10, 10,10);
	}
	
	
}
