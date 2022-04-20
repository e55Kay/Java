package com.comcast.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class palindromeArrList {
	
	public static boolean isPalindrome(int n) {
		int r = 0, t = n;
		
		while(t > 0) {
			r = r*10 + t%10;
			t = t/10;
		}
		
		if (r == n) {
			return true;
		}
		
		return false;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int count = 0;
		
		System.out.print("No. of elements: ");
		int n = sc.nextInt();
		
		for(int j = 0; j < n; j++)
			list.add(sc.nextInt());
		
		for (int i: list) {
			if(isPalindrome(i)) {
				++count;
			}
		}
		
		System.out.println("No. of palindromes: " + count);
		sc.close();
	}

}
