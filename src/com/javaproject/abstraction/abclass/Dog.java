package com.javaproject.abstraction.abclass;

public class Dog extends Pet{

	public Dog(String name, int age) {
		super(name, age);
		
	}

	@Override
	public void speak() {
		
		System.out.println(this.name + "said bark !!");
}

	@Override
	void m1() {
		System.out.println("m1 method ");
		
	}

	
	
}