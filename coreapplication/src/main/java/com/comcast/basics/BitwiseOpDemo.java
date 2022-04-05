package com.comcast.basics;

class Bitwise {
	int num1, num2, result;
	
	void AND() {
		result = num1 & num2;
		System.out.format("The Bitwise AND the Two numbers %d and %d is %d\n", num1, num2 ,result);
	}
	
	void OR()
	{
		result = num1 | num2;
		System.out.format("The Bitwise OR of the Two numbers %d and %d is %d\n", num1, num2 ,result);
	}
	
	void XOR()
	{
		result = num1 ^ num2;
		System.out.format("The Bitwise XOR of the Two numbers %d and %d is %d\n", num1, num2 ,result);
	}
	
	void unaryNOT()
	{
		result = ~num1 + 1;
		System.out.format("The Unary NOT result of the number %d is %d\n", num1,result);
	}
}

public class BitwiseOpDemo {

	public static void main(String[] args) {
		Bitwise bit = null;
		bit = new Bitwise();
		
		bit.num1 = 15;
		bit.num2 = 5;
		
		bit.AND();
		bit.OR();
		bit.XOR();
		bit.unaryNOT();

	}

}
