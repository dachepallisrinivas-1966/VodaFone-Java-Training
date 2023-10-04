package com.vodafone.model;

public abstract class Shape {
	protected double firstDimension;
	protected double secondDimension;
	
	public Shape() {
		/* default constructor */
	}
	
	public Shape(double firstDimension) {
		this.firstDimension = firstDimension;
		this.secondDimension = 0;
	}
	
	public Shape(double firstDimension, double secondDimension) {
		this.firstDimension = firstDimension;
		this.secondDimension = secondDimension;
	}
	
	/* setters and getters */
	
	public abstract double getArea();

}




	
