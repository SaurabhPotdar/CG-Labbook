package com.cg.employeemanagement.service;

import com.cg.employeemanagement.dto.Employee;

public interface EmployeeService {

	public Employee addEmployee(Employee emp);
	
	public Employee[] showEmployee();
	
	public Employee searchEmployee(EmployeeArray[],int id);
	
	public void removeEmployee(EmployeeArray[],int id);
	
	public void updateEmployee(EmployeeArray[],int id,String name);
	
}
