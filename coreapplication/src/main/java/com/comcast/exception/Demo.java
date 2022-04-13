package com.comcast.exception;

public class Demo {
	public static void main(String args[]) {
		try {
			int a[] = new int[7];
			a[4] = 30/0;
		} catch (ArithmeticException e) {
			System.out.println("Warning: ArithmeticException");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Warning: ArrayIndexOutOfBoundsException");
		} catch (Exception e) {
			System.out.println("Warning: SomeotherException");
		}
		System.out.println("after catch block");

	}
}
