package com.javaproject.collectionexample.map;

import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {
		
		TreeMap<Integer, String>tree=new TreeMap<>();
		tree.put(1,"nagpur");
		tree.put(6,"Wardha");
		tree.put(3,"pune");
		tree.put(2,"Mumbai");
		tree.put(2,"Mumbai");
		tree.put(4,"Akola");
		
	System.out.println(tree);
	
		for (Integer string : tree.keySet()) {
			System.out.println(string + " "+ tree.get(string));
			
		}
	}

}
