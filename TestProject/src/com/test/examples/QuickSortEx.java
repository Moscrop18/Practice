package com.test.examples;

public class QuickSortEx {

	public static void main(String[] args) {
		int arr[] = {1, 5, 4, 7, 9, 6};
		System.out.println(sort(arr));
		solve(6, arr);
		char[] c = {'o', 'm', 'a','r'};
		con(c);

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
	 
	
	public static  void solve(int n, int[]a) {
		
		int farthest = a[0];
		for(int i=0; i<n ; i++) {
			if(a[i]>farthest) {
				farthest =  a[i];
			}
		}
		System.out.println(farthest);
	}
	
	public static String con(char[]a) {
		String s="";
		for(char a1:a) {
			s+=String.valueOf(a1);
		}
		return s;
		
		
	}

}
