package com.javaproject.stream1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
	public static void main(String[] args) {
		List<Employee>ee=new ArrayList<>();
		ee.add(new Employee(11, "rahul","Pune"));
		ee.add(new Employee(33, "SS","P"));
		ee.add(new Employee(12, "Sujit","Shri"));
		ee.add(new Employee(92, "Amit","Vani"));

		//for each
		ee.stream().map(e->e.empCity).forEach(System.out::println);
		System.out.println("________________________________");

		//getting unique element 
		List<Employee> emp=ee.stream().filter(name -> "rahul".equalsIgnoreCase(name.getEmpName())).collect(Collectors.toList());
		System.out.println(emp);


		System.out.println("________________________________");

		ee.stream().forEach(System.out::println);

		System.out.println("________________________________");
		//peek method ..without terminal  
ee.stream().filter(t -> t.empId >15).peek(t ->  System.out.println
		("id is :"+t)).collect(Collectors.toList());



	}
}
