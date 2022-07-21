package com.javaproject.strings;

public class EqualsMethod {
public static void main(String[] args) {
	String s1="prajit khawshi";  ///112-97=15
	String s2="ajit ksheei";
	
	System.out.println(s1.equalsIgnoreCase(s2));
	System.out.println(s1.equals(" "));
	System.out.println(s1.compareToIgnoreCase(s2));
	}
}