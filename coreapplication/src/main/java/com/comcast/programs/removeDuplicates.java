package com.comcast.programs;
import java.util.Arrays;

public class removeDuplicates {
	public static int removeduplicates(int a[]) {
		Arrays.sort(a);
		if (a.length == 0 || a.length == 1) {
			return a.length;
		}
		int j = 0;

		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] != a[i + 1]) {
				a[j++] = a[i];
			}
		}

		a[j++] = a[a.length - 1];
		return j;
	}

	public static void main(String[] args) {
		int a[] = { 4,3,3,2,1,3,2,1,4,5};
		int n = a.length;

		n = removeduplicates(a);
		System.out.println("Number of unique elements: " + n);
		for (int i = 0; i < n; i++)
			System.out.print(a[i] + " ");
		
		}
}
