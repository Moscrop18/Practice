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
		
		
		

	}

}


class B1{
	
	static int a;
	
	public void test() {
		System.out.println("Base");
	}
	
	public static void getA() {
		a=15;
		System.out.println(a);
	}
	
}

class C extends B1{
	int b;
	
	public static void getA() {
		a=20;
		System.out.println(a);
	}
}
