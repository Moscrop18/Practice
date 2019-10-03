package com.test.examples;

import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class LRUEx {
	
	public static void main(String[] args) {
		
		LRUEx lru = new LRUEx(4);
		lru.refer(2);
		lru.refer(5);
		lru.refer(3);	
		lru.refer(5);
		lru.refer(5);
		lru.refer(8);
		lru.display();

	}
	
	
	int cSize;
	Deque<Integer> cache ;
	LRUEx(int n){
		cache = new LinkedList<Integer>();
		cSize=n;
		
	}

	
	public void refer(int e) {
		
		if(!cache.contains(e)) {
			if(cache.size()==cSize) {
				cache.removeLast();
				
			}
			
		}
		else {			
			cache.remove(e);
		}		
		cache.push(e);
		
	}
	
	public void display() 
    { 
        Iterator<Integer> itr = cache.iterator(); 
        while (itr.hasNext()) { 
            System.out.print(itr.next() + " "); 
        } 
    } 

}
