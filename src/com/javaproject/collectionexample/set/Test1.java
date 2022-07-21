package com.javaproject.collectionexample.set;

import java.util.HashSet;

public class Test1 {
public static void main(String[] args) {
	
	HashSet<Integer>rr=new HashSet<>();
	rr.add(null);
	rr.add(12);
	rr.add(null);
	rr.add(13);
	rr.add(null);
	rr.add(12);
	System.out.println(rr);
}
}
