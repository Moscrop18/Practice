/*
 * @(#)be.fgov.minfin.plda.service.implementation.declaration.Test.java
 * ===========================================================================
 * This source code is exclusive propriety of the SPF Finances. 
 * In no case are the contents allowed to be distributed to third parties or made public 
 * without prior and written consent of SPF Finances.
 * ===========================================================================
 * 
 * @(#)  TODO Replace Actual Version  31-Jan-2019
 */
/*
 * Change Activity:
 *
 * Reason 	 Date   	Author    	Version		Description
 * ------  	 ----   	------    	-------		-------------------------------------- 
 * 
 */
package com.test.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * TODO Add class or interface description 
 * 
 * @version TODO Add actual version
 * @author KamalpreetKaur, name, IBM Corp.
 */
public class Test {

 
  public static void main(String[] args) throws InterruptedException {
	  
	  A a = new B();
	  a.test();
	  
	  System.out.println(nthPrime(2));
    ArrayList<String> list1= new ArrayList<String>();
    list1.add("a");
    list1.add("b");
    List<String> list2 = Collections.unmodifiableList(list1);
    list1.add("c");
    System.out.println("List1 "+list1);
    System.out.println("List2 "+list2);
    
    int i=10;
    if(i++==++i) {
    	System.out.println("Inside if :"+i);
    }
    else {
    	System.out.println("inside else :"+i);
    }
   
  }
  public static int nthPrime(int n) {
    int number=2;
    int count = 1;
    /*for(number = 2; count < n; number++) {
        if (isPrime(number)) {
            ++count;
        }
    }*/
    while(n>count){
    	number++;
    	if(isPrime(number)){
    		count++;
    	}
    }
    // The candidate has been incremented once after the count reached n
    return number;
   
}
  
  
  
  private static boolean isPrime(int n) {
    for(int i = 2; i < n; i++) {
        if (n % i == 0) {
           
            return false;
        }
    }
    return true;
}
}


class A{
	int a=10;
	
	public void test() {
		System.out.println("A");
	}
}

class B extends A{
	int b=20;
	
	
	public  void go() {
		System.out.println("B");
	}
	
}
