package com.comcast.passargs;

class Test {
	int a, b;
	
	public Test(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public void alternativePrimitive(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public void altObject(Test obj) {
		obj.a = 65;
		obj.b = 72;
	}
}

public class ObjectArg {

	public static void main(String[] args) {
		
		Test test = new Test(100, 150);
		System.out.println("Initial Object: " + test.a + " " + test.b);
		
		test.alternativePrimitive(20, 35);
		System.out.println("Alternative Primitive: " + test.a + " " + test.b);
		
		test.altObject(test);
		System.out.println("Alternative Object: " + test.a + " " + test.b);
	}

}
