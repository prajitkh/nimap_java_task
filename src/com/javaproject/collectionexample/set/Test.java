package com.javaproject.collectionexample.set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Test {
	public static void main(String[] args) {
		
		LinkedHashSet<Double> hs=new LinkedHashSet<>();
		hs.add(15.33);	
		hs.add(99.33);
		hs.add(193.2);
		hs.add(11.33);
		hs.add(12.33);  
		hs.add(14.33);
		hs.add(11.33);

		
		
		System.out.println(hs);
	}

}
