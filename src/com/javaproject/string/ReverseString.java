package com.javaproject.string;

public class ReverseString {
	public static void main(String[] args) {
		
		//without using string inbuilt function
		String s="Nimap";
		StringBuilder st=new StringBuilder();
		st.append(s);
		st=st.reverse();
		System.out.println(st);
	}

}
