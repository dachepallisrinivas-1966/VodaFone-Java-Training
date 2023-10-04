package com.vodafone.ui;

import java.time.LocalDate;
import java.time.Month;
import java.util.Set;
import java.util.TreeSet;

import com.vodafone.model.Employee;
import com.vodafone.model.Gender;
import com.vodafone.service.SalaryComparator;

public class EmployeeSetDemo {

	public static void main(String[] args) {
		// Set<Employee> emps = new HashSet<>();
		// Set<Employee> emps = new TreeSet<>();

		// Set<Employee> emps = new TreeSet<>(new NameComparator());
		Set<Employee> emps = new TreeSet<>(new SalaryComparator());
		// Set<Employee> emps = new TreeSet<>(new GenderComparator());

		emps.add(new Employee(101, "srinivas", LocalDate.of(2001, Month.APRIL, 15), 50000.0, Gender.MALE));
		emps.add(new Employee(103, "john", LocalDate.of(2002, Month.JUNE, 17), 56000.0, Gender.MALE));
		emps.add(new Employee(105, "david", LocalDate.of(2001, Month.SEPTEMBER, 26), 45000.0, Gender.MALE));
		emps.add(new Employee(104, "angel", LocalDate.of(2003, Month.JUNE, 18), 49000.0, Gender.FEMALE));
		emps.add(new Employee(102, "sandy", LocalDate.of(2001, Month.SEPTEMBER, 6), 50000.0, Gender.FEMALE));
		emps.add(new Employee(107, "marie", LocalDate.of(2001, Month.APRIL, 8), 52000.0, Gender.FEMALE));
		emps.add(new Employee(108, "asfand", LocalDate.of(2005, Month.APRIL, 21), 75000.0, Gender.MALE));
		
		for(Employee emp : emps) {
			System.out.println(emp);
		}
		System.out.println("--------------------------------------------------------");
		
//		Collections.sort(emps);
//		
//		for(Employee emp : emps) {
//			System.out.println(emp);
//		}
//		System.out.println("--------------------------------------------------------");
//		
//		Collections.sort(emps, new NameComparator());
//		for(Employee emp : emps) {
//			System.out.println(emp);
//		}
//		System.out.println("--------------------------------------------------------");
//		Collections.sort(emps, new SalaryComparator());
//		for(Employee emp : emps) {
//			System.out.println(emp);
//		}
//		System.out.println("--------------------------------------------------------");
	}

}
