package com.javaproject.collectionexample.list;

import java.util.Iterator;
import java.util.TreeSet;

public class Tree {
public static void main(String[] args) {
	TreeSet<Integer> tree=new TreeSet<>();
	tree.add(12);
	tree.add(32);
	tree.add(1);
	tree.add(42);
	tree.add(3);
	tree.add(662);
	 tree.iterator();
	Iterator itr=tree.iterator();
	while(itr.hasNext()) {
	System.out.println(itr.next()+ "\t length "+ tree.size());
	
		
	}

	
}
}
