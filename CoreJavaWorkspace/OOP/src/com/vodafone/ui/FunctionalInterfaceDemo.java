package com.vodafone.ui;

@FunctionalInterface
interface Test3 {
	void show();
}

class Test3Impl implements Test3 {

	@Override
	public void show() {
		System.out.println("sub class show method");
		
	}
	
}
public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		Test3Impl obj = new Test3Impl();
		obj.show();
	}

}
