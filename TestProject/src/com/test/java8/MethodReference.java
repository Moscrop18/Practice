package com.test.java8;

import java.util.function.BiFunction;

@FunctionalInterface 
interface MyInterface{  
    void display();  
}  
public class MethodReference {  
    public void myMethod(){  
	System.out.println("Instance Method");  
    }  
    public static void main(String[] args) {  
    	MethodReference obj = new MethodReference();   
	// Method reference using the object of the class
	MyInterface ref = obj::myMethod;  
	// Calling the method of functional interface  
	ref.display();  
    }
    
    public void test() {
    	BiFunction<Integer, Integer, Integer> product = Multiplication::multiply;  
    	//int pr = product.apply(11, 5);  
    	//System.out.println("Product of given number is: "+pr);  
    }
}

class Multiplication{  
	   public static int multiply(int a, int b){  
		return a*b;  
	   }  
	} 