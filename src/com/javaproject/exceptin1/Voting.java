package com.javaproject.exceptin1;

import java.util.Scanner;

public class Voting {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter AGE ");
		int age=sc.nextInt();

		if(age<18) {
			throw new  YoungerAgerAgeException("you are not eligible to voting ");
		}
		else {
			System.out.println("your are eligible vote success");
		}
	}
}
