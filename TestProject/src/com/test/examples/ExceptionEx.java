package com.test.examples;

import java.io.IOException;

public class ExceptionEx {

	static int a= 10;
	public static void main(String[] args) throws Exception {
		ExceptionEx o = new ExceptionEx();
		o.test();
		System.out.println(a);
		

	}
	
	public  void test() throws Exception{
		try {
			a=20;
			System.out.println(a);
			throw new IOException();
			
			
		}catch(Exception e) {
			a=30;
			System.out.println(a);
			
		}
		catch(Throwable t) {
			a=35;
			System.out.println(a);
		}
		finally {
			a=40;
			System.out.println(a);
		}
	}

}
