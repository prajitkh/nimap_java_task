package com.javaproject.stream2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Driver {
	
	public static void main(String[] args) {

	
		List<Person>person=new ArrayList<>();
		person.add(new Person("Roshan","Amravati"));
		person.add(new Person("Nikhil","Latur"));
		person.add(new Person("Nakul","Nashik"));
		person.add(new Person("Sanket","Amravati"));
		person.add(new Person("Suraj","Pune"));


		Map<Boolean, List<Person>>list= person.stream().collect(Collectors.partitioningBy( p -> p.getCity().equals("Amravati")  ));
		System.out.println(list);

		Map<Object, List<Person>> pp= person.stream().collect(Collectors.groupingBy(p -> p.getCity().equals("Amravati")));
		System.out.println(pp);

		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");

		Map<Object, Long> count= person.stream().collect(Collectors.groupingBy(p -> p.getCity().equals("Amravati"),Collectors.counting()));
		System.out.println(count);

		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");

		Map<Object, Long> collect= person.stream().collect(Collectors.groupingBy(p -> p.getCity(),Collectors.counting()));
		System.out.println(collect);

		
	}

}
