package com.javaproject.operator;

import java.util.Scanner;

public class WhileProgram {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter input>");
		String s="";
		while(!s.equals("quit")) {
			System.out.println("input:");
			s=sc.next();
			System.out.println(s);
		}
	}
		
	}

