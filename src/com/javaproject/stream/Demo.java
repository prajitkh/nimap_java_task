package com.javaproject.stream;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;


public class Demo {
	public static void main(String[] args) {


		List<String>ee=new ArrayList<>();

		ee.add("MAP");
		ee.add("THREAD");
		ee.add("FRAMEWORK");
		ee.add("WORK");

		List<String> name=ee.stream().filter(e -> e.startsWith("F")).collect(Collectors.toList());
		System.out.println(name);
		System.out.println("________________________________");

	}

}
