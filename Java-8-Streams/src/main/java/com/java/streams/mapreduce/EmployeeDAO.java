package com.java.streams.mapreduce;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDAO {

	public static List<Employee> getAll() {
		return Stream.of(new Employee("Aashu","A",1000)
				,new Employee("Bera","A",1300)
				,new Employee("Abhi","B",1234)).collect(Collectors.toList());
	}
	
			
}
