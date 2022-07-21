package com.javaproject.string;

import java.util.Scanner;

public class Count {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	//String s="hello world";
String []a=s.trim().split(" ");
System.out.println(a.length);

}
}
