package com.java.streams.mapreduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapReduceDemo {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,3,6,7,8,9,10);
		
		// sum using map
		int sum = numbers.stream().mapToInt(i->i).sum();
		int sum2 = numbers.stream().mapToInt(Integer::intValue).sum();
		
		//sum using reduce
		Integer reduceSum = numbers.stream().reduce(0, (a,b)->a+b);
		
		//sum using reduce and method reference
		Optional<Integer> reduceSumMR = numbers.stream().reduce(Integer::sum);
		Integer sumMR = reduceSumMR.get();
		
		// multiply using stream
		Integer mul = numbers.stream().reduce(1, (a,b)->a*b);
		
		//find max in the list
		Optional<Integer> maxOpt = numbers.stream().reduce((a,b)->a>b?a:b);
		Integer max = maxOpt.get();
		// or
		Integer max2 = numbers.stream().reduce(Integer::max).get();
		
		//-------------------------------------------------------------
		
		
		List<String> words = Arrays.asList("java","corejava","springboot","microservices");
		
		//find longest word
		String longestWord = words.stream().reduce((w1,w2)->w1.length()>w2.length()?w1:w2).get();
	
		//--------------------------------------------------------------
		
		
		// find the average salary of all grade "A" employee
		double averageSal = EmployeeDAO.getAll().stream()
			.filter(emp->emp.getSalary()>1000)
			.map(emp->emp.getSalary())
			.mapToDouble(i->i)
			.average()
			.getAsDouble();
		
		// find the sum of salary of all grade 'A' employees
		double sumSal = EmployeeDAO.getAll().stream()
				.filter(emp->emp.getSalary()>1000)
				.map(emp->emp.getSalary())
				.mapToDouble(i->i)
				.sum();
				
	}

}
