package com.comcast.programs;

public class AP_GP {
	public static int AP(int a, int d, int i) {
		return (a + (i - 1) * d);
	}
	
	public static int GP(int a, int d ,int i) {
		return (int) (a*Math.pow(d, i-1));
	}
	public static void main(String[] args) {
		int a = 2, d = 2;
		
		System.out.println("15th Element AP: " + AP(a,d,15));
		System.out.println("18th Element GP: " + GP(a,d,18));

	}

}
