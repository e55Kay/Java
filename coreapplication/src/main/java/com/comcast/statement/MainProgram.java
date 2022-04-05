package com.comcast.statement;

class NumberCheck {
	int num1, num2, num3;
	
	NumberCheck(int num1, int num2, int num3) {
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}
	
	void displayBigNumber() {
		int result;
		
		if (num1 > num2 && num1 > num3)
			result = num1;
		else if (num2 > num3)
			result = num2;
		else
			result = num3;
		
		System.out.println(result + " is the Biggest Number");
	}
}

public class MainProgram {

	public static void main(String[] args) {
		NumberCheck numCheck = new NumberCheck(11,18,7);
		
		numCheck.displayBigNumber();
	}

}
