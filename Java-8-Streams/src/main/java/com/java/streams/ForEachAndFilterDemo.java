package com.java.streams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachAndFilterDemo {

	public static void main(String[] args) {
	
		// forEach Demo
		//List 
		List<String> list = Arrays.asList("John","Shyam","Ram","Sita");
		
		//Print each element inside List
		list.stream().forEach(s->System.out.println(s));
		
		// Map
		Map<Integer, String>  map = new HashMap<Integer,String>();
		map.put(1, "John");
		map.put(2, "Ram");
		
		//Print each entry
		//Using forEach of Map interface ( this forEach takes BiConsumer as argument )
		map.forEach((key,value)->System.out.println(key + ":" + value));
		map.entrySet().stream().forEach(o->System.out.println(o));
		
		//Filter demo
		
		//filter from list whose name starts with 's'
		list.stream().filter(s->s.startsWith("S")).forEach(s->System.out.println(s));
		
		//filter from map : for even key
		map.entrySet().stream().filter(k->k.getKey()%2==0).forEach(s->System.out.println(s));
		
		
	}
	

}
