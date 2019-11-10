package com.gslab.learning.model;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Employee.class)
public class EmployeeTest {

	Employee employee;
	
	@Mock
	Employee mockEmployee;
	
	@Before
	public void testInitSetup() {
		System.out.println("** inside setup function for testcase **");
		this.employee = new Employee();
		
	}
	
	@After
	public void testCleanSetup() {
		this.employee = null;
	}
	
	@Test
	public void testVerifyDefaultValuesOfInstance() {
		
		assertEquals("Expected employee id 00 not mataching with actual id="+employee.getEmployeeId(), new Integer(0), employee.getEmployeeId());
		assertEquals("Expected employee name \"name\" not mataching with actual name="+employee.getEmployeeName(), "name", employee.getEmployeeName());
		
	}
	
	@Test
	public void testForParameteriseConstructor() {
		Employee emp = new Employee(101, "Kartik Karekar", "Software Engineer", "CIS", 10000.00);
		assertEquals("Expected employee id 101 not mataching with actual id="+employee.getEmployeeId(), new Integer(101), employee.getEmployeeId());
		
	}
	
	@Test
	public void testForStraticMethod() {
		PowerMockito.mockStatic(Employee.class);
		when(Employee.greetWithVoice("Hi kartik")).thenReturn("Hi Kartik");
		
		assertEquals("Hi Kartik", Employee.greetWithVoice("Hi Kartik"));
		
	}
	
	@Test
	public void testForPrivateMethod() throws Exception {
		Employee emp = new Employee(101, "Kartik Karekar", "Software Engineer", "CIS", 10000.00);
//		PowerMockito.doReturn("Don't tell anyone!").when(mockEmployee, "privateTalk");
		assertEquals("Don't tell anyone!", emp.speakLouder());
	}
	
	
}
