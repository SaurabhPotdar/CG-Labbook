package com.cg.abs;

public class Dog extends Animal{

	public Dog(String name,boolean fly,int legs) {
		super(name,fly,legs);
	}

	@Override
	public void eat() {
		System.out.println("Dog is eating");
	}

	@Override
	public void breathe() {
		System.out.println("Dog is breathing");
	}
	
	static {
		System.out.println("Dog class Static block");
	}

	
	
}
