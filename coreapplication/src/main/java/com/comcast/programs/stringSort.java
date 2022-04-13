package com.comcast.programs;

import java.util.Scanner;

public class stringSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String temp;
		int n = 0;
		n = sc.nextInt();

		String arr[] = new String[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.next();
		}

		System.out.println(n);

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i].compareTo(arr[j]) > 0) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}
		sc.close();
	}
}
