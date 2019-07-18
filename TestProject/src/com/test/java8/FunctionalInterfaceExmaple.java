package com.test.java8;


public class FunctionalInterfaceExmaple  implements TestFunctionalInterface1,TestFunctionalInterface2{

	
	public static void main(String[] a) {
		
		FunctionalInterfaceExmaple o = new FunctionalInterfaceExmaple();
		o.test();
		
		
	}
	@Override
	public void go() {
		
	}
	@Override
	public void test() {
		// TODO Auto-generated method stub
		TestFunctionalInterface1.super.test();
	}


	
}

@FunctionalInterface
interface TestFunctionalInterface1 {
	
	void go();
	 default void test() {
		
	}
	
	static void get() {
		
	}

}

interface TestFunctionalInterface2{
	
default void test() {
	System.out.println("2");	
	}
}

