package com.test.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ArrayListEx {
	
	//private static final Set s3;
static String s="";
	public static void main(String[] args) {
		
		
		  List<Integer> list = Arrays.asList(1,2,2,4,5,6,7,7,9,10);
		  
		  
		/*
		 * List<Integer> list2 = new ArrayList<Integer>();
		 * 
		 * for(int i=1; i<=10; i++) { if(!list.contains(i)) list2.add(i);
		 * 
		 * else list2.add(list.get(i-1)); }
		 * 
		 * System.out.println(list2);
		 * 
		 */
		  
		/*
		 * for(int i =0; i<list.size(); i++) { for(int j=0; j<list.size()-1; j++) {
		 * 
		 * if(list.get(j)>list.get(j+1)) { int temp = list.get(j); list.set(j, j+1);
		 * list.set(j+1, temp); } } }
		 */
		  System.out.println(list);
		 
		
		Date  d = new Date();
		System.out.println(d);
		
		/*
		 * try { String s = null; System.out.println("1"); try {
		 * System.out.println(s.length()); }catch(NullPointerException e) {
		 * System.out.println("f"); } System.out.println("hhe");
		 * }catch(NullPointerException e) { System.out.println("s"); }
		 */
	/*	
		int i=0, j=9;
		do {
			i++;
			if(j--<i++) {
				break;
			}
		}while(i<5) ;
			System.out.println(i+""+j);
		}*/
		
	
	  P: 
		  for(int i=2; i<7;i++) 
		  { 
			  int j=i+1; 
		  if(j==3) 
			  continue; 
		  if(i==5)
			  break P;
		  s=s+i;
	  } System.out.println(s);
	 
	}
	
	
	/*
	 * static { Set s = new HashSet(); s3=Collections.unmodifiableSet(s);
	 * if(s3.contains("2")) { System.out.println("inside if"); } else {
	 * System.out.println("3"); } }
	 */
	
	ArrayListEx(){
		System.out.println("Base");
	}

}

class ArrayListEx2 extends ArrayListEx{
	
	ArrayListEx2(){
		System.out.println();
	}
}

class ArrayListEx3 extends ArrayListEx2{
	
}