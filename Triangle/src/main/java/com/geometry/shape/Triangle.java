package com.geometry.shape;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.geometry.shape.Point;


public class Triangle implements ApplicationContextAware,Shape {

	Point a;
	Point b;
	Point c;
	String name;
	String type;
	
	protected Triangle() {
	}
	public Triangle(String name, String type) {
		this.name = name;
		this.type = type;
	}

	public Point getA() {
		return a;
	}
	@Required
	public void setA(Point a) {
		this.a = a;
	}

	public Point getB() {
		return b;
	}
	@Required
	public void setB(Point b) {
		this.b = b;
	}

	public Point getC() {
		return c;
	}
	@Required
	public void setC(Point c) {
		this.c = c;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void Display(){
		System.out.println("Point A: (" + this.getA().getX() + ","+ this.getA().getY() +")");
		System.out.println("Point B: (" + this.getB().getX() + ","+ this.getB().getY() +")");
		System.out.println("Point C: (" + this.getC().getX() + ","+ this.getC().getY() +")");
		System.out.println(this.getName() +" "+this.getType());
	}
	public void init(){
		System.out.println("Creating a Triangle");
	}
	public void setApplicationContext(ApplicationContext arg0)
			throws BeansException {
		// TODO Auto-generated method stub
		
	}
	public void draw() {
		System.out.println("This is a TRIANGLE");
		// TODO Auto-generated method stub
		System.out.println("Point A: (" + this.getA().getX() + ","+ this.getA().getY() +")");
		System.out.println("Point B: (" + this.getB().getX() + ","+ this.getB().getY() +")");
		System.out.println("Point C: (" + this.getC().getX() + ","+ this.getC().getY() +")");
		System.out.println(this.getName() +" "+this.getType());
	}
	
	
}
