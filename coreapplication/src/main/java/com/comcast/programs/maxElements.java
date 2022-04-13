package com.comcast.programs;

import java.util.Arrays;

public class maxElements {
	public static int maximumElement(int[] arr) {
		Arrays.sort(arr);

		int count = 1, max = -1;
		int temp = arr[0], element = 0;

		for (int i = 1; i < arr.length; i++) {

			if (temp == arr[i]) {
				count++;
			} else {

				if (max < count) {
					max = count;
					element = temp;
				} else if (max == count) {
					element = -1;
				}
				temp = arr[i];
				count = 1;
			}

		}

		return (element);
	}

	public static void main(String[] args) {
		int arr[] = { 1, 1, 2, 2, 3, 3, 5 };

		System.out.println(maximumElement(arr));

	}

}
