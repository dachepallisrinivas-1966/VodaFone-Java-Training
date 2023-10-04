package com.vodafone.ui;

import com.vodafone.model.Product;

public class ProductApp {

	public static void main(String[] args) {
		
		Product.setTax(18);			// calling a static method in static way ...
		
		Product first = new Product(1, "mouse", 350.0);
		first.show();
		
		Product second = new Product(2, "ram", 800.0);
		second.show();
		
		Product third = new Product(3, "keyboard", 750.0);
		third.show();
		
	
		Product fourth = new Product(4, "web cam", 900.0);
		fourth.show();
		
		Product fifth = new Product(5, "laser printer", 3400.0);
		fifth.show();
		
		
		
	}

}



