package com.test.examples;

public class ArrayDuplicates {

	public static void main(String[] args) {
		int a[] = {3, 5, 3,5, 6,6};
		
		int firstIndex, secondIndex;
		for(int i=0;i<a.length; i++) {
			for(int j=i; j<a.length-1; j++) {
				if(a[i]==a[i+1]) {
					firstIndex=i;
					secondIndex=j+1;
					System.out.println(firstIndex+" "+secondIndex);
				}
			}
		}
		

	}

}
