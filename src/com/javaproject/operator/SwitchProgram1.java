package com.javaproject.operator;

import java.util.Scanner;

public class SwitchProgram1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("enter day here>>");
	
	switch(sc.nextLine()) {
	case  "Sunday":
		System.out.println("weekday wwwwwwww");
		break;
		
	case "monday":
		System.out.println("working day");
	break;
	case "tuesday":
		System.out.println("working day2");
	break;
	default:
		System.out.println("day!!!!!!!");
	}
	}

}
