package com.java.streams;

import java.util.Arrays;
import java.util.function.Predicate;

//test(T t) 
public class PredicateDemo {
	
	public static void main(String[] args) {
	
		// Check a given number is even or odd
		
		Predicate<Integer> p = t -> t%2==0 ;
		System.out.println(p.test(10));
		
		//Print only the even numbers from a list
		
		Arrays.asList(1,2,3,4,5).stream().filter(p).forEach(t -> System.out.println(t));
		
		

	}

}
