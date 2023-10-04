package com.vodafone.ui;

import com.vodafone.model.ComplexNumber;

public class ComplexNumberApp {

	public static void main(String[] args) {
//		ComplexNumber first;					// reference
//		first = new ComplexNumber();			// object
//		
//		first.setRealPart(5);					// . is member access operator
//		first.setImaginaryPart(6);
//		
//		System.out.println(first.getRealPart() + ", " + first.getImaginaryPart());	
//		
//		ComplexNumber second;
//		second = new ComplexNumber();			// default constructor is called automatically
//		
//		System.out.println(second.getRealPart() + ", " + second.getImaginaryPart());
//		
//		ComplexNumber third = new ComplexNumber(100,200);	// parameter constructor is called automatically
//		System.out.println(third.getRealPart() + ", " + third.getImaginaryPart());
		
		/* Array of objects */
		ComplexNumber[] complexNumbers = new ComplexNumber[5];
		complexNumbers[0] = new ComplexNumber(1,1);
		complexNumbers[1] = new ComplexNumber(2,3);
		complexNumbers[2] = new ComplexNumber(4,5);
		complexNumbers[3] = new ComplexNumber(6,7);
		complexNumbers[4] = new ComplexNumber(8,9);
		
		/* classic for loop */
		for(int i = 0; i < complexNumbers.length; i++) {
			System.out.println(complexNumbers[i].getRealPart() + "\t" + complexNumbers[i].getImaginaryPart());
		}
		
		/* enhanced for loop -	RECOMMENDED */
		for(ComplexNumber        data    : complexNumbers) {
			System.out.println(data.getRealPart() + "\t" + data.getImaginaryPart());
		}
		
		
		
	}

}


		
		
		