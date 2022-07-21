package com.javaproject.strings;

public class Main {
public static void main(String[] args) {
	String name="prajit      ";
	String a=name.trim();
	System.out.println(a);
	//System.out.println(name.length());
int e=a.length();
if(e==0 ) 
{
System.out.println("empty !!!!");	
}
else {
	System.out.println("Done");
}
System.out.println(name.isEmpty());
}
}
