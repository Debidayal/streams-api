package com.java.streams.forEachFilter;

import java.util.List;
import java.util.stream.Collectors;

public class EmpService {
	
	// filter all employees whose salary is more than 1500
	public static List<Employee> getTaxFilteredEmployees() {
		return EmployeeDao.getAllEmployees().stream().filter(emp -> emp.getSalary() > 1500)
				.collect(Collectors.toList());
	}

	// filter all employees whose name starts with a specific character
	public static List<Employee> getNameFilteredEmployees(String s) {
		return EmployeeDao.getAllEmployees().stream().filter(emp -> emp.getName().startsWith(s))
				.collect(Collectors.toList());
	}
	

}
