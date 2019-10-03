package com.test.examples;


public class CloneExample {

	public static void main(String[] args) throws CloneNotSupportedException {
	
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2= (Singleton) obj1.clone();
		
		 System.out.println("instance1 hashCode:- "
                 + obj1.hashCode()); 
System.out.println("instance2 hashCode:- " 
                 + obj2.hashCode());  

	}

}

class Parent implements Cloneable{

	int i = 10; 
	  
	  @Override
	  protected Object clone() throws CloneNotSupportedException  
	  { 
	    return super.clone(); 
	  } 
	
}

class Singleton extends Parent{
	
	private static Singleton obj= new Singleton();
	
	
	private Singleton() {
		
	}
	
	public static  Singleton getInstance() {
		return obj;
	}
	
	@Override
	  protected Object clone() throws CloneNotSupportedException  
	  { 
	    return obj;
	  } 
}
