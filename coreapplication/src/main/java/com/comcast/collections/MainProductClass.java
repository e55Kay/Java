package com.comcast.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Product {
	private int prodId, quantity;
	private String prodName, supplierName;
	private long price;

	public Product(int prodId, String prodName, int quantity, long price, String supplierName) {
		this.prodId = prodId;
		this.prodName = prodName;
		this.quantity = quantity;
		this.price = price;
		this.supplierName = supplierName;
	}

	public int getProdId() {
		return prodId;
	}

	public int getQuantity() {
		return quantity;
	}

	public String getProdName() {
		return prodName;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public long getPrice() {
		return price;
	}

}

class ProductManager{

	public static void printProductDetails(List<Product> list) {
		Iterator<Product> it = list.iterator();

		while (it.hasNext()) {
			Product p = it.next();
			System.out.println("Product Id: " + p.getProdId());
			System.out.println("Product Name: " + p.getProdName());
			System.out.println("Price: " + p.getPrice());
			System.out.println("Ordered Quantity: " + p.getQuantity());
			System.out.println("Supplier Name: " + p.getSupplierName());
		}
	}
}

public class MainProductClass {

	public static void main(String[] args) {
		Product p1 = new Product(11, "Acer", 2, 12500L, "Flipkart");
		Product p2 = new Product(12, "Samsung", 2, 240000L, "Amazon");
		
		List<Product> pList = new ArrayList<>();
		
		pList.add(p1);
		pList.add(p2);
		ProductManager.printProductDetails(pList);
	}

}
