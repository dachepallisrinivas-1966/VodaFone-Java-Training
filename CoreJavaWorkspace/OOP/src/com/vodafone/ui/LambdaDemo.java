package com.vodafone.ui;

@FunctionalInterface
interface Test4 {
	void printMessage();
}

public class LambdaDemo {

	public static void main(String[] args) {
		
		// lambda expression
		Test4 obj = () -> System.out.println("print message function"); 
		obj.printMessage();

		// lambda block
		Test4 obj2 = () -> {
			for(int i = 1; i <= 5; i++) {
				System.out.println(i);
			}
		};
		obj2.printMessage();
		
	}

}
