package com.java.streams.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo {

	public static void main(String[] args) { 
		
	List<Integer> list = Arrays.asList(1,2,3,4,5,6);
	list.stream().filter(t->t%2==0).forEach(System.out::println);
	list.stream().max(Comparator.reverseOrder()).ifPresent(System.out::println);
	System.out.println(list.stream().reduce(0, (a,b) -> a+b)); 
	
	list.stream().mapToInt(Integer::intValue).sum();
	
	/*
	 * Map<Integer, String> map = new HashMap<Integer,String>(); map.put(1, "John");
	 * map.put(2, "Ram");
	 * 
	 * 
	 * map.entrySet().stream().forEach(o->System.out.println(o));
	 * map.forEach((k,v)->System.out.println(k+":"+v));
	 */
	
	//System.out.println(map.entrySet().stream().filter(o->o.getValue().startsWith("J")).collect(Collectors.toList()));
	
	Map<String, Integer> map = new HashMap<String, Integer>();

	map.put("Sam", 2);
	map.put("Ram", 1);
	map.put("Sita", 6);
	map.put("Rahim", 5);
	
	map.entrySet().stream().sorted((o1,o2)->o1.getValue().compareTo(o2.getValue()));
	

	
	
	
	
	
	}

}
