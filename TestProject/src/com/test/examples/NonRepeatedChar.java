package com.test.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class NonRepeatedChar {

	public static void main(String[] args) {
		String s="jjavavba";
		System.out.println(getNonRepeatedChar(s));
		
		List<String> list = new ArrayList<>(Arrays.asList("1", "2","3" ));
		String s1 = s.join(",", list);
		System.out.println(s1);
                       

	}
	
	public static char getNonRepeatedChar(String s) {
		List<Character> repeating = new ArrayList<Character>();
		List<Character> nonRepeating = new ArrayList<Character>();
		char firstNonRepeating = 0;
		char[] strArr = s.toCharArray();
		for(char c:strArr) {
			if(repeating.contains(c)) {	
				continue;
			}
			if(nonRepeating.contains(c)) {
				nonRepeating.remove((Character)c);
				repeating.add(c);
			}else {
				nonRepeating.add(c);
			}
		}
		if(nonRepeating!=null && nonRepeating.size()>0) {
		firstNonRepeating= nonRepeating.get(0);
		}
		else {
			System.out.println("No non repeating character");
			
		}
		System.out.println(repeating);
		return firstNonRepeating;
	}

}
