package com.comcast.strings;

public class stringOperations {

	public static void main(String[] args) {
		
		String str = "The boy is the king and is an old man";
		String strings[] = str.split(" ");
		
		for(String i : strings) {
			System.out.println(i);
		}
		System.out.println("");
		strings = str.split(" ",4);
		for (String i : strings) { 
			System.out.println(i);
		}
		System.out.println("");
		/*System.out.println(str.indexOf("is"));
		System.out.println(str.lastIndexOf("is"));
		System.out.println(str.lastIndexOf("an"));
		System.out.println(str.lastIndexOf("an" , 22));
		System.out.println("");
		
		str = "Hello";
		System.out.println(str.compareTo("Alo"));
		System.out.println(str.compareTo("Welcome"));
		System.out.println(str.compareTo("Hello"));
		System.out.println(str.compareTo("hello"));
		System.out.println(str.compareToIgnoreCase("hello"));
		
		
		
		String str = "Hello World";
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.isEmpty());
		System.out.println(str.length());
		System.out.println(str.charAt(6));
		System.out.println(String.join(" ",str, "This", "is", "Java"));*/
		
	}

}
