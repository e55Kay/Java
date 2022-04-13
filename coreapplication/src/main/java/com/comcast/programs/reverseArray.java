package com.comcast.programs;

public class reverseArray {

	public static void main(String[] args) {
		int temp = 0;
		int arr[] = {1,2,3,4,5,6};
		
		for(int i = 0; i < arr.length / 2; i++) {
			temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}
		
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}

	}

}
