package com.test.examples;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.test.examples.ArrayMerge.Employee;

public class ArrayMerge {

	public static void main(String[] args) {
		int arr1[]= {-3,-1,5,9};
		int arr2[]= {-2, 0, 8, 10};
		
		int arr3[]=mergeArray(arr1, arr2);
		/*
		 * for(int i=0; i<arr3.length; i++) { System.out.println(arr3[i]); }
		 */
		/*
		 * System.out.println(arr1); List<Employee> list = new ArrayList<Employee>();
		 * ArrayMerge a = new ArrayMerge(); ArrayMerge.Employee e = new
		 * ArrayMerge.Employee(1); ArrayMerge.Employee e1 = new ArrayMerge.Employee(2);
		 * list.add(e); list.add(e1); System.out.println(list);
		 */
		long startTime=System.nanoTime();
		printList();
		long endTime = System.nanoTime();
		System.out.println("Total Time:"+(endTime-startTime));

		
		  long startTime1=System.nanoTime(); 
		  printList2(); 
		  long endTime1 =System.nanoTime();
		  System.out.println("Total Time:"+(endTime1-startTime1));
		 
	}
	
	static class Employee{
		int id;
		
		Employee(int id){
			this.id =id;
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
	
	static void printList(){
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<=100000; i++) {
			list.add(i);
			
		}
		
	}
	
	static void printList2() {
		List<Integer> list = new LinkedList<Integer>();
		for(int i=0; i<=100000; i++) {
			list.add(i);
		}
		
	}
}
