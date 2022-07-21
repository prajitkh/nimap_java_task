package com.javaproject.collectionexample.list;

import java.util.LinkedList;

public class LL {
	public static void main(String[] args) {
		
		LinkedList<String> list=new LinkedList<>();
		list.addFirst("a");
		list.addFirst("is");
		System.out.println(list);
		
		list.addFirst("this");
		list.add("list");
		System.out.println(list); //write add -add in last //add first then add in first 
		
		System.out.println(list.removeFirst());
		System.out.println(list.remove(2)); //remove as our req index number
		System.out.println(list);
		
	}

}
