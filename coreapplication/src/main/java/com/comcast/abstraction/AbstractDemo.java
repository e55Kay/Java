package com.comcast.abstraction;

abstract class Shape {
	String color;
	public void setColor(String color) {
		this.color = color;
	}
	
	abstract double calculateArea();
}

class Circle extends Shape {
	double radius;
	public Circle (double radius) {
		this.radius = radius;
	}
	
	@Override
	double calculateArea() {
		return (Math.PI*radius*radius);
	}
}

class Square extends Shape {
	double length;
	double breadth;
	public Square(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	@Override
	double calculateArea() {
		return (length * breadth);
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
		Shape shape = new Circle(12.5);
		shape.setColor("Green");
		System.out.println("Area of cirlce: " + shape.calculateArea());
		
		shape = new Square(8.5, 8.5);
		shape.setColor("Yellow");
		System.out.println("Area of square: " + shape.calculateArea());

	}

}
