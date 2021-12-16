package com.java.streams.mapandflatmap;

import java.util.ArrayList;
import java.util.List;

public class CustomerDAO {

	public static List<Customer> getAll() {
		
		/*
		 * return Stream .of(new Customer("Ram", "ram@gmail.com", Arrays.asList("12345",
		 * "45678")), new Customer("Shyam", "shyam@gmail.com", Arrays.asList("12345",
		 * "45678")), new Customer("Madhu", "maddy@gmail.com", Arrays.asList("12345",
		 * "45678"))) .collect(Collectors.toList());
		 */
		return new ArrayList<Customer>();
	

	}
}
