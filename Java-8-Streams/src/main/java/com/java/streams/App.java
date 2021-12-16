package com.java.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Lambda expression is an expression thorough which we can represent an
 * anonymous function
 *
 */

interface Car {
	void engineType();
	// void noOfWheels(String input);
}

public class App {
	public static void main(String[] args) {
		// Using anonymous inner class
		Car car1 = new Car() {
			@Override
			public void engineType() {
				System.out.println("Petrol");
			}
		};

		car1.engineType();

		// using lambda expression
		Car car2 = () -> System.out.println("Diesel");
		car2.engineType();

		//Sorting of list
		List<String> list = Arrays.asList("Java", "Spring", "Hibernate", "Webservices");

		Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}

		});

		Collections.sort(list, (o1, o2) -> o1.compareTo(o2));
	}
}
