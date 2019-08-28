package com.cg.employeemanagement.dao;

import com.cg.employeemanagement.dto.Employee;

public interface EmployeeDAO {
	
	public Employee addEmployee(Employee emp);
	
	public Employee[] showEmployee();
	
	public Employee searchEmployee(Employee EmployeeArray[],long id);
	
	public void removeEmployee(Employee EmployeeArray[],long id);
	
	public Employee updateEmployee(Employee EmployeeArray[],long id, String name);
	
	
}
