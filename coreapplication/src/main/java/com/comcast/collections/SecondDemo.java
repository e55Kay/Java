package com.comcast.collections;

import java.util.Set;
import java.util.Collections;
import java.util.HashSet;

public class SecondDemo {

	public static void main(String[] args) {
		
		Set newSet = new HashSet();
		
		newSet.add("a");
		newSet.add("b");
		newSet.add("a");
		
		System.out.println(newSet);
		
		
		for(Object x: newSet) {
			System.out.println(x);
		}

	}

}
