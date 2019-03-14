package com.test.junit;

import com.test.examples.NonRepeatedChar;

import static org.junit.Assert.assertEquals;
import org.junit.*;


public class TestNonRepeatedChar {
	
	 @Test
	    public void testGetFirstNonRepeatedChar() {
	        assertEquals('b', NonRepeatedChar.getNonRepeatedChar("abcdefghija"));
	        assertEquals('h', NonRepeatedChar.getNonRepeatedChar("hello"));
	        assertEquals('J', NonRepeatedChar.getNonRepeatedChar("Java"));
	        assertEquals('i', NonRepeatedChar.getNonRepeatedChar("simplest"));
	    }


	
}
