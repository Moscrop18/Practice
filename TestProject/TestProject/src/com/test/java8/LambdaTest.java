package com.test.java8;

import java.util.Arrays;
import java.util.List;

public class LambdaTest {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1, 2, 3,4);
		
		list.forEach(n ->System.out.println(n));
	}

}
