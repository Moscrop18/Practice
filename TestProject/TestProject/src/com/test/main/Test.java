package com.test.main;

import java.util.ArrayList;
import java.util.List;

import com.test.pojo.Employee;

public class Test {
	
	int n=3;
	
	public static void main(String[] args) {
		long [] id = {1,2,3};
		String[] name = {"A", "K", "H"};
		long[] salary = {100, 200, 300};
		
		//List<Employee> empList = new ArrayList<Employee>();
		Test t = new Test();
		List<Employee> list= t.addValues(id, name, salary);
		List<Employee> list1 = new ArrayList<Employee>();
		for(int i =0; i<list.size(); i++) {
			System.out.println(list.get(i).getId() +" " +list.get(i).getName()
					+" "+list.get(i).getSalary());
		}
		list1.addAll(list);
		list.add(new Employee(4, "D", 400));
		
		for(int i =0; i<list1.size(); i++) {
			System.out.println(list1.get(i).getId() +" " +list1.get(i).getName()
					+" "+list1.get(i).getSalary());
		}
		}
	
	public List<Employee> addValues(long[] id, String[] name, long[] salary) {
		List<Employee> empList = new ArrayList<Employee>();
		for (int i=0; i<n; i++) {
			empList.add(new Employee(id[i], name[i], salary[i]));
		}
		return empList;
	}

}
