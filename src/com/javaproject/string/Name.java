package com.javaproject.string;

import javax.naming.InvalidNameException;

public class Name {
	  public void printName(String name) throws InvalidNameException{

	       String [] nameSplit = name.split(" ");
	       String first = nameSplit[0];
	       String last = nameSplit[1];

	       System.out.println("First name: "+first);
	       System.out.println("Last name: "+last);
}
}
