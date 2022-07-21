package com.javaproject.stream;

import java.util.List;
import java.util.stream.Collectors;

public class Methods {
	public static void main(String[] args) {

		List<String>city=List.of("arvi","ngapur","wardha","amravati","indore","delhi");

		List<String>nm=city.stream().filter(e ->e.startsWith("a")).collect(Collectors.toList());
		System.out.println(nm);
		
		System.out.println("-------------------------------");
		
		
		
		List<Integer>integer=List.of(1,6,5,4,3,9);
		
		List ii=integer.stream().map(i-> i*i).collect(Collectors.toList());
		System.out.println(ii);
		
		integer.stream().forEach(e-> System.out.println(e));
	
		//For each---help to traves array
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		
	      //sorted
		
		integer.stream().sorted().forEach(System.out ::println);
		
	}
}
