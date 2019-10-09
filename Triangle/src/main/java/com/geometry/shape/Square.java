package com.geometry.shape;

import java.util.ArrayList;

public class Square implements Shape {
	
	ArrayList<Point> points = new ArrayList<Point>();
	String name;
	
	public ArrayList<Point> getPoints() {
		return points;
	}
	public void setPoints(ArrayList<Point> points) {
		this.points = points;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void Display(){
		for(Point point:this.getPoints()){
			System.out.println("Point: ("+point.getX()+","+point.getY()+")");
		}
	}
	public void init(){
		System.out.println("Creating a Square");
	}
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("THIS IS A SQUARE");
		for(Point point:this.getPoints()){
			System.out.println("Point: ("+point.getX()+","+point.getY()+")");
		}
	}

}
