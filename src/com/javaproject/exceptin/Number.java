package com.javaproject.exceptin;



public class Number {
	public static void main(String[] args) {
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		try {
			System.out.println(10/0);
			
		}catch(ArithmeticException e) {
			System.out.println("not divisible by zero");
		}
		
		
		System.out.println(6);
		
		
	}

}
