package com.cg.employeemanagement.dao;

import com.cg.employeemanagement.dto.Employee;

public class EmployeeDAOImpl implements EmployeeDAO{
	
	final int ARRAY_LIMIT=5;
	
	Employee[] emp=new Employee[ARRAY_LIMIT];
	private int top=0;
	
	public Employee addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		if(top<=(ARRAY_LIMIT-1)) {
			this.emp[top]=emp;
			top++;s
		}
		return emp;
	}

	public Employee[] showEmployee() {
		// TODO Auto-generated method stub
		return this.emp;
	}
	
	public Employee searchEmployee(EmployeeArray[],int id) {
		for(Employee e:Employee) {
			if(e.empId==id)
				return e;
		}
		return null;
	}
	
	public void removeEmployee(EmployeeArray[],int id) {
		for(Employee e:Employee) {
			if(e.empId==id)
				//return e;
		}
	}
	
	public void updateEmployee(EmployeeArray[],int id, String name) {
		for(Employee e:Employee) {
			if(e.empId==id)
				e.empName=name;
		}
	}
	
}
