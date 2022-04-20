package com.comcast.strings;
import java.util.Scanner;

public class strRotation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string: ");
		StringBuffer str = new StringBuffer(sc.next());
		int len = str.length();
		
		str = str.append(str);
		//System.out.println(str);
		//abcdabcd
		
		for(int i = 0; i < len; i++) {
			System.out.println(str.substring(i, i + len));
		}
		
		sc.close();

	}

}
