package com.comcast.programs;

import java.util.Scanner;

public class arraySort {

	public static void main(String[] args) {
		//int[] arr = { 3, 4, 1, 6, 5, 2, 7 };
		Scanner sc = new Scanner(System.in);
		int temp = 0, n = 0;
		n = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println(n);

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] > arr[j]) { 
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
