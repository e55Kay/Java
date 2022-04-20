package com.comcast.strings;

import java.util.Scanner;

public class rotPoly {
	public static boolean isPalindrome(StringBuffer str) {
		String s = str.toString();
		String r = str.reverse().toString();
		
		if(s.equals(r)) {
			return true;
		}
		
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string = sc.next();
		//StringBuffer temp = new StringBuffer("");
		StringBuffer str = new StringBuffer(string);
		
		//str = str.append(string);
		//temp = str;
		int count = 0;
		for(int i = 0; i < string.length() + 1; i++) {
			if(isPalindrome(str)) {
				++count;
			}
			str.reverse();
			
			//temp = new StringBuffer(str.substring(i, i + string.length()));
			//System.out.println(str);
			str = str.append(str.charAt(0)).deleteCharAt(0);
			//System.out.println(str);
			System.out.println(str);
			//System.out.println("");
		}
		
		System.out.println(count);
		sc.close();
	}

}
