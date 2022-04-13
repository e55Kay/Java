package com.comcast.wrapper;

public class ByteDemo {
	public static void main(String args[]) {
		Byte b1 = Byte.valueOf((byte) 120); //new Byte((byte) 120);
		for (int i = 125; i <= 135; i++) {
			Byte b2 = Byte.valueOf((byte)i); //new Byte((byte) i);
			System.out.println("b2 = " + b2);
		}
		System.out.println("b1 Object = " + b1);
		System.out.println("Minimum Value of Byte = " + Byte.MIN_VALUE);
		System.out.println("Maximum Value of Byte = " + Byte.MAX_VALUE);
		System.out.println("b1* 2 = " + b1 * 2);
		System.out.println("b1* 2 = " + b1.byteValue() * 2);
		
		Byte b3 = Byte.valueOf((byte)120); //new Byte("120");
		System.out.println("b3 Object = " + b3);
		System.out.println("(b1==b3)? " + b1.equals(b3));
		System.out.println("(b1.compareTo(53)? " + b1.compareTo(b3));
		

	}
}