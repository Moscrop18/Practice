package com.test.java8;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
		String[] str = new String[10]; 
		str[9] = "AgraIsCool"; 
	      Optional<String> isNull = Optional.ofNullable(str[9]);        
	      if(isNull.isPresent()){              
	         String str2 = str[9].substring(2, 5);                
	         System.out.print("Substring is: "+ str2);       
	      }     
	      else{      
	         System.out.println("Cannot get the substring from an empty string");     
	      }   

	}

}
