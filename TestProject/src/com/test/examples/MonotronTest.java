package com.test.examples;
import java.util.*;
class MonotronTest {
	
    public static void main(String args[] ) throws Exception {
       
        //int N = 5;
        long arr[] = {4, 4, 2, 1,1};
        
        long startTime=System.nanoTime();
		System.out.println(solve2(arr));
        //solve(arr);
		long endTime = System.nanoTime();
		System.out.println("Total Time:"+(endTime-startTime));

       

        
    }
    //Solution 1
    public static long solve(long[] arr){
        long count=0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                long square = arr[i]*arr[i];
                if(square ==arr[j] && arr[j]!=0 && arr[j]!=1){
                 count++;   
                }
            }
        }
        System.out.println(count);
        return count;
    }
    
    //Solution 2
    public static long solve2(long arr[]) {
    	Map<Long, Integer> hMap = new HashMap<Long, Integer>(); 
    	
    	long count=0;
        int countFor1=0;
        
        for(long n:arr) {
        	if(n<0) {
        		return count;
        	}
        	Integer c = hMap.get(n); 
			hMap.put(n, (c==null) ? 1 : c+1);
			
        }      
        
        for(long n:arr){
        	
        	/*if(n==1) {
        	int freq = hMap.get(n);
        	countFor1=freq-1;
        	
        	}*/
        	 if(n>1){ 
        		long square = n*n;
        		if(hMap.containsKey(square)){
            	   count+=hMap.get(square);
               
        		}
            }
        	
        }
        count+=countFor1;
        return count;
    }
    
}