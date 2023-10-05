package com.vodafone.comparator;

import java.util.Comparator;

import com.vodafone.model.Employee;

public class SalaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		double firstSalary = o1.getSalary();
		double secondSalary = o2.getSalary();
		if (firstSalary == secondSalary)
			return 0;
		else if (firstSalary > secondSalary)
			return 1;
		else
			return -1;
	}

}
