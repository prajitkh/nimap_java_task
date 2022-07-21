package com.javaproject.stream1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ReduceExample {
	public static void main(String[] args) {

		List<Integer>list=Arrays.asList(12,5,6,7,7,89,1,11,22);


		List<String>string=List.of("ram","shyam","ssr");
		int sum=0;
		for(int i: list) {
			sum=sum+i;

		}
		System.out.println(sum);
		System.out.println("______________________");

		int	tt=list.stream().mapToInt(i -> i).sum();

		System.out.println(tt);

		//use reduce method

		Integer i=list.stream().reduce(0,(a, b) -> a + b );
		System.out.println("output is "+i);

		System.out.println("______________________");
		//reduce method
		Optional<String> longstring=string.stream().reduce((w1,w2) -> w1.length() >w2.length() ? w1 : w2);
		longstring.ifPresent(System.out::  println);

		System.out.println("---------------------");
//reduce method
 Integer multi=list.stream().reduce(1,(a,b) -> a*b);
 System.out.println(multi);
 
 
 
 


	}

}
