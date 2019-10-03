package com.test.pojo;

public class Employee {
	
	public Employee(long id, String name, long salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}

	private long id;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	private String name;
	private long salary;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
