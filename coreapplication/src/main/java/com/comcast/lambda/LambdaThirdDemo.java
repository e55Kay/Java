package com.comcast.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Product {
	private int id;
	private String name;
	private double price;
	
	public Product (int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
}

public class LambdaThirdDemo {

	public static void main(String[] args) {
		List<Product> prodList = new ArrayList<Product>();
		prodList.add(new Product(101, "HP", 25000.34));
		prodList.add(new Product(102, "Dell", 46000.5));
		prodList.add(new Product(103, "Samsung", 16000.34));
		prodList.add(new Product(104, "LG", 21600.1));
		prodList.add(new Product(105, "MI", 34200.00));
		prodList.add(new Product(106, "Acer", 83400.12));
		prodList.add(new Product(107, "Asus", 94000.00));
		
		System.out.println("Products between 20000 and 35000");
		
		Stream<Product> filterProduct = prodList.stream()
												.filter(prod -> prod.getPrice() > 20000)
												.filter(prod -> prod.getPrice() < 35000);
		
		filterProduct.forEach(p -> System.out.println(p.getName() + ": " + p.getPrice()));
		
		System.out.println("\nProducts above 40000");
		
		prodList.stream()
				.filter(p -> p.getPrice() > 40000)
				.forEach(p -> System.out.println(p.getName()+": " + p.getPrice()));
		
		System.out.println("\nBrands between 30000 and 50000");
		
		
		List<String> brandName = prodList.stream()
										 .filter(p -> p.getPrice()>30000)
										 .filter(p -> p.getPrice()<50000)
										 .map(p -> p.getName())
										 .collect(Collectors.toList());
		System.out.println(brandName);

	}

}
