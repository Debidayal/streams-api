package com.java.streams.mapreduce;

public class Employee {

	private String name;
	private String grade;
	private long salary;
	
	public Employee(String name, String grade, long salary) {
		super();
		this.name = name;
		this.grade = grade;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	
	
	
	
	
}
