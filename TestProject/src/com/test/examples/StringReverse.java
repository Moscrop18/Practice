package com.test.examples;

public class StringReverse {

	public static void main(String[] args) {
		String s="java";
		System.out.println(getReverseString(s));

	}
	
	public static String getReverseString(String s) {
		char[] sArr = s.toCharArray();
		String reverse="";
		for(int i=sArr.length-1; i>=0; i--) {
			reverse = reverse+sArr[i];
		}
		return reverse;
		
	}

}
