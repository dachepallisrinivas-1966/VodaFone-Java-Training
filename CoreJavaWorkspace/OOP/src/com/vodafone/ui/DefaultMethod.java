package com.vodafone.ui;


interface Test {
	default void show() {
		System.out.println("show method");
	}
}

class TestImpl implements Test {
	
}

public class DefaultMethod {

	public static void main(String[] args) {
		Test obj = new TestImpl();		// program-to-interfaces.
		obj.show();

	}

}
