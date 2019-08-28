package com.cg.demoone.dto;

//super class or parent class
public class Employee {
	
	public int empId;
	public Employee() {
		System.out.println("In Employee Constructor....");
	}
	
	public Employee(int i) {
		System.out.println("In Employee Parametrized Constructor....");
	}
	
	public void getData() {
		System.out.println("In Employee getData method");
	}

}
