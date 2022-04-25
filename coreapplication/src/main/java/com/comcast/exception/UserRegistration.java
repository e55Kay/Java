package com.comcast.exception;

import java.util.Scanner;

class InvalidCountryException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	InvalidCountryException(String s) {
		super(s);
	}
}

class InvalidAgeException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	InvalidAgeException(String s) {
		super(s);
	}
}

public class UserRegistration {

	public static void registerProfile(String userName, int age, String country) {
		try {
			if (country.compareToIgnoreCase("India") != 0) {
				throw new InvalidCountryException("User outside India cannot be registered");
			}

			if (age < 18) {
				throw new InvalidAgeException("User is a Minor");
			}
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String userName = sc.next();
		String country = sc.next();
		int age = sc.nextInt();

		registerProfile(userName, age, country);

		sc.close();
	}

}
