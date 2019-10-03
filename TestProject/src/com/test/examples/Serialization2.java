package com.test.examples;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Serialization2 {

	public static void main(String[] args) {
		ChildSerializable c=new ChildSerializable();
		
		 try { 
		      FileInputStream fis = new FileInputStream("superNotSerail.ser"); 
		      ObjectInputStream ois = new ObjectInputStream(fis);       
		      c = (ChildSerializable) ois.readObject(); 
		      ois.close(); 
		    } catch (Exception e) {  
		    	e.printStackTrace(); 
		    } 
		      System.out.println("After :-  " +  c.noOfWheels + " "+ c.color); 

	}

}
