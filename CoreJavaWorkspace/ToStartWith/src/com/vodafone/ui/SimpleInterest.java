package com.vodafone.ui;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter principle: ");
		int principle = scan.nextInt();
		System.out.println("Enter time: ");
		int time = scan.nextInt();
		System.out.println("Enter rate: ");
		int rate = scan.nextInt();
		
		double simpleInterest = principle * time * rate / 100;
		
		System.out.println("Simple Interest = " + simpleInterest);
		
		scan.close();
	}

}
