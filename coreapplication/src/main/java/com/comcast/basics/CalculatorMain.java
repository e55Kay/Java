package com.comcast.basics;

class Calculator {

	int op1, op2;

	void displayOperand() {

		System.out.println("The value of operand 1 is " + op1);
		System.out.println("The value of operand 2 is " + op2);
	}
}

public class CalculatorMain {

	public static void main(String[] args) {

		Calculator cal = null;
		cal = new Calculator();
		cal.op1 = 98;
		cal.op2 = 43;
		cal.displayOperand();
	}
}
