package com.test.examples;

public class ShallowCopy {

	public static void main(String[] args) throws CloneNotSupportedException {
		ClassB objb = new ClassB(); 
		objb.a=10;	
		objb.obja.x=30;
				
		System.out.println(objb.a +" "+objb.obja.x);
		ClassB copy = (ClassB) objb.clone();
		copy.a=100;
		copy.obja.x=300;
		System.out.println(objb.a +" "+objb.obja.x);
		
		System.out.println(copy.a +" "+copy.obja.x);

	}

}

class ClassA 
{ 
    int x; 
} 
  
// Contains a reference of Test and implements 
// clone with shallow copy. 
class ClassB implements Cloneable 
{ 
    int a; 
    ClassA obja = new ClassA(); 
    public Object clone() throws
                   CloneNotSupportedException 
    { 
        return super.clone(); 
    } 
} 