package com.vodafone.model;

public class Product {
	private int id;
	private String name;
	private double price;
	private static int tax;			/* static data member */
	
	/* parameter constructor */
	public Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public static void setTax(int t) {
		tax = t;
	}
	
	public void show() {
		System.out.println("Id = " + id + "\n" + "Name = " + name + "\n" + "Price = " + price + "\n" + "Tax = " + tax);
		
	}
}



	
	