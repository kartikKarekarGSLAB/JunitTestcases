package com.gslab.learning;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Categories.ExcludeCategory;

public class InputDataTest {
	public InputData input;
	public static int testcaseIndex = 0;
	
	@Before
	public void initalization() {
//		System.out.println("** inside initalizer for testcases **" + (InputDataTest.testcaseIndex + 1));
		this.input = new InputData();
//		InputDataTest.testcaseIndex++;
	}		
	
	@Test
	public void testShouldTestAddition() {
		int inputNumber1=10, inputNumber2= 20;
		int result = this.input.addition(inputNumber1, inputNumber2);		
		assertEquals(30, result);
	}
	
	@Test
	public void testShouldCheckIsStringPolindrome() {
		String inputString = "ABCDCBA";
		assertTrue(this.input.isPalindrome(inputString));
	}
	
	@Test
	public void testShouldCheckReturnFalseForIsStringPolindrome() {
		String inputString = "GSlab";
		assertFalse(this.input.isPalindrome(inputString));
	}
	
	@Test
	public void testShouldCheckIsPrime() {
		int number = 7;
		assertTrue(this.input.isPrime(number));
	}	
	
	@Test
	public void testShouldReturnFalseForIsPrime() {
		int number = 20;
		assertFalse(this.input.isPrime(number));
	}	
	
	@Test
	public void testShouldCalculateSalary() {
		double perHourSalary= 100.50;
		int numberOfDailyWorkingHours= 9;
		String month= "OCT";
		double salary = this.input.salaryCalculator(perHourSalary, numberOfDailyWorkingHours, month);
		assertEquals(28039.5, salary, 0.0);
	}
	
	@Test
	public void testShouldCalculateSalaryForMonth() {
		double perHourSalary= 100.50;
		int numberOfDailyWorkingHours= 9;
		String month= null;
		double salary = this.input.salaryCalculator(perHourSalary, numberOfDailyWorkingHours, month);
		assertEquals(0.0, salary, 0.0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testShouldThrowIllegalArgumentExceptionForCalculateSalary() {
		double perHourSalary= 100.50;
		int numberOfDailyWorkingHours= 9;
		String month= "JAN1@#@";
		this.input.salaryCalculator(perHourSalary, numberOfDailyWorkingHours, month);
	}
	
	@Test
	public void testShouldCalculateSalaryForInvalidNDWH() {
		double perHourSalary= 100.50;
		int numberOfDailyWorkingHours= 3;
		String month= "OCT";
		double salary = this.input.salaryCalculator(perHourSalary, numberOfDailyWorkingHours, month);
		assertEquals(0.0, salary, 0.0);
	}
	
	@Test
	public void testShouldCalculateSalaryForInvalidNDWH2() {
		double perHourSalary= 100.50;
		int numberOfDailyWorkingHours= 50;
		String month= "OCT";
		double salary = this.input.salaryCalculator(perHourSalary, numberOfDailyWorkingHours, month);
		assertEquals(0.0, salary, 0.0);
	}	
	
	@Test
	public void testShouldCalculateSalaryForInvalidPHS() {
		double perHourSalary= -50;
		int numberOfDailyWorkingHours= 9;
		String month= "OCT";
		double salary = this.input.salaryCalculator(perHourSalary, numberOfDailyWorkingHours, month);
		assertEquals(0.0, salary, 0.0);
	}	
	
	
	
	
	
	
}
