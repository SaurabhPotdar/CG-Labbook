package com.cg.abs;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name = "Labrador";
		int legs = 4;
		Animal dog = new Dog(name,false,legs);
		dog.breathe();
		dog.walk();
		dog.canFly();
		System.out.println(dog);
		
		sc.close();
	}
	
	static {
		System.out.println("In main class Static block");
	}

}
