package com.vodafone.ui;

import com.vodafone.model.Circle;
import com.vodafone.model.Rectangle;
import com.vodafone.model.Shape;

public class ShapeApp {

	public static void main(String[] args) {
		// without polymorphism
		Rectangle rectangle = new Rectangle(10, 6);
		System.out.println(rectangle.getArea());
		
		Circle circle = new Circle(8);
		System.out.println(circle.getArea());
		
		// polymorphism
		Shape obj;
		obj = new Rectangle(10, 6);
		System.out.println(obj.getArea());
		
		obj = new Circle(8);
		System.out.println(obj.getArea());

	}

}
