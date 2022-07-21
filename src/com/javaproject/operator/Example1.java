package com.javaproject.operator;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number>>");
		int number=sc.nextInt();

		if(number %5==0) 
			System.out.println("BOOK");
		else if(number %3==0) 
			System.out.println("PEN");
		else if(number % 2==0)
			System.out.println("RED");
		else if(number %4==0) 
				System.out.println("PEN1");
			else if(number % 6==0)
				System.out.println("RED2");
			
	}

}



