package com.comcast.strings;

public class strReversing {

	public static void main(String[] args) {
		String str = "Hello World";
		String rev = "";
		char ch;

		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			rev = ch + rev;
		}
		System.out.println("Reversed word: " + rev);
	}
}
