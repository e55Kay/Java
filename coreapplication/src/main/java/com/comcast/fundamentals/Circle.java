package com.comcast.fundamentals;

public class Circle {

	public static double calculateArea(double radius) {
		return (Math.PI*radius*radius);
	}
	
	public static void main(String[] args) {
		System.out.println("Area of Circle: " + calculateArea(12.5));
	}

}
