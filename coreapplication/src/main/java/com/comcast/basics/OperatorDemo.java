package com.comcast.basics;

class Arithmetic {
	int num1, num2, result;
	
	void addition() {
		result = num1 - num2;
		System.out.format("The Sum of the Two numbers %d and %d is %d\n", num1, num2 ,result);
	}
	
	void subtraction()
	{
		result = num1 - num2;
		System.out.format("The Subtraction of the Two numbers %d and %d is %d\n", num1, num2 ,result);
	}
	
	void printSmaller()
	{
		result = num1 < num2 ? num1 : num2;
		System.out.format("The Smallest of the Two numbers %d and %d is %d\n", num1, num2 ,result);
	}
}

public class OperatorDemo {

	public static void main(String[] args) {
		Arithmetic art;
		art = new Arithmetic();
		
		art.num1 = 24;
		art.num2 = 16;
		art.addition();
		art.subtraction();
		art.printSmaller();
		
	}

}
