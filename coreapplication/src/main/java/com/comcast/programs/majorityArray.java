package com.comcast.programs;

import java.util.Arrays;

public class majorityArray {

	public static int majorityElement(int[] arr) {
		Arrays.sort(arr);

		int count = 1, max = -1;
		int temp = arr[0];

		for (int i = 1; i < arr.length; i++) {

			if (temp == arr[i]) {
				count++;
			} else {
				temp = arr[i];
				count = 1;
			}

			if (max < count) {

				max = count;

				if (max > (arr.length / 2)) {
					return (arr[i]);

				}
			}
		}

		return (-1);
	}

	public static void main(String[] args) {
		int arr[] = { 1, 1, 2, 2, 2, 2, 2, 3, 5 };

		System.out.println(majorityElement(arr));

	}

}
