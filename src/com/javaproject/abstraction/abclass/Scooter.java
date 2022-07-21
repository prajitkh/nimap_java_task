package com.javaproject.abstraction.abclass;

public class Scooter extends Vehicle{

	@Override
	void start() {
		System.out.println("Scooter Start with key");	
	}
	
	public static void main(String[] args) {
		
		Car car=new Car();
		car.start();
		
		
		Scooter c=new Scooter();
		c.start();
	}
	
	}


