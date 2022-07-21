package com.javaproject.strings;

import java.util.Scanner;

public class IfStatement {

public static void main(String[] args) {
	

Scanner sc=new Scanner(System.in);
System.out.print("Enter Marks :");

int m=sc.nextInt();


if(m>40) {
	System.out.println("PASS");

if(m>90) {
	System.out.println("Grade A");

}
else if(m>80 && m<=90) {
	System.out.println("Grade B");

}
else if(m<40) {
	System.out.println("FAILD ");

}

}
}
}

