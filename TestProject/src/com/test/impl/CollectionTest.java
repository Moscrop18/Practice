package com.test.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CollectionTest {
	
	public static void main(String[] arg) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		ArrayList<Student> list = new ArrayList<Student>();
		Student s1= new Student(1, "Kamal");
		Student s2= new Student(2,"Himu");
		
		list.add(s1);
		list.add(s2);
		
		
		map.put("kamal", 1);
		map.put(null, null);
		map.put("himu", null);
		
		System.out.println(list);
		System.out.println(map);
		
		for(Map.Entry<String, Integer> entrySet:map.entrySet()) {
			System.out.println("Key:"+entrySet.getKey());
			System.out.println("Value:"+entrySet.getValue());
		}
	}
	

	static class Student{
		int id;
		String name;
		
		Student(int id, String name){
			this.id = id;
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
		
		/*
		 * @Override public String toString() { return "Id:"+id+" ," +
		 * "name:"+name+" ,"; }
		 */
	}
	

}
