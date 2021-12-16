package com.java.streams.forEachFilter;

import java.util.Arrays;
import java.util.List;

public class EmployeeDao {
	
	public static List<Employee> getAllEmployees(){
		
		return Arrays.asList(new Employee("a",1000),new Employee("b",2000));
	}

}
