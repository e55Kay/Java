package com.comcast.fundamentals;

class Overload {
	String test()
	{
		return("This is Default test() method");
	}
	String test(String name)
	{
		return ("Single argument method: " + name);
	}
	String test(String fname, String lname) { 
		return ("Double argument method: " + fname + " " + lname);
	}
}
public class OverloadDemo {

	public static void main(String[] args) {
		Overload overload = new Overload();
		System.out.println(overload.test());
		System.out.println(overload.test("ok"));
		System.out.println(overload.test("ok","ko"));

	}

}
