/*
 * @(#)com.test.java8.LambdaTest.java
 * ===========================================================================
 * This source code is exclusive propriety of the SPF Finances. 
 * In no case are the contents allowed to be distributed to third parties or made public 
 * without prior and written consent of SPF Finances.
 * ===========================================================================
 * 
 * @(#)  TODO Replace Actual Version  07-Feb-2019
 */
/*
 * Change Activity:
 *
 * Reason 	 Date   	Author    	Version		Description
 * ------  	 ----   	------    	-------		-------------------------------------- 
 * 
 */
package com.test.dp;

import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;



/**
 * TODO Add class or interface description 
 * 
 * @version TODO Add actual version
 * @author KamalpreetKaur, name, IBM Corp.
 */
public class UglyNumbers {

  /**
   * TODO A brief description of what the method does
   * @param args
   */
  public static void main(String[] args) {
	  //System.out.println(isUgly(10));
	  //System.out.println(getNthUgly(7));
	 System.out.println(fib(5));
   /* CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<Integer>();
    list.add(11);
    list.add(12);
    list.add(13);
    
   Iterator<Integer> it = list.iterator();
   while(it.hasNext()){
	   System.out.println(it.next());
	   it.remove();
	   System.err.println(list);
   }
   
   for(Integer i:list){
	   System.out.println(i);
	   list.remove(0);
	   System.out.println("modified list "+i);
   }*/
}
  static int fib(int n) 
  { 
  if (n <= 1) 
     return n; 
  return fib(n-1) + fib(n-2); 
  } 
  
  static int maxDivide(int a, int b) 
  { 
      while(a % b == 0) {
          a = a/b;
      //System.out.println(a);
      }
      return a; 
  } 
    
  /* Function to check if a number  
  is ugly or not */
  static int isUgly(int no) 
  { 
      no = maxDivide(no, 2); 
      no = maxDivide(no, 3); 
      no = maxDivide(no, 5); 
        
      return (no == 1)? 1 : 0; 
  } 
  
  static int getNthUgly(int n){
	  int count =1;
	  int i=1;
	/*for(i=1; count<n ; i++){
		if(isUgly(i) == 1){
			count++;
		}
	}*/
	  while(n>count){
		  i++;
		  if(isUgly(i)==1){
			  count++;
		  }
	  }
	return i;
	  
  }
  
  
}


