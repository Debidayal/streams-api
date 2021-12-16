package com.java.streams.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.java.streams.forEachFilter.Employee;
import com.java.streams.forEachFilter.EmployeeDao;

public class ListSortingDemo {

	public static void main(String[] args) {
		
		List<Integer> numberList = Arrays.asList(1,5,3,6,9,2,4);
		
		// sort of wrapper object 
		//using collections
		//ascending 
		Collections.sort(numberList);
		
		//descending
		Collections.reverse(numberList);
		
		//using streams
		//ascending
		numberList.stream().sorted();
		
		//descending
		numberList.stream().sorted(Comparator.reverseOrder());
		
		//sorting objects
		//using Collections
		EmployeeDao.getAllEmployees().sort((o1,o2) ->  (int) (o1.getSalary() - o2.getSalary()));
		
		//using lambda
		EmployeeDao.getAllEmployees().stream().sorted((o1,o2) -> (int) ( o1.getSalary() - o2.getSalary()));
		
		// optimized lambda
		EmployeeDao.getAllEmployees().stream().sorted(Comparator.comparing(emp->emp.getSalary()));
		
		//optimized lambda ( using method reference in the above)
		EmployeeDao.getAllEmployees().stream().sorted(Comparator.comparing(Employee::getSalary));
		
		

	}

}
