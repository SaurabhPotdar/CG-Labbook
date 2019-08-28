package com.cg.demoone.ui;

//import com.cg.demoone.dto.Employee;

import com.cg.demoone.dto.*;  //To import all class from dto package

public class MyApplication {

	public static void main(String[] args) {
		Employee employee = new Employee();
		
		System.out.println();
		Project project = new Project("Saurabh");
		System.out.println();
		
		project.getData();
		project.empId=100;  //We cannot access empID
		
		System.out.println();
		System.out.println("Overloading:");
		project.overload(10);
		System.out.println(project.overload("Saurabh"));
		
		System.out.println();
		System.out.println("Overriding:");
		project.getData();
				
		System.out.println();
		Employee pro = new Project();
		pro.getData();
		
	}
	

}
