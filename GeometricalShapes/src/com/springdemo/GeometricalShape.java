/*
 * annotation+xml based configuration
 */
package com.springdemo;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

interface Shape{
	
	void getArea();
	
}

class GetShape {
	
	int num;
	
}

@Component
@Scope(scopeName = "prototype")
class Triangle implements Shape{

	@Value("10")  //Setter injection
	int side1;
	int side2;
	int side3;


	//Constructor injection
	public Triangle(@Value("10") int side1, @Value("20") int side2, @Value("40") int side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	
	@Override
	public void getArea() {
		double peri = (side1+side2+side3)/2;
		double area =  Math.sqrt(Math.abs((peri)*(peri-side1)*(peri-side2)*(peri-side3)));
		System.out.println("Area of triangle is "+area);	
	}
	
}

@Component(value="equilTriangle")
@Scope(scopeName = "singleton")
class EquilateralTriangle extends Triangle{

	
	
	public EquilateralTriangle(@Value("10") int sides) {
		super(sides, sides,sides);
		// TODO Auto-generated constructor stub
	}
	
}

@Component(value="isocTriangle")
class IsocelesTriangle extends Triangle{

	
	
	public IsocelesTriangle(@Value("10") int side1, @Value("20") int side2) {
		super(side1, side2, side2);
		// TODO Auto-generated constructor stub
	}
	
	@PostConstruct
	@PreDestroy
	public void dest() {
		// TODO Auto-generated method stub

	}
	
}

@Component
class Rectangle implements Shape{
	
	int length;
	int breadth;
	
	
	
	public Rectangle(@Value("10") int length, @Value("20") int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public void getArea() {
		System.out.println("Area of Rectangle is "+length*breadth);
		
	}
	
}

@Component
class Square extends Rectangle{
	
	public Square(@Value("20") int side) {
		super(side, side);
		// TODO Auto-generated constructor stub
	}
	
}



public class GeometricalShape {

	private static ApplicationContext applicationContext;

	public static void main(String[] args) {
		
		
		applicationContext = new AnnotationConfigApplicationContext(SpringConf.class);
		
		Shape shape = applicationContext.getBean("getTriangle",Triangle.class);
		shape.getArea();
		
		Shape shape2 = applicationContext.getBean("equilTriangle",EquilateralTriangle.class); // new EquilateralTriangle(10); 
		shape2.getArea();
		
		Shape shape3= applicationContext.getBean("isocTriangle",IsocelesTriangle.class);     // new IsocelesTriangle(10,20);
		shape3.getArea();
		
		Shape shape4 =  applicationContext.getBean("rectangle",Rectangle.class);             //new Rectangle(10, 20);
		shape4.getArea();
		
		Shape shape5 =  applicationContext.getBean("square",Square.class);   //new Square(20); 
		shape5.getArea();
		
		GetShape getShape = applicationContext.getBean("getShape",GetShape.class);
		System.out.println(getShape.num);
		
	}
}
