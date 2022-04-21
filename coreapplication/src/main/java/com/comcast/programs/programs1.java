package com.comcast.programs;

public class programs1 {
	public static boolean checkAnagram(String str, String str2) {
		if(str.length() != str2.length())
			return false;
		
		int alpha[] = new int[26];
		//System.out.println('h' - 96);
		for(int i = 0; i < str.length(); i++) {
			++alpha[str.charAt(i) - 97];
			--alpha[str2.charAt(i) - 97];
		}
		
		for(int i: alpha) {
			if(i != 0)
				return false;
		}

		return true;
	}

	public static void diamondStar(int n) {

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n - i -1; j++)
				System.out.print(" ");

			for (int j = 0; j <= i; j++)
				System.out.print("* ");

			System.out.print("\n");
		}


		for (int i = n; i > 0; i--) {

			for (int j = 0; j < n - i; j++)
				System.out.print(" ");

			for (int j = 0; j < i; j++)
				System.out.print("* ");

			System.out.print("\n");
		}
	}
	
	public static String removeWhiteSpace(String str) {
		int st = 0, en = str.length() - 1;
		
		while(st < str.length() && str.charAt(st) == ' ') {
			++st;
		}
		
		while(en >= 0 && str.charAt(en) == ' ') {
			--en;
		}
		return(str.substring(st, en + 1));
	}
	
	public static double ms2s(int ms) {
		double sec = (double) ms/1000;
		return sec;
	}

	public static void main(String[] args) {
		System.out.println(checkAnagram("hello", "elloh"));
		System.out.println(checkAnagram("hello", "holla"));
		diamondStar(5);
		System.out.println(removeWhiteSpace("  Hello World   ") + "check");
		System.out.println("41235 ms = "+ ms2s(41235) + " seconds");

	}

}
