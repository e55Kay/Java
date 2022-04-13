package com.comcast.wrapper;

public class UnboxingDemo {

	public static void main(String args[]) {
		byte b = 10;
		short s = 20;
		int i = 30;
		long l = 40;
		float f = 50.0f;
		double d = 60.0;
		char c = 'a';
		boolean b2 = true;

		// Autoboxing
		Byte byteobj = b;
		Short shortobj = s;
		Integer intobj = i;
		Long longobj = l;
		Float floatobj = f;
		Double doubleobj = d;
		Character charobj = c;
		Boolean boolobj = b2;

		// Printing objects
		System.out.println("---Object printing---");
		System.out.println("Byte object: " + byteobj);
		System.out.println("Short object: " + shortobj);
		System.out.println("Integer object: " + intobj);
		System.out.println("Long object: " + longobj);
		System.out.println("Float object: " + floatobj);
		System.out.println("Double object: " + doubleobj);
		System.out.println("Character object: " + charobj);
		System.out.println("Boolean object: " + boolobj);

		// Unboxing
		byte bv = byteobj;
		short sv = shortobj;
		int iv = intobj;
		long lv = longobj;
		float fv = floatobj;
		double dv = doubleobj;
		char cv = charobj;
		boolean b2v = boolobj;

		System.out.println("\n---Primitive type printing---");
		System.out.println("byte value: " + bv);
		System.out.println("short value: " + sv);
		System.out.println("int value: " + iv);
		System.out.println("long: " + lv);
		System.out.println("float value: " + fv);
		System.out.println("double value: " + dv);
		System.out.println("Character value: " + cv);
		System.out.println("Boolean value: " + b2v);
	}

}
