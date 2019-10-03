package com.test.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Streams {
	
	public static void main(String[] args) {   
		List<String> names = new ArrayList<String>();
		names.add("Ajeet");
		names.add("Ajeet");
		names.add("Aditya");
		names.add("Aditya");
			
		long count = names.stream().filter(str->str.length()<6).count();
		System.out.println(count);
		Stream<String> stream =names.stream().distinct();
		stream.forEach(str-> System.out.println(str));
		
		displayIntegers();

	   }  
	
	static void displayIntegers() {
		Stream.iterate(1, count->count+1).
		filter(number->number%2==0).limit(6).
		forEach(System.out::println);
	}
}

