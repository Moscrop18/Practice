package com.test.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.sun.org.apache.xalan.internal.utils.XMLSecurityManager.Limit;

public class Streams {
	
	public static void main(String[] args) {   
		List<String> names = new ArrayList<>();
		names.add("Ajeet");
		names.add("Ajeet");
		names.add("Aditya");
		names.add("Aditya");
			
		long count = names.stream().filter(str->str.length()<6).count();
		System.out.println(count);
		Stream<String> stream =names.stream().distinct();
		//stream.forEach(str-> System.out.println(str));
		
		
		//displayIntegers();
		get3Table();
		printAscii();

	   }  
	
	static void displayIntegers() {
		Stream.iterate(1, count->count+1).
		filter(number->number%2==0).limit(6).
		forEach(System.out::println);
	}
	
	static void get3Table() {
		Stream.iterate(1, count->count+1) 
		 
        .filter(number->number%3==0)
        .limit(6) 
        .forEach(number -> System.out.println(number));  
	}
	
	static void printAscii() {
		/*
		 * String hello ="hellokamal"; hello.chars() .mapToObj(i -> (char)i)
		 * .forEach(System.out::println);
		 */
		Stream.iterate('a', c->(int)'a'+1).
		limit(26).forEach(c -> System.out.println(c));
		
		int start ='a';
		int end = 'z';
		
		IntStream.range(start, end+1).forEach(n->System.out.println(n));
		int asc = (int)'z';
		
	}
}

