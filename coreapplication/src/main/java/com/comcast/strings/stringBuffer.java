package com.comcast.strings;

public class stringBuffer {

	public static void main(String[] args) {
		String string = "Hello World";
		StringBuffer str = new StringBuffer(string);
		System.out.println("Reverse: " + str.reverse());
		str.replace(6, 10, "Everyone");
		System.out.println(str);
		str.append("ok");
		System.out.println(str);
		

	}

}
