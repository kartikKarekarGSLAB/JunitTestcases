CREATE ROLE javapratice LOGIN PASSWORD 'java!123';

CREATE DATABASE junit 
       ENCODING = 'UTF8';

\c junit

GRANT ALL ON DATABASE junit to javapratice;

	private Integer employeeId;
	private String employeeName;
	private String employeeDesignation;
	private String employeeDepartment;
	private Double employeeSalary;
	
CREATE TABLE employee (
  employee_pk SERIAL,
  employee_id INT NOT NULL,
  employee_name varchar(50)  NOT NULL,
  employee_designation varchar(30)  NOT NULL,
  employee_department varchar(30)  NOT NULL,
  employee_salary numeric NOT NULL
);       