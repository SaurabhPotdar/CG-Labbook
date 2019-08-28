package com.cg.employeemanagement.dao;

import com.cg.employeemanagement.dto.Employee;
import com.cg.employeemanagement.dto.*;

public interface EmployeeDAO {
	
	public Employee addEmployee(Employee emp);
	
	public Employee[] showEmployee();
	
	public Employee searchEmployee(EmployeeArray[],int id);
	
	public void removeEmployee(EmployeeArray[],int id);
	
	public void updateEmployee(EmployeeArray[],int id, String name);
	
	
}
