package com.comcast.interfaces;

public interface IFirst {
	double pi = 3.14;
	String message = "Hello";
	void display1();
	default void display2() {
		System.out.println("Default - Interface concreate method");
	}
	static void display3() {
		System.out.println("Static - Interface concreate method");
	}
}
