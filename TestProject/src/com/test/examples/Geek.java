package com.test.examples;

public abstract class Geek {

	public static void main(String[] args) {
		
		try {
			getName();
		}catch(RuntimeException e) {
			System.out.println("caught" +e);
		}

	}
	
	       
	   public static void getName() {
		   try {
			   throw new RuntimeException();
		   }finally {
			   System.out.println("In finally");
		   }
	   }

}
