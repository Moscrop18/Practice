package com.test.dp;

public class NthPrime {

	public static void main(String[] args) {
		System.out.println(nthPrime(2));
	}
	public static int nthPrime(int n) {
	    int number=2;
	    int count = 1;
		/*
		 * for(number = 2; count < n; number++) { if (isPrime(number)) { ++count; } }
		 */
	    while(n>count){
	   	number++;
	    	if(isPrime(number)){
	    		count++;
	    	}
	    }
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
