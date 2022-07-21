package com.javaproject.exceptin1;

public class Example1 {
public static void main(String[] args) {
	
	
	try {
		System.out.println(10/0);
		
	}catch(ArithmeticException e) {
		System.out.println("ok");
		
	}catch(Exception e) {
		System.out.println("ss");
}
}
}