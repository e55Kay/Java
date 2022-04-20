package com.comcast.collections;

import java.util.ArrayList;

public class ArrayListMethods {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		
		//add()
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add(1, "Four");
		
		list2.add("Alpha");
		list2.add("Beta");
		
		System.out.print("List add(): ");
		for(String i : list) {
			System.out.print(i + " ");
		}
		System.out.println("");
		
		//addAll()
		list.addAll(list2);
		list.addAll(2,list2);
		
		System.out.print("List addAll(): ");
		for(String i : list) {
			System.out.print(i + " ");
		}
		System.out.println("");
		
		//clear()
		list2.clear();
		System.out.println("List2 isEmpty(): " + list2.isEmpty());
		System.out.println("List isEmpty(): " + list.isEmpty());
		
		//clone()
		list2 = (ArrayList<String>) list.clone();
		
		System.out.print("List2 clone(): ");
		for(String i : list2) {
			System.out.print(i + " ");
		}
		System.out.println("");
		
		//get() indexOf()
		System.out.println("List get(): " + list.get(5));
		System.out.println("List indexOf(): " + list.indexOf("Two"));
		
		//remove()
		list2.remove(0);
		list2.remove(1);
		
		System.out.print("List2 remove(int): ");
		
		for(String i : list2) {
			System.out.print(i + " ");
		}
		System.out.println("");
		
		list2.remove("Beta");
		list2.remove("Four");
		list2.remove("Two");
		
		System.out.print("List2 remove(object): ");
		for(String i : list2) {
			System.out.print(i + " ");
		}
		System.out.println("");
		
		//removeAll()
		list.removeAll(list2);
		
		System.out.print("List removeAll(): ");
		for(String i : list) {
			System.out.print(i + " ");
		}
		System.out.println("");
		

	}

}
