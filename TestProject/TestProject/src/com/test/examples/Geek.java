package com.test.examples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Geek {
	
		  public static void main(String [] args)  { 
		    ChildSerializable c = new ChildSerializable(); 
		      System.out.println("Before : -  " +  c.noOfWheels + " "+ c.color); 
		    try { 
		      FileOutputStream fs = new FileOutputStream("superNotSerail.ser"); 
		      ObjectOutputStream os = new ObjectOutputStream(fs); 
		      os.writeObject(c); 
		      os.close(); 
		    } catch (Exception e) {  e.printStackTrace(); } 
		    try { 
		      FileInputStream fis = new FileInputStream("superNotSerail.ser"); 
		      ObjectInputStream ois = new ObjectInputStream(fis); 
		      c = (ChildSerializable) ois.readObject(); 
		      ois.close(); 
		    } catch (Exception e) {  e.printStackTrace(); } 
		      System.out.println("After :-  " +  c.noOfWheels + " "+ c.color); 
		  } 
		

}

class ParentNonSerializable{
	  int noOfWheels =4 ;
}

class ChildSerializable extends ParentNonSerializable implements Serializable {
	  private static final long serialVersionUID = 1L; 
	  
	  String color; 
	  ChildSerializable() { 
	    noOfWheels = 8; 
	    this.color = "blue"; 
	  } 
	}
