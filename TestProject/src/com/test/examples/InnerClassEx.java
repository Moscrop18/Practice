package com.test.examples;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class InnerClassEx implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Field[] fields = InnerClassEx.Inner.class.getDeclaredFields();
		
		for(Field f:fields) {
			System.out.println(f.getName()+" "+f.isSynthetic());
			
		}
		
		Method[] method = InnerClassEx.Inner.class.getDeclaredMethods();
		
		for(Method m: method) {
			System.out.println(m.getName()+" "+m.isSynthetic());
		}
		
		//new InnerClassEx().serialize();
		InnerClassEx outer = new InnerClassEx();
		InnerClassEx.Inner i = outer.new Inner();
		i.run();
	}
	
	public void serialize() throws FileNotFoundException, IOException {
		File f = new File("Test.txt");
		Inner i = new Inner();
		new ObjectOutputStream(new FileOutputStream(f)).writeObject(i);
	}
	
	public int getA() {
		return new Inner().a;
	}
	
	public void setA(int a) {
		new Inner().a=a;
	}
	
	int a = 1;
    static int b = 2;
	public  class Inner{
		
		
		 private int a = 3;
	        static final int b = 4;
	        
	        public void run() {
	            System.out.println("a = " + a);
	            System.out.println("b = " + b);
	            System.out.println("NewOuterTest.this.a = " + InnerClassEx.this.a);
	            System.out.println("NewOuterTest.b = " + InnerClassEx.b);
	            System.out.println("NewOuterTest.this.b = " + InnerClassEx.this.b);
	        }
	 }
	
	
}
