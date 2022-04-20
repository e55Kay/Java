package com.comcast.strings;

public class delete {

	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("Hello World");
		
		str.delete(1, 4);
		System.out.println(str);
		System.out.println(str.charAt(3));
		
		str.deleteCharAt(3);
		System.out.println(str);
		
		str.setLength(5);
		System.out.println(str);
		
		str.setCharAt(3, 'S');
		System.out.println(str);
		
		str.insert(1, "ell");
		System.out.println(str);
		

	}

}
