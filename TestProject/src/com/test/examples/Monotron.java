package com.test.examples;

import java.util.HashMap;
import java.util.Map;

class Monotron {
	public static void main(String args[]) throws Exception {

		long L = 0, R = 2;
		int STEP_SIZE = 3;

		int N = 8;
		long arr[] = {16, 10, 10, 4, 8, 7, 15, 20};
		long startTime=System.nanoTime();
		//getResult( arr,L, R, STEP_SIZE);
		solve(L, R, STEP_SIZE, arr);
		long endTime = System.nanoTime();
		System.out.println("Total Time:"+(endTime-startTime));

	}

	//Solution 1
	public static void solve(long l, long r, int stepSize, long[] arr) {
		
		int lCounter = 0;
		int rCounter = 0;

		for (int i = 0; i < arr.length; i++) {
			l += stepSize;
			r += stepSize;
			for (int j = 0; j < arr.length; j++) {

				if (l == arr[j]) {
					lCounter++;
				}
				if (r == arr[j]) {
					rCounter++;
				}

			}

		}
		System.out.println(lCounter + " " + rCounter);	

	}

	//Solution 2
	public static void getResult(long[] arr, long left, long right, int stepSize) {
		
		int lCount=0, rCount=0;
		
		//List<Long> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		Map<Long, Integer> hMap = new HashMap<Long, Integer>(); 
		
		for(long n:arr) {
			
			Integer c = hMap.get(n); 
			hMap.put(n, (c==null) ? 1 : c+1);
		}		
		
		for(int i=0; i<arr.length; i++) {
			left+=stepSize;
			right+=stepSize;
				
			if(hMap.containsKey(left)) {
				lCount+=hMap.get(left);
			}
			if(hMap.containsKey(right)) {
				int freq = hMap.get(right);
				rCount+=freq;
			}
		}
		System.out.println(lCount+" "+rCount);
		
		
	}
	
	
}