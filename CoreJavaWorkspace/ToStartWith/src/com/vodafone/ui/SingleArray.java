package com.vodafone.ui;

import java.util.Scanner;

public class SingleArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no. of cells: ");
		int size = scan.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter values ....");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println("Array ....");
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		scan.close();
	}

}
