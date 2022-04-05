package com.comcast.fundamentals;

public class ReturnDemo {
	public String getNumberInWords(int n) {
		if(n == 1) {
			return "one";
		} else if (n == 2) {
			return "two";
		} else if (n == 2) {
			return "three";
		} else {
			return "Not-matched";
		}
	}
	public String getNumberInWord(int n) {
		String inWords = "Not Matched";
		if(n == 1) {
			inWords = "one";
		} else if (n == 2) {
			inWords = "two";
		} else if (n == 2) {
			inWords = "three";
		} 
		return inWords;
	}
	public static void main(String[] args) {
		ReturnDemo returnDemo = new ReturnDemo();
		String numInWords = returnDemo.getNumberInWords(2);
		System.out.println("Number in words: " + numInWords);
	}

}
