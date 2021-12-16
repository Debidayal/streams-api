package com.java.streams.mapandflatmap;

import java.util.Arrays;
import java.util.Optional;

public class OptionalDemo {

	public static Customer getCustByEmail(String email) throws Exception {
		//return CustomerDAO.getAll().stream().filter(cust->cust.getEmail().equals(email)).findAny().get();
		//return CustomerDAO.getAll().stream().filter(cust->cust.getEmail().equals(email)).findAny().orElse(new Customer());
		return CustomerDAO.getAll().stream().filter(cust->cust.getEmail().equals(email)).findAny().orElseThrow(()->new Exception("No customer present"));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer customer = new Customer("Ram", null, Arrays.asList("12345", "45678"));
		
		Optional<Object> empty = Optional.empty();
		
		Optional<String> email = Optional.of(customer.getEmail());
		System.out.println(email); // throw null pointer if object is null ( of() should be used when we are sure object is never null)
		
		Optional<String> ofNullableEmail = Optional.ofNullable(customer.getEmail());
		System.out.println(ofNullableEmail); // return empty optional object if object is null (ofNullable() should be used when we are sure object can be null or not null)
		
		if(ofNullableEmail.isPresent()) // false
			ofNullableEmail.get();  // returns object if not null
		
		System.out.println(ofNullableEmail.orElse("defaultemail@gmail.com")); // return default string if email is null
		
		System.out.println(ofNullableEmail.orElseThrow(()->new IllegalArgumentException("email not present"))); // throw exception is email  is null
		
		ofNullableEmail.map(String::toUpperCase).orElseGet(()->"Deafult"); // return default string if email is null
		
		try {
			getCustByEmail("abc");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
