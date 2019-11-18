package com.test.examples;

import java.net.Inet4Address;
import java.net.UnknownHostException;

public class Validator {

	public static void main(String[] args) {
	
		String ip = "1.-1.1.1";
		boolean i = false;
		try {
			i = Inet4Address.getByName(ip).getHostAddress().equals(ip);
		} catch (UnknownHostException e) {
			
			e.printStackTrace();
		}
		//System.out.println(i);
		
		String s1 = "Hello";
		String s2 ="World";
		System.out.println(merge(s1, s2));

	}
	
	public static String merge(String s1, String s2) 
    { 
        // To store the final string 
        StringBuilder result = new StringBuilder(); 
  
        // For every index in the strings 
        for (int i = 0; i < s1.length() || i < s2.length(); i++) { 
  
            // First choose the ith character of the 
            // first string if it exists 
            if (i < s1.length()) 
                result.append(s1.charAt(i)); 
  
            // Then choose the ith character of the 
            // second string if it exists 
            if (i < s2.length()) 
                result.append(s2.charAt(i)); 
        } 
  
        return result.toString(); 
    } 

}
