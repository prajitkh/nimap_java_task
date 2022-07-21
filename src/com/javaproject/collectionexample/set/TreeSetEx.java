package com.javaproject.collectionexample.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {
	public static void main(String[] args) {

		Set<Book> set=new TreeSet<>();
		Book bb=new Book(19,"AB", "sds");
		Book bb1=new Book(12,"CD", "sss");
		Book bb2=new Book(13,"EF", "eee");

		set.add(bb);
		set.add(bb1);
		set.add(bb2);

		for (Book book : set) {
			System.out.println("book id>>"+book.id+"Name>>"+book.name+" author>>"+book.authour);
		}

	}
}