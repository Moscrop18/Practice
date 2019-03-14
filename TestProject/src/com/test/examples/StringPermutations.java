package com.test.examples;

public class StringPermutations {

	public static void main(String[] args) {
		getPermutations("abc");

	}
	
	public static void getPermutations(String s) {
		getPermutations(s, "");
	}

	public static void getPermutations(String s, String prefix) {
		if(s.length()==0) {
			System.out.println(prefix);
		}
		else {
			for(int i=0; i<s.length(); i++) {
				String rem = s.substring(0, i)+s.substring(i+1);
				getPermutations(rem, prefix+s.charAt(i));
			}
		}
	}
}
