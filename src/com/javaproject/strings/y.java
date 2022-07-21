package com.javaproject.strings;

import java.util.Scanner;

public class y {
public static void main(String[] args) {
	String a="prajit shriram khawshi";
	//String b="khawshi";
	//String c=a+b;
	
	String ss[]=a.split(" ");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Name >>>");
	String name=sc.nextLine();
	if(a.equalsIgnoreCase(name)) {
		String fName=ss[0];
		String mName=ss[1];
		String lName=ss[2];
		
		System.out.println("first Name >>"+fName);
		System.out.println("first Name >>"+mName);
		System.out.println("last Name >>"+lName);
		System.out.println("valid ");
		
		//System.out.println(name);
		
	}else {

		System.out.println("invalid input");
		
	}
	
	
	
	
//	if(name.equalsIgnoreCase(a)) {
//		System.out.println(name);
//		
//	}else {
//		
//		System.out.println("invalid ");
//	}
	
}
	    }
	

