package com.cg.employeemanagement.ui;

import java.util.Scanner;

import com.cg.employeemanagement.dto.Department;
import com.cg.employeemanagement.dto.Employee;
import com.cg.employeemanagement.service.EmployeeService;
import com.cg.employeemanagement.service.EmployeeServiceImpl;

public class MyApplication {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the Employee Id: ");
		long id=scn.nextLong();
		System.out.println("Enter the Employee Name: ");
		String name=scn.next();
		System.out.println("Enter the Employee Salary: ");
		float sal=scn.nextFloat();
		System.out.println("Enter the Department Id: ");
		long did=scn.nextLong();
		System.out.println("Enter the Department Name: ");
		String dname=scn.next();
		
		Department dep=new Department();
		dep.setDeptId(did);
		dep.setDeptName(dname);
		
		Employee emp=new Employee();
		emp.setEmpName(name);
		emp.setEmpId(id);
		emp.setEmpSalary(sal);
		emp.setEmpDept(dep);
		
		EmployeeService service=new EmployeeServiceImpl();
		service.addEmployee(emp);
		service.addEmployee(emp);
		service.addEmployee(emp);
		service.addEmployee(emp);
		service.addEmployee(emp);
		
		Employee empArray[]=service.showEmployee();
		
		service.searchEmployee(empArray, id);
		
		service.updateEmployee(empArray, id, "Potdar");
		
		for(Employee e: empArray) {
			System.out.println(e.getEmpName());
		}
		
		scn.close();
	}

}
