/**
 * 
 */
package com.gslab.learning.model;

/**
 * @author kakareka
 *
 */
public class Employee {

	private Integer employeeId;
	private String employeeName;
	private String employeeDesignation;
	private String employeeDepartment;
	private Double employeeSalary;
	
	static String greetWithVoice(String message) {
		
		return message;
		
	}
	
	/**
	 * @param employeeId
	 * @param employeeName
	 * @param employeeDesignation
	 * @param employeeDepartment
	 * @param employeeSalary
	 */
	public Employee(Integer employeeId, String employeeName, String employeeDesignation, String employeeDepartment,
			Double employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeDesignation = employeeDesignation;
		this.employeeDepartment = employeeDepartment;
		this.employeeSalary = employeeSalary;
	}


	public Employee() {
		this.employeeId = 00;
		this.employeeName = "name";
		this.employeeDesignation = "designation";
		this.employeeDepartment = "department";
		this.employeeSalary = 00.00;		
	}


	public Integer getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}


	public String getEmployeeName() {
		return employeeName;
	}


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}


	public String getEmployeeDesignation() {
		return employeeDesignation;
	}


	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}


	public String getEmployeeDepartment() {
		return employeeDepartment;
	}


	public void setEmployeeDepartment(String employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}


	public Double getEmployeeSalary() {
		return employeeSalary;
	}


	public void setEmployeeSalary(Double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}


	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeDesignation="
				+ employeeDesignation + ", employeeDepartment=" + employeeDepartment + ", employeeSalary="
				+ employeeSalary + "]";
	}
	
	private String privateTalk(String message) {
		return message;
	}
	
	public String speakLouder() {
		return privateTalk("Don't tell anyone!");
	}
	

}
