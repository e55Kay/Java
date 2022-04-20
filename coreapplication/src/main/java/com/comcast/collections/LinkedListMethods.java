package com.comcast.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListMethods {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("One");
		arrList.add("Two");
		arrList.add("Three");
		
		LinkedList<String> ll = new LinkedList<String>();
		LinkedList<String> ll2 = new LinkedList<String>(arrList);
		
		//add()
		ll.add("Alpha");
		ll.add("Beta");
		ll.add("Charlie");
		ll.add(3,"Delta");
		
		System.out.print("LL: ");
		for(String i: ll ) {
			System.out.print(i + " ");
		}
		System.out.println("");
		
		System.out.print("LL2: ");
		for(String i: ll2 ) {
			System.out.print(i + " ");
		}
		System.out.println("");
		
		//addFirst() addLast()
		ll.addFirst("Echo");
		ll.addLast("Fox");
		
		System.out.print("LL addFirst() addLast(): ");
		for(String i: ll ) {
			System.out.print(i + " ");
		}
		System.out.println("");
		
		//addAll()
		ll.addAll(ll2);
		ll.addAll(2,ll2);
		System.out.print("LL addAll(): ");
		for(String i: ll ) {
			System.out.print(i + " ");
		}
		System.out.println("");
		
		//clear()
		ll2.clear();
		System.out.println("LL isEmpty(): " + ll.isEmpty());
		System.out.println("LL2 isEmpty(): " + ll2.isEmpty());
		
		//clone()
		ll2 = (LinkedList<String>)ll.clone();
		System.out.print("LL2 clone(): ");
		for(String i: ll2 ) {
			System.out.print(i + " ");
		}
		System.out.println("");
		
		//get() indexOf()
		System.out.println("List get(): " + ll.get(5));
		System.out.println("List indexOf(): " + ll.indexOf("Two"));
		
		//remove()
		for(int j = 11; j >= 7; j--)
			ll2.remove(j);
		
		System.out.print("LL2 remove(index): ");
		for(String i: ll2 ) {
			System.out.print(i + " ");
		}
		System.out.println("");
		
		ll2.remove("Two");
		ll2.remove("Alpha");
		
		System.out.print("LL2 remove(object): ");
		for(String i: ll2 ) {
			System.out.print(i + " ");
		}
		System.out.println("");
		
		//removeAll()
		ll.removeAll(ll2);
		
		System.out.print("LL removeAll(): ");
		for(String i: ll ) {
			System.out.print(i + " ");
		}
		System.out.println("");
	}

}
