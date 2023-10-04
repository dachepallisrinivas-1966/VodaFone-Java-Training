package com.vodafone.ui;

import com.vodafone.model.CompoundInterest;
import com.vodafone.model.SimpleInterest;

public class InterfaceApp {

	public static void main(String[] args) {
		SimpleInterest obj = new SimpleInterest();
		System.out.println(obj.getInterest());
		
		CompoundInterest obj2 = new CompoundInterest();
		System.out.println(obj2.getInterest());

	}

}
