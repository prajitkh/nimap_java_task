package com.javaproject.strings;

import java.util.Scanner;

import javax.naming.InvalidNameException;

public class StringN {
	public static void main(String[] args) throws InvalidNameException {



		Name aa = new Name();
		Scanner console = new Scanner(System.in);





		System.out.print("Enter your name: ");
		String in = console.nextLine();
		aa.printName(in);
		
		System.out.println("******");
		

		String []s=in.split(" ");
				if(in.equals(s))
					System.out.println("valid");
				else
					System.out.println("invalid");

	}









}
