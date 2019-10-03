package com.test.examples;

public class ArrayMerge {

	public static void main(String[] args) {
		int arr1[]= {-3,-1,5,9};
		int arr2[]= {-2, 0, 8, 10};
		
		int arr3[]=mergeArray(arr1, arr2);
		for(int i=0; i<arr3.length; i++) {
			System.out.println(arr3[i]);
		}
	}
	
	public static int[] mergeArray(int[]arr1, int[]arr2) {
		int arr1Length = arr1.length;
		int arr2Length = arr2.length;
		
		int i=0, j=0 , k=0;
		int arr3[] = new int[arr1Length+arr2Length];
		
		while(i<arr1Length && j<arr2Length) {
			if(arr1[i]<arr2[j]) {
			arr3[k++] = arr1[i++];
			}else {
				arr3[k++] = arr2[j++];
			}
		}
		
		while(i<arr1Length) {
			arr3[k++]=arr1[i++];
		}
		
		while(j<arr2Length) {
			arr3[k++]=arr2[j++];
		}
		return arr3;
	}
}
