package com.vodafone.ui;

import com.vodafone.model.Employee;
import com.vodafone.model.Person;
import com.vodafone.model.Student;

public class InheritanceApp {

	public static void main(String[] args) {
//		Person person = new Person("srinivas", 57);
//		person.show();
//		System.out.println();
		
		Employee employee = new Employee("kumar", 25, 45000.0);
		employee.show();
		System.out.println();
		
		Student student = new Student("diya", 18, 56000.0);
		student.show();
		System.out.println();

	}

}
