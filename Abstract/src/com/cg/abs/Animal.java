package com.cg.abs;

public abstract class Animal {
	
	private String name;
	private boolean fly;
	private int legs;

	public Animal(String name, boolean fly, int legs) {
		super();
		this.name = name;
		this.fly=fly;
		this.legs=legs;
	}

	public String getName() {
		return name;
	}
	
	public void canFly() {
		if(fly)
			System.out.println("Can fly");
		else
			System.out.println("Cannot fly");
	}
	
	public abstract void eat();
	public abstract void breathe();
	
	public void walk() {
		System.out.println("Non abstract method in Animal class");
	}

	
	@Override
	public String toString() {
		return "Animal [name=" + name + ", fly=" + fly + ", legs=" + legs + "]";
	}
	
	static {
		System.out.println("In Animal class Static block");
	}
	
}
