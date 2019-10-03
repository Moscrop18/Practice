package com.test.examples;

import java.util.LinkedList;

public class PCExmaple {

	public static void main(String[] args) throws InterruptedException {
		 PC obj = new PC();
		
		 Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				
					try {
						obj.produce();
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
				
				
			}
			 
		 });
		 
		 Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					obj.consume();
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				
			}
		});
		 
		 thread1.start();
		 thread2.start();
		 
		 thread1.join();
		 thread2.join();
	}
	
}
	
	class PC{
		LinkedList<Integer> list = new LinkedList<Integer>();
		int capacity = 2;
		
		public  void produce() throws InterruptedException {
			int value =0;
			
			while(true) {
				synchronized (this) {
						if(list.size()==capacity) {
							wait();
						}
						System.out.println("producer produced:" +value);
						list.add(value++);
						notify();
						
						Thread.sleep(1000);
				}
			}
		}
		
		public void consume() throws InterruptedException {
			while(true) {
				synchronized (this) {
					if(list.size()==0) {
						wait();
					}
					int value= list.removeFirst();
					System.out.println("Consumer consumed:"+value);
					
					notify();
					Thread.sleep(1000);
				}
			}
		}
	}

	