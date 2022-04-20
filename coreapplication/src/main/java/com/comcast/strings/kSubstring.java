package com.comcast.strings;

import java.util.Scanner;

public class kSubstring {
	
	public static int getDistinct(String str) {
		System.out.println(str);
	      String temp="";
	      for (int i = 0; i < str.length(); i++) {
	         if(temp.indexOf(str.charAt(i)) == -1 ){
	             temp = temp + str.charAt(i);
	         }
	      }
	 
	      //System.out.println(temp);
	      //System.out.println("Unique character count: " + temp.length());
	      return temp.length();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next(), temp = "";
		int k = sc.nextInt(), dis = 0, count = 0;
		
		for(int i = 0; i < str.length() - k + 1; i++) {
			temp = str.substring(i, i + k);
			dis = getDistinct(temp);
			
			if(dis == k - 1) {
				++count;
			}
			
		}
		System.out.println(count);
		sc.close();

	}

}
