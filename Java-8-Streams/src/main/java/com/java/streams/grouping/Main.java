package com.java.streams.grouping;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

	private static List<Person> getPersonList() {
		return List.of(new Person("Ram", 21, Gender.MALE), new Person("Sita", 23, Gender.FEMALE),
				new Person("Rahim", 15, Gender.MALE), new Person("John", 23, Gender.FEMALE),
				new Person("Priya", 20, Gender.FEMALE), new Person("Alex", 27, Gender.MALE),
				new Person("Richards", 29, Gender.MALE));
	}

	public static void main(String[] args) {

		// print all employee names
		getPersonList().stream().forEach(person -> System.out.println(person.getName()));

		// print all employee
		getPersonList().stream().forEach(System.out::println);

		// get all female employees
		List<Person> femaleList = 	getPersonList().stream().filter(person -> person.getGender().equals(Gender.FEMALE))
															.collect(Collectors.toList());

		// sort employees based on age
		List<Person> sortedByAge = 	getPersonList().stream().sorted(Comparator.comparing(Person::getAge))
															.collect(Collectors.toList());

		// sort employee based on age and then by name
		List<Person> sortedByAgeAndName = 	 getPersonList().stream()
															.sorted(Comparator.comparing(Person::getAge).thenComparing(Comparator.comparing(Person::getName)))
															.collect(Collectors.toList());
		
		//make sure each person age is greater than 10 
		boolean greaterThan10 = getPersonList().stream().allMatch(person->person.getAge() > 10);
		
		//make sure at least one person is greater than 25 years old
		boolean anyMatch = getPersonList().stream().anyMatch(person->person.getAge() > 25);

		//make sure no female is more than 30 years old
		getPersonList().stream().noneMatch(person->person.getGender().equals(Gender.FEMALE) && person.getAge()>30);
		
		// find out the oldest employee
		getPersonList().stream().max(Comparator.comparing(Person::getAge)).ifPresent(System.out::println);
		
		// group employees based on age and print
		Map<Gender, List<Person>> groupedByGender = getPersonList().stream().collect(Collectors.groupingBy(Person::getGender));
		
		groupedByGender.forEach((gender, personList)->{
			System.out.println(gender);
			personList.forEach(System.out::println);
		});
		
		// find name of oldest female
		getPersonList().stream()
						.filter(person->person.getGender().equals(Gender.FEMALE))
						.max(Comparator.comparing(Person::getAge)) // oldest female
						.map(Person::getName)
						.ifPresent(System.out::println);
		
		// example of BiConsumer ( a Consumer which takes two arguments)
		BiConsumer<Person, String> biConsumer = (person,message)->{
			System.out.println(message+person.getName());
		};
		
		
		biConsumer.accept(getPersonList().get(1), "Hello !");
		
		// example of BiFunction (a Function which takes two arguments)	
		Function<Integer, Integer> multiplierBy2Function = (number1) -> number1*2;
		Function<Integer, Integer> incrementBy1Function = (number1) -> number1+1;
		   
		Function<Integer, Integer> andThen = incrementBy1Function.andThen(multiplierBy2Function);  
		
		 
		BiFunction <Integer, Integer, Integer> biFunction = (number1, number2) -> number1+number2; // alternative of the above two functions
		
		System.out.println(biFunction.apply(20, 2));
		
		
		//
	}

}
