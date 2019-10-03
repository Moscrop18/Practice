package com.test.examples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationExample {
	
		  public static void main(String [] args)  { 
		    ChildSerializable c = new ChildSerializable(); 
		      System.out.println("Before : -  " +  c.noOfWheels + " "+ c.color); 
		    try { 
		      FileOutputStream fs = new FileOutputStream("superNotSerail.ser"); 
		      ObjectOutputStream os = new ObjectOutputStream(fs); 
		      os.writeObject(c); 
		      os.close(); 
		    } catch (Exception e) 
		    {  e.printStackTrace(); 
		    } 
		  } 
		

}




