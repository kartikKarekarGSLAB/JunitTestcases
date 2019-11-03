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
	
	public enum MONTHS {
							JAN("JAN",31),FEB("FEB",28),MAR("MAR",31),APR("APR",30),
							MAY("MAY",31),JUN("JUN",30),JUL("JUL",31),AUG("AUG",31),
							SEP("SEP",30),OCT("OCT",31),NOV("NOV",30),DEC("DEC",31);
							
							private String month;
							private int noOfDays;
	
							MONTHS(String month,int noOfDays) {
								this.month= month;
								this.noOfDays= noOfDays;
							}

							public String getMonth() {
								return month;
							}

							public int getNoOfDays() {
								return noOfDays;
							}
						};
	
	public int addition(int number1, int number2) {
		return number1 + number2;
	}
	
	public boolean isPalindrome(String inputString) {
		StringBuilder tempStringLocation = new StringBuilder(inputString);
		return (StringUtils.equalsIgnoreCase(inputString, tempStringLocation.reverse().toString())) ? true : false;
	}
	
	public boolean isPrime(int number) {
		int index = 2;
		while(index <= number/2) {
			if(number%index == 0) {
				return false;
			}
			index++;
		}
		return true;
	}
	
	public Double salaryCalculator(double perHourSalary,int numberOfDailyWorkingHours,String month) {
		if(StringUtils.isNotBlank(month)) {
			try {
				if(numberOfDailyWorkingHours >= 5 && numberOfDailyWorkingHours <=  24) {
					MONTHS monthEnumValue = MONTHS.valueOf(month);
					int monthlyHours = ((monthEnumValue.getNoOfDays()) * numberOfDailyWorkingHours);
					if(perHourSalary >= 0) {
						return perHourSalary * monthlyHours;
					} else {
						System.err.println("Invalid Salary perHours."+perHourSalary);
					}
				} else {
					System.err.println("Invalid numberOfDailyWorkingHours."+numberOfDailyWorkingHours);
				}
			} catch (IllegalArgumentException e) {
				System.err.println("Invalid month value passed."+month);
				throw e;
			}
		} else {
			System.err.println("Invalid month value either empty/null");
		}
		return (double) 0;
	}
}
