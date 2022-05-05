package com.comcast.basics;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestJunit {
	@Test
	public void testSetup() {
		String message = "I am done with Junit setup";
		assertEquals("I am done with Junit setup", message);
	}

}
