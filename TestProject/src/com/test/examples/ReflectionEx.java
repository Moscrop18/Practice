package com.test.examples;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionEx {

	public static void main(String[] args) throws  SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException, NoSuchMethodException {
		
		Reflection obj = new Reflection();
		
		Class cls = obj.getClass();
		System.out.println("Class name:"+cls.getName());
		
		
		Constructor c = cls.getConstructor();
		System.out.println("Constructor name:"+c.getName());
		
		Method[] methods = cls.getDeclaredMethods();
		
		for( Method method: methods) {
			System.out.println("Method name:"+method);
		}

		Method m = cls.getDeclaredMethod("test");
		m.invoke(obj);
		
		
		Field field = cls.getDeclaredField("name"); 
		field.setAccessible(true);
		field.set(obj, "Kamu");
		 
		System.out.println(obj.getName());
		
		Method m2 = cls.getDeclaredMethod("test1");
		
		m2.setAccessible(true);
		m2.invoke(obj);
	}
	
}
	
	class Reflection{
		
		private String name;
		
		
		public Reflection() {
			name="Kamal";
		}
		
		public void test() {
			System.out.println("test");
		}
		
		private void test1() {
			System.out.println("Private test");
		}
		
		public String getName() {
			return this.name;
		}
		
	}

