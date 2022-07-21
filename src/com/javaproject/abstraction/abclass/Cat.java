package com.javaproject.abstraction.abclass;

public class Cat extends Dog{


	
	
	public Cat(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void speak() {
		
		System.out.println(this.name + "said mawww !!");
}
}
