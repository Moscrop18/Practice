package com.test.examples;

public class QuickSortEx {

	public static void main(String[] args) {
		int arr[] = {1, 5, 4, 7, 9, 6};
		System.out.println(sort(arr));

	}
	
	
	public static int sort(int[]arr) {
		
		int low = 0;
		int high = arr.length-1;
		int pivot = arr[high];
		int i = low-1;
		int temp;
		
		for(int j=0; j<high; j++) {
			if(arr[j]<pivot) {
				i++;
				
				temp = arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
				
			}
		}
		
		temp = arr[i+1];
		arr[i+1]= arr[high];
		arr[high]= temp;
		return i+1;
	}

}
