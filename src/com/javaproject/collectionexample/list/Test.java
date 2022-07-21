package com.javaproject.collectionexample.list;

import java.util.Vector;

public class Test {
	public static void main(String[] args) {
		
		Vector<String> ee=new Vector<>();
		ee.add("prajit");
		ee.add("sanket");
		ee.add("suraj");
		ee.add("roshan");
		System.out.println(ee);
	for (String string : ee) {
		System.out.println(string);
	}
	}

}
