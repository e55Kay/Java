package com.comcast.statement;

public class SwitchDemo {

	public static void main(String[] args) {
		
		int x = 6 % 5;
		
		switch(x) {
		case 0:
			System.out.println("Case 0");
			break;
		case 1:
			System.out.println("Case 1");
			break;
		default:
			System.out.println("Default");
			break;
		}

	}

}
