package com.javaproject.string;

public class StringBuffer1 {
	public static void main(String[] args) {
		
	
StringBuffer s=new StringBuffer("Hello");
System.out.println(s.append(""));
//s.reverse();
//System.out.println(s);
s.insert(3, "java");
System.out.println(s);
}
}
