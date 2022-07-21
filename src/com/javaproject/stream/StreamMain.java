package com.javaproject.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {
	public static void main(String[] args) {
		
		
		//1>create a list and filter all even number from  list 
		
		List<Integer> list=List.of(1,3,5,6,7,2);
	
	List<Integer>list2=new ArrayList<>();
	list2.add(12);
	list2.add(72);
	list2.add(752);
	list2.add(12);
	list2.add(22);
	list2.add(68);
	list2.add(27);

	
	
		Stream<Integer> stream=list2.stream();
		List<Integer>in=stream.filter(i -> i%2==0 ).collect(Collectors.toList());
	System.out.println(in);
System.out.println("****************************");
	
	
List<Integer>	f=list2.stream().filter(i->i%2==0).collect(Collectors.toList());
	System.out.println(f);
	
	System.out.println("----------------------------------");
     
	
	 List<Integer> l=list2.stream().filter(i-> i>30).collect(Collectors.toList());
	System.out.println(l);
	
	
		}
	
	}


