package com.javaproject.exceptin1;

public class Test {
	public static void main(String[] args) {
		
		System.out.println(10);
		try {
			int a=100; int b=0,c;
			
			c=a/b;
			
			System.out.println(c);
					
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		
		}
	}

}
