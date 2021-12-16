package com.java.streams.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import com.java.streams.forEachFilter.Employee;

public class MapSortingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 *
		 * Map with primitive type key value
		 *
		 */
		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("Sam", 2);
		map.put("Ram", 1);
		map.put("Sita", 6);
		map.put("Rahim", 5);

		// Sorting by key / value using traditional approach
		List<Entry<String, Integer>> entryList = new ArrayList<Entry<String, Integer>>(map.entrySet());

		Collections.sort(entryList, new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {

				// return o1.getKey().compareTo(o2.getKey()); // using key
				return o1.getValue().compareTo(o2.getValue());
			}

		});

		// using lambda
		// 1.
		Collections.sort(entryList, (o1, o2) -> o1.getValue().compareTo(o2.getValue()));

		// 2.
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println); // sorting by key in
																									// ascending
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println); // sorting by value
																									// in ascending
		// map.entrySet().stream().sorted(Map.Entry.comparingByKey().reversed()).forEach(System.out::println);
		// // sorting by key in descending

		/*
		 * 
		 * Map with object as key /value
		 * 
		 */

		// 1. sorting using comparator
		Map<Employee, String> empMap = new TreeMap<Employee, String>(
				(o1, o2) -> (int) o1.getSalary().compareTo(o2.getSalary()));

		empMap.put(new Employee("Ram", 10), "India");
		empMap.put(new Employee("Rahim", 6), "UK");
		empMap.put(new Employee("Sita", 2), "India");
		empMap.put(new Employee("Rohit", 12), "India");

		// 2. sorting using stream
		empMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary)))
				.forEach(System.out::println); // ascending
		empMap.entrySet().stream()
				.sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary).reversed()))
				.forEach(System.out::println); // descending
		

		
	}

}
