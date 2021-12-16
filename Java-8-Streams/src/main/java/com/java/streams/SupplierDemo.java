package com.java.streams;

import java.util.Arrays;
import java.util.function.Supplier;

// get()
public class SupplierDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Print List is empty if no elements present
		Arrays.asList().stream().findAny().orElseGet(() -> "List is empty");

	}

}
