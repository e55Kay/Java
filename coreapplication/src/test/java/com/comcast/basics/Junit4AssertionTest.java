package com.comcast.basics;

import static org.junit.Assert.*;

import org.junit.Test;

public class Junit4AssertionTest {

	@Test
	public void testAssert() {
		String str1 = "Junit";
		String str2 = "Junit";
		String str3 = "test";
		String str4 = "test";
		String str5 = null;
		
		int var1 = 1;
		int var2 = 2;
		
		int[] arr1 = {1,2,3,4};
		int[] arr2 = {1,2,3,4};
		
		assertEquals(str1, str2);
		assertSame(str3,str4);
		assertNotSame(str1, str3);
		assertNull(str5);
		assertNotNull(str4);
		assertTrue(var1 < var2);
		assertArrayEquals(arr1, arr2);
		assertFalse(var1 > var2);
	}

}
