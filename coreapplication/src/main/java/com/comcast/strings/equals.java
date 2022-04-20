package com.comcast.strings;

public class equals {

	public static void main(String[] args) {
		String str = "hello";
		String str2 = "hello";
		String str3 = "HELLO";
		
		System.out.println(str.equals(str2));
		System.out.println(str.equals(str3));
		System.out.println(str.equalsIgnoreCase(str3));

	}

}
