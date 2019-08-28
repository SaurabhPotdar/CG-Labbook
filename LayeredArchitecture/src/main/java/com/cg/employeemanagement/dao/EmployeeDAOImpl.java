package com.cg.employeemanagement.dao;

import com.cg.employeemanagement.dto.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {
	
	final int ARRAY_LIMIT=5;
	
	Employee[] emp=new Employee[ARRAY_LIMIT];
	private int top=0;
	
	public Employee addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		if(top<=(ARRAY_LIMIT-1)) {
			this.emp[top]=emp;
			top++;
		}
		return emp;
	}

	public Employee[] showEmployee() {
		// TODO Auto-generated method stub
		return this.emp;
	}
	
	public Employee searchEmployee(Employee EmployeeArray[],long id) {
		for(Employee e:EmployeeArray) {
			if(null!=e && e.getEmpId()==id)
				return e;
		}
		return null;
	}
	
	public void removeEmployee(Employee EmployeeArray[],long id) {
		for(Employee e:EmployeeArray) {
			if(null!=e && e.getEmpId()==id)
				e=null;
		}
	}
	
	public Employee updateEmployee(Employee EmployeeArray[],long id, String name) {
		for(Employee e:EmployeeArray) {
			if(e.getEmpId()==id) {
				e.setEmpName(name);
				return e;
			}
		}
		return null;
	}
	
}
