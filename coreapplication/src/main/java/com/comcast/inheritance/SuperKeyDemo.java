package com.comcast.inheritance;

class Base {
	
	public void printMsg() {
		System.out.println("Base Class - printMsg() method");
	}
	
}

class Derived extends Base {
	@Override
	public void printMsg() {
		super.printMsg();
		System.out.println("Derived Class - printMsg() method");
	}
}

public class SuperKeyDemo {

	public static void main(String[] args) {
		Derived derived = new Derived();
		derived.printMsg();

	}

}
