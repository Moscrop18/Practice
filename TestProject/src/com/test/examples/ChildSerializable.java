package com.test.examples;

import java.io.Serializable;

class ChildSerializable extends ParentNonSerializable implements Serializable {
	  private static final long serialVersionUID = 1L; 
	  
	  final String color="blue";
	  ChildSerializable() { 
	    noOfWheels = 8; 
	   
	  } 
	}
