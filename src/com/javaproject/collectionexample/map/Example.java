package com.javaproject.collectionexample.map;

import java.util.LinkedHashMap;

public class Example {
	public static void main(String[] args) {
		
		LinkedHashMap<Integer, String > map=new LinkedHashMap<>();
		map.put(22, "AA");
		map.put(2, "qq");
		map.put(6, "Ab");
		map.put(32, "eeA");
		map.put(52, "tt");
		map.put(112, "vv");
		map.put(212, "xx");
		map.put(222, "eeet");
		
		System.out.println(map.keySet());
		System.out.println("________________________________");
	for(Integer ii:map.keySet()) {
		System.out.println(ii+ " "+ map.get(ii));
			
		}
	}

}
