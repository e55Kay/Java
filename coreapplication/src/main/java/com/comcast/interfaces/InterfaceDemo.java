package com.comcast.interfaces;

interface ISecond {
	String text = "Welcome";
	void display4();
}

public class InterfaceDemo implements IFirst, ISecond {

	public static void main(String[] args) {
		IFirst iFirst = new InterfaceDemo();
		ISecond iSecond = new InterfaceDemo();
		
		System.out.println("Pi value: " + pi);
		System.out.println("Message: " + message);
		iFirst.display1();
		iFirst.display2();
		IFirst.display3();
		
		System.out.println("ISecond Text: " + ISecond.text);
		iSecond.display4();

	}

	@Override
	public void display1() {
		System.out.println("IFirst Abstract - Interface concreate method");
		
	}

	@Override
	public void display4() {
		System.out.println("ISecond Abstract - Interface concreate method");
	}

}
