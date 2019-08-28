package com.cg.employeemanagement.service;

import com.cg.employeemanagement.dao.EmployeeDAO;
import com.cg.employeemanagement.dao.EmployeeDAOImpl;
import com.cg.employeemanagement.dto.Employee;

public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeDAO dao=new EmployeeDAOImpl();
	
	public Employee addEmployee(Employee emp) {
		return dao.addEmployee(emp);
	}

	public Employee[] showEmployee() {
		return dao.showEmployee();
	}
	
	public Employee searchEmployee(Employee EmployeeArray[],long id) {
		return dao.searchEmployee(EmployeeArray, id);
	}
	
	
	public void removeEmployee(Employee[] EmployeeArray, long id) {
		dao.removeEmployee(EmployeeArray, id);
		
	}

	public Employee updateEmployee(Employee[] EmployeeArray, long id, String name) {
		// TODO Auto-generated method stub
		return dao.updateEmployee(EmployeeArray, id, name);
	}
	}
