package com.ibm.training.springblock.oopsprograms;

import java.util.Scanner;

abstract class Shape{
	final double pi=3.14;
	
	public void draw() {
		System.out.println("drawn");
	}
	public abstract void erase();
	 abstract void area();
	
}

class Circle extends Shape{
 int radius;
 double area;
	Circle(int radius){
		this.radius=radius;
	}
	
	public void erase() {
		System.out.println("circle errased");
	}

	@Override
	void area() {
		area=pi*radius*radius;
		System.out.println(area);
		
	}
	
}

class Square extends Shape{
int side;
	Square(int side){
		this.side=side;
	}
	@Override
public	void erase() {
		System.out.println("Square errased");
		
	}

	@Override
	void area() {
		double area=side*side;
		System.out.println(area+"of square");
		
	}
	
}
public class Demo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter shape which you want?");
		String myShape=sc.next();
		Shape shape;
		switch(myShape) {
		case "circle":
			shape=new Circle(5);
			shape.draw();
			shape.area();
			shape.erase();
			break;
		case "square":
			shape=new Square(7);
			shape.draw();
			shape.area();
			shape.erase();
			break;
		default:
			System.out.println("invalid shape");
		}

	}

}
