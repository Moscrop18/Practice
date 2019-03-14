package com.test.examples;

public class VariableConversion {

	public static void main(String[] args) {
		String s = "thisIsMe";
		System.out.println(convertVariable(s));
		
	}
	
	public static String convertVariable(String s) {
		char[] strArr = s.toCharArray();
		StringBuilder sb = new StringBuilder();
		boolean flag = false;
		for(int i=0; i<strArr.length; i++) {
		if(s.indexOf('_')==-1){
			if(strArr[i]==Character.toUpperCase(strArr[i])) {
			strArr[i]=Character.toLowerCase(strArr[i]);
			flag=true;
			}else if(flag) {
			sb.append("_");
			sb.append(strArr[i-1]);
			sb.append(strArr[i]);
			flag=false;
			}		
			else {
				sb.append(strArr[i]);
				}
		}
		else {
			if(strArr[i]=='_') {
				flag = true;
		}else if(flag) {
			sb.append(Character.toUpperCase(strArr[i]));
			flag=false;
		}
		else { 
			sb.append(strArr[i]);	
		}
	}		
}		
		return sb.toString();
		
	}

}
