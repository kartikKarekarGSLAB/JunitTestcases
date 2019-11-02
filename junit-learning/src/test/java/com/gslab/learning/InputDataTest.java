package com.gslab.learning;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class InputDataTest {
	public InputData input;
	
	@Before
	public void initalization() {
		System.out.println("inside initalizer for testcases :");
		this.input = new InputData();
	}		
	
	@Test
	public void testShouldTestAddition() {
		int inputNumber1=10, inputNumber2= 20;
		int result = this.input.addition(inputNumber1, inputNumber2);
		
		assertEquals(3, result);
		
	}
	
	@Test
	public void testShouldCheckIsStringPolindrome() {
		String inputString = "ABCDCBA";
//		assertTrue(this.input.isPalindrome(inputString));
		
		assertSame(inputString, this.input.isPalindrome(inputString));
		
	}
}
