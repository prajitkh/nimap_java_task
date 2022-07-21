package com.javaproject.collectionexample;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    private transient HashMap map;
	
	void m1() {
		ArrayList<Student> s=new ArrayList<>();
		s.add(new Student(11,"prajit","wardha"));
		s.add(new Student(12,"rit","nag"));
        s.add(new Student (33, "prajits","s"));
		
		System.out.println("*****************");
		System.out.println(s);
		}
	

	public static void main(String[] args) {
		Main mm=new Main();
		mm.m1();
	}

}
