package com.test.java8;

import java.util.StringJoiner;  
public class StringJoinerExample {  
    public static void main(String[] args) {  
    	/* Passing comma(,) as delimiter and opening bracket
    	 * "(" as prefix and closing bracket ")" as suffix
    	 */
        StringJoiner s = new StringJoiner(",", "(", ")");    
          
         
        s.add("Negan");  
        s.add("Rick");  
        s.add("Maggie");  
        s.add("Daryl");  
                 
        System.out.println(s);  
        
    }  
}