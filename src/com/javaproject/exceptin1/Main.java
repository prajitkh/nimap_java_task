package com.javaproject.exceptin1;

public class Main {
public static void main(String[] args) {


	System.out.println(10);
	System.out.println(20);
	try {
		int a=100; int b=0,c;
		
		c=a/b;
		
		System.out.println(c);
				
	}
	catch(Exception e) {
	System.out.println(e.getMessage());
	
	}finally {
		System.out.println("im in finally block ");
	}
}


}
