package com.javaproject.strings;

import java.util.Scanner;

import javax.naming.InvalidNameException;

public class StringA {
	public static void main(String[] args) {

	      Name aa = new Name();
	      Scanner console = new Scanner(System.in);
	      

	            System.out.print("Enter your name: ");
	            String in = console.nextLine();
	            try {
					aa.printName(in);
				} catch (InvalidNameException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        if(aa.equals(in))
	         System.out.println("valid input");
	      else 
	    	  System.out.println(aa);
	    	 
	   

	}
	
	 
}
