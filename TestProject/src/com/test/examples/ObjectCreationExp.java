package com.test.examples;

import java.io.ObjectOutputStream;

public class ObjectCreationExp {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, CloneNotSupportedException {
		ObjectCreationExp obj1 = new ObjectCreationExp();
		Class c= Class.forName("com.test.examples.ObjectCreationExp");
		
		ObjectCreationExp obj2 = (ObjectCreationExp) c.newInstance();
		
		ObjectCreationExp obj3 = (ObjectCreationExp) obj1.clone();
		
		

	}

}
