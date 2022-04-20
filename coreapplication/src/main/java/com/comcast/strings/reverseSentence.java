package com.comcast.strings;

public class reverseSentence {

	public static void main(String[] args) {
		String string = "Hello World";
		String words[] = string.split(" "), result = "";
		
		for(String i: words) {
			result = i + " " + result;
		}
		
		System.out.println(result);

	}

}
