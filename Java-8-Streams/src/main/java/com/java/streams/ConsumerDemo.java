package com.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import com.java.streams.practice.Operation;

// Consumer interface : based on input some operation will be performed.
// accept(T t)
public class ConsumerDemo {

	public static void main(String[] args) {
		System.out.println("Main");
		Consumer<String> c= (t)-> { 
			System.out.println("Print :"+ t );
		};
		
		c.accept("Hello");
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		
		Consumer<Integer> c2 = (t) -> {
			if(t%2==0)
				System.out.println(t);
		};
		
		list.stream().forEach(c2); // 2,4,6
		
		// directly using lamda expression
		list.stream().forEach(t -> System.out.println(t));
	}

}
