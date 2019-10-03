package com.test.examples;

class MyThread  
{ 
    public static void main(String[] args) 
    { 
        //Here we are using Anonymous Inner class 
        //that define inside argument, here constructor argument 
        Thread t = new Thread(new Runnable() 
        { 
            public void run() 
            { 
                System.out.println("Child Thread"); 
            } 
        }); 
          
        t.start(); 
          
        System.out.println("Main Thread"); 
        
        //MyThread.inner in = new MyThread.inner();
        inner.test();
    } 
    
   static class inner{
    	public  static void test() {
    		System.out.println("Inside static");
    	}
    }
} 
