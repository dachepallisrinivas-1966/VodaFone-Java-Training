package com.vodafone.model;

public class Student extends Person {
	
	private double fee;
	
	public Student() {
		super();
	}

	public Student(String name, int age, double fee) {
		super(name, age);
		this.fee = fee;
	}
	
	@Override
	public void show() {
		super.show();
		System.out.print("Fee = " + fee + "\t");

	}

}
