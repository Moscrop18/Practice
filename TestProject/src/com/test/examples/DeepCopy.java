package com.test.examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

 public class DeepCopy {

	public static void main(String[] args) throws CloneNotSupportedException {
		ClassTwo objb = new ClassTwo(); 
		objb.a=10;	
		objb.obja.x=30;
				
		System.out.println(objb.a +" "+objb.obja.x);
		ClassTwo copy = (ClassTwo) objb.clone();
		copy.a=100;
		copy.obja.x=300;
		System.out.println(objb.a +" "+objb.obja.x);
		
		System.out.println(copy.a +" "+copy.obja.x);
		
		ArrayList<String> arrayListObject = new ArrayList<>();
        
        arrayListObject.add("A");
        arrayListObject.add("B");
        arrayListObject.add("C");
        arrayListObject.add("D");
         
        System.out.println(arrayListObject);  
         
        ArrayList<String> arrayListClone =  (ArrayList<String>) arrayListObject.clone();
        arrayListClone.add("E");

         
        System.out.println(arrayListClone);   
        
        byte x = 5;
        Float d = (Float) (float) x;
        System.out.println(x);

	}

	}



class ClassOne
{ 
    int x; 
} 
  

class ClassTwo implements Cloneable 
{ 
    int a; 
    ClassOne obja=new ClassOne();
    public Object clone() throws
                   CloneNotSupportedException 
    { 
    	ClassTwo o=(ClassTwo) super.clone(); 
    	o.obja= new ClassOne();
    	return o;
    } 
} 
