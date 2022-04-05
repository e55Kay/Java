package com.comcast.fundamentals;

public class EncapsDemo {

	public static void main(String[] args) {
		
		Facebook fb = new Facebook();
		fb.setAge(21);
		fb.setContactNo(9876543210l);
		fb.setMaritalStatus("Single");
		
		System.out.println("Age: " + fb.getAge());
		System.out.println("Contact Number: " + fb.getContactNo());
		System.out.println("Marital Status: " + fb.getMaritalStatus());
		
	}

}
