package com.comcast.lambda;

import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface IProduct {
	public String order(String name);
}

@FunctionalInterface
interface IArithmetic {
	public int add(int a, int b);
}

public class LambdaSecondDemo {

	public static void main(String[] args) {
		
		IProduct product = (pname) -> "My Product is " + pname;
		
		IArithmetic addition = (p,q) -> (p+q);
		
		System.out.println(product.order("hp"));	
		System.out.println("Add: " + addition.add(14,51));
		
		List<String> countryList = Arrays.asList("India","Australia","USA");
		System.out.println(countryList);
		
		countryList.forEach((data) -> {
			System.out.println(data);
		});

	}

}
