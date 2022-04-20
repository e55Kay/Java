package com.comcast.strings;

import java.util.Scanner;

public class palindrome {

	static boolean isPalindrome(String str)
    {
        int i = 0, j = str.length() - 1;

        while (i < j) {

            if (str.charAt(i) != str.charAt(j))
                return false;
 
            i++;
            j--;
        }
 
        return true;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		if(isPalindrome(input))
			System.out.println("Is a palindrome");
		else
			System.out.println("Not a palindrome");
		
		sc.close();
	}

}
