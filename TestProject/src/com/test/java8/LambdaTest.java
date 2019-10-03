package com.test.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaTest {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1, 2, 3,4);
		
		list.forEach(n ->System.out.println(n));
		LambdaTest obj = new LambdaTest();
		 List<String> list1 = new ArrayList<>();  
		 List<String> list2 = new ArrayList<>();  
	        list1.add("Kevin");  
	        list1.add("Rick"); 
	        list1.add("Negan");
	        list2.add("Kamal");
	        
	        //My Name
	       // obj.getList(list1,list2);
	        
	       
	}
	
	public  void getList(List...lists) {
		for(List l: lists) {
			System.out.println(l);
		}
	}

}
