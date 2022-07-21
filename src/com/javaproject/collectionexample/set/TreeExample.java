package com.javaproject.collectionexample.set;

import java.util.TreeSet;

public class TreeExample {

	public static void main(String[] args) {
		TreeSet<Object>ss=new TreeSet<>();
		ss.add(2);
		ss.add(23);
		ss.add(21);
		ss.add(32);
		ss.add(12);
		ss.add(82);  
		ss.add(12);
		ss.add(2);
	  
		for (Object integer : ss) {
			System.out.println(integer);
		}
		
	}
}
