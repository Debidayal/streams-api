package com.java.streams.mapandflatmap;

import java.util.List;

public class Customer {

	private String name;
	private String email;
	private List<String> phone;
	
	Customer (){
		
	}

	public Customer(String name, String email, List<String> phone) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}
	
	// good practice to handle null
//	public Optional<String> getEmail() {
//		return Optional.ofNullable(email);
//	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<String> getPhone() {
		return phone;
	}

	public void setPhone(List<String> phone) {
		this.phone = phone;
	}

}
