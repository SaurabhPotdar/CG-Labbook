package com.cg.demoone.dto;

public class Project extends Employee{
	
	public Project() {
		System.out.println(this);  //Shows us the current object
		System.out.println("In Project Constructor....");
	}
	
	public Project(String name) {
		this();
		System.out.println("In Project Parametrized Constructor");
	}
	
	//Method Overloading
	public void overload(int a) {
		System.out.println("Integer data");
	}
	public String overload(String a) {
		//System.out.println("String data");
		return "String data";
	}
	
	//Method Overriding
	@Override
	public void getData() {
		System.out.println("In Project getData method");
	}

}
