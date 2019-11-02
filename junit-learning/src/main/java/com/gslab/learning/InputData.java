/**
 * 
 */
package com.gslab.learning;

import org.apache.commons.lang3.StringUtils;

/**
 * @author kakareka
 *
 */
public class InputData {
	
	public int addition(int number1, int number2) {
		return number1 + number2;
	}
	
	public boolean isPalindrome(String inputString) {
		StringBuilder tempStringLocation = new StringBuilder(inputString);
		return (StringUtils.equalsIgnoreCase(inputString, tempStringLocation.reverse().toString())) ? true : false;
	}
}
