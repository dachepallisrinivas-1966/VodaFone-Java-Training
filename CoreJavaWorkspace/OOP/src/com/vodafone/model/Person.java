package com.vodafone.model;

public abstract class Person {
	private String name;
	private int age;
	
	public Person() {
		/* default constructor */
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	/* setters and getters */
	
	public void show() {
		System.out.print("Name = " + name + "\t" + "Age = " + age + "\t");
	}
	
}
