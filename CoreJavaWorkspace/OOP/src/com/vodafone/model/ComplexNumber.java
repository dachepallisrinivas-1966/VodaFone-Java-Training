package com.vodafone.model;

public class ComplexNumber {
	
	/* data members (or) properties */
	private double realPart;
	private double imaginaryPart;
	
	/* default (no-parameter) constructor */
	public ComplexNumber() {								// constructor overloading
		realPart = 1;
		imaginaryPart = 2;
	}
	
	/* parameter constructor */
	public ComplexNumber(double real, double imag) {		// constructor overloading
		realPart = real;
		imaginaryPart = imag;
	}
	
	/* methods */
	public void setRealPart(double real) {
		realPart = real;
	}
	
	public void setImaginaryPart(double imag) {
		imaginaryPart = imag;
	}
	
	public double getRealPart() {
		return realPart;
	}
	
	public double getImaginaryPart() {
		return imaginaryPart;
	}
	
}
