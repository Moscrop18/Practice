package com.test.examples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Properties;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;

public class QueueExample {

	public static void main(String[] args) {
		Queue<Integer> priorityQueue = new PriorityQueue<Integer>();
		
		priorityQueue.add(1);
		priorityQueue.add(5);
		priorityQueue.add(2);
		priorityQueue.add(3);
		priorityQueue.add(0);
		try {
		//priorityQueue.remove(2);
		//priorityQueue.remove();
		//System.out.println(priorityQueue.poll());
		System.out.println(priorityQueue);
		System.out.println(priorityQueue.remove());
		//System.out.println(priorityQueue.offer(null));
		//System.out.println(priorityQueue.offer(2));
		//priorityQueue.spliterator();
		System.out.println(priorityQueue);
		}catch(Exception e) {
			System.out.println("exception caught");
		}
		
		
		getMap();
	
	}
	
	private static void getMap() {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		map.put(1, 1);
		map.put(3, 3);
		map.put(2, 2);
		
		Iterator<Map.Entry<Integer, Integer>> it = map.entrySet().iterator();
	while(it.hasNext()) {
		Map.Entry<Integer, Integer> next = it.next();
		if(next.getKey()==2) {
		it.remove();
		System.out.println();
		}
			//System.out.println(it.next());
			
		}
		
	}
	
	public static void getBlockingQueue() {
		
	}

}
