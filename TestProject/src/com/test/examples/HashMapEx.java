package com.test.examples;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		Map<Employee, Integer> map = new HashMap<Employee, Integer>();
		map.put(new Employee(1,"Kamal") , 1);
		map.put(new Employee(2,"Kamal") , 2);
		
		map.put(new Employee(2, "kamal"),2);
		map.remove(new Employee(2,"kamal"));
		 for(Map.Entry<Employee, Integer> m : map.entrySet()) {
			 Employee e = m.getKey();
			 System.out.println(e.getId());
			 
			 System.out.println(e.getName());
			 System.out.println(m.getValue());
		 }
		
		

	}

}

class Employee{
	
	int id;
	String name;
	
	Employee(int id, String name){
		this.id=id;
		this.name=name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	
	/*
	 * @Override public boolean equals(Object obj) { if (this == obj) return true;
	 * if (obj == null) return false; if (getClass() != obj.getClass()) return
	 * false; Employee other = (Employee) obj; if (id != other.id) return false;
	 * return true; }
	 */
	 
	
	
	
	
	
}
