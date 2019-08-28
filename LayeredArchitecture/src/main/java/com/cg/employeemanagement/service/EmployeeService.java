package com.cg.employeemanagement.service;

import com.cg.employeemanagement.dto.Employee;

public interface EmployeeService {

	public Employee addEmployee(Employee emp);
	
	public Employee[] showEmployee();
	
	public Employee searchEmployee(Employee EmployeeArray[],long id);
	
	public void removeEmployee(Employee EmployeeArray[],long id);
	
	public Employee updateEmployee(Employee EmployeeArray[],long id,String name);
	
}
