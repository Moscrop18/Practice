package com.test.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class InheritanceExample {

	public static void main(String[] args) {
		B1 b = new B1();
		b.test();
		
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("3");
		
		List<String> list2=list.stream().distinct().collect(Collectors.toList());
		list2.forEach(n->System.out.println(n));
		
		
		test(null);
		C c = new C();
		c.test();
		
		
		
		

	}
	
	public static void test(Object o) {
		System.out.println("1");
	}

	public static void test(String s) {
		System.out.println("2");
	}
}


class B1{
	
	int a=10;
	
	public void test() {
		System.out.println("Base");
	}
	
	public  void getA() {
		//a=15;
		System.out.println(a);
	}
	
}

class C extends B1{
	int b;
	
	public  void getA() {
		a=20;
		System.out.println(a);
	}
	
	public void go() {
		System.out.println("go");
	}
}


