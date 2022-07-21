package com.javaproject.collectionexample.set;
import java.util.HashSet;
public class HashTest {
	// Java program to demonstrate
	// internal working of HashSet

public static void main(String args[])
	{
		// creating a HashSet
		HashSet hs = new HashSet();

		// adding elements to hashset
		// using add() method
		boolean b1 = hs.add("prajit");
		boolean b2 = hs.add("suraj");

		// adding duplicate element
		boolean b3 = hs.add("prajit");

		// printing b1, b2, b3
		System.out.println("b1 = "+b1);
		System.out.println("b2 = "+b2);
		System.out.println("b3 = "+b3);

		// printing all elements of hashset
		System.out.println(hs);

	}
}



