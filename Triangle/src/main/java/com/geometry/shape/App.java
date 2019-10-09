package com.geometry.shape;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world! practice ulit :)
 * 
 */
public class App {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

//		Triangle triangle = (Triangle)context.getBean("Triangle");
//		triangle.Display();
//		
//		Square square = (Square)context.getBean("Square");
//		square.Display();
		
		Shape shape = (Shape)context.getBean("Triangle");
		shape.draw();
	}
}
