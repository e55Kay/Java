package com.comcast.programs;

import java.util.Scanner;

public class bmiCal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double weight = sc.nextDouble();
		double height = sc.nextDouble();
		
		double bmi = weight / (height * height);
		
		System.out.println("BMI: " + bmi);
		sc.close();

	}

}
