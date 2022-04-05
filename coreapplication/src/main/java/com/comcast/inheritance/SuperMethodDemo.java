package com.comcast.inheritance;

class A {
	A(String location) {
		System.out.println("Location: " + location);
	}
}

class B extends A {
	B(String name) {
		super("Chennai");
		System.out.println("Name: " + name);
	}
}

public class SuperMethodDemo {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		B b = new B("Ok");
	}
}
