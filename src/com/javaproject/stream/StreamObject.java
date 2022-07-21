package com.javaproject.stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamObject {
	public static void main(String[] args) {
		
		//stream  api --collection process
		//collection /group of object 
		
		//1-blank
		 Stream<Object> ss=Stream.empty();
		 
		 
		 //2-array,object,collection
		 String name[] = {"java, Python , Spring boot"};
		Stream<String>list=Stream.of(name);
		list.forEach(e-> System.out.println(e));
		System.out.println("------------------------------");
		//3-builder
		Stream<Object>list2=Stream.builder().build();
		
	
		
	}

}

