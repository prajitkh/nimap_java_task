package com.javaproject.stream.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {


		List<Employee>emp=new ArrayList<>();
		emp.add(new Employee(1001, 45));
		emp.add(new Employee(1005, 25));
		emp.add(new Employee(1003, 45));
		emp.add(new Employee(1003, 65));
		emp.add(new Employee(1006, 55));
		emp.add(new Employee(1009, 25));
		emp.add(new Employee(1008, 15));


		List<Employee> ee=emp.stream().filter(e -> e.getAge()>26).collect(Collectors.toList());
		System.out.println("\"After applying filter method\"");
		ee.forEach(System.out :: println);	

		System.out.println("========########=======");
		List<Employee> list=emp.stream().limit(5).collect(Collectors.toList());
		System.out.println("\"After applying limit(5) method\"");
		list.forEach(System.out :: println);

		System.out.println("========########=======");
		
		List<Employee> skip=emp.stream().skip(2).collect(Collectors.toList());
		 System.out.println("After applying skip(3) method");
		 skip.forEach(System.out:: println);
		
	}

}
