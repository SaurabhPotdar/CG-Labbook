package com.cg.employeemanagement.service;

import com.cg.employeemanagement.dao.EmployeeDAO;
import com.cg.employeemanagement.dao.EmployeeDAOImpl;
import com.cg.employeemanagement.dto.Employee;

public class EmployeeServiceImpl implements EmployeeService{

	EmployeeDAO dao=new EmployeeDAOImpl();
	
	public Employee addEmployee(Employee emp) {
		return dao.addEmployee(emp);
	}

	public Employee[] showEmployee() {
		return dao.showEmployee();
	}
	
	public Employee searchEmployee(EmployeeArray[],int id) {
		return dao.searchEmployee(EmployeeArray[],int id);
	}
	
	public void removeEmployee(EmployeeArray[],int id) {
		return dao.removeEmployee(EmployeeArray[],int id);
	}

	public void updateEmployee(EmployeeArray[],int id,String name) {
		return dao.updateEmployee(EmployeeArray[],int id,String name);
	}
	
	
	
}
