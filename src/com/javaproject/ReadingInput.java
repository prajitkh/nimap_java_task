package com.javaproject;

import java.util.Scanner;

public class ReadingInput {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.print("enter Name :");
	String   n=sc.nextLine().replaceAll("","");
	System.out.println(n);
	
}
}
