package com.comcast.programs;

import java.util.Scanner;

public class stringLenSort {
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

			for (int j = 0; j < n - i - 1; j++) {

				if (arr[j].length() > arr[j + 1].length()) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				} else if (arr[j].length() == arr[j + 1].length()) {

					if (arr[j].compareTo(arr[j + 1]) > 0) {
						temp = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = temp;
					}
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}
		sc.close();
	}
}
