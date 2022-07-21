package com.javaproject.collectionexample.set;

public class Book  implements Comparable<Book>{

	int id;
	String name;
	String authour;
	
	
	public Book(int id, String name, String authour) {
		super();
		this.id = id;
		this.name = name;
		this.authour = authour;
	}


	@Override
	public int compareTo(Book o) {
		if(id>o.id) {
			
		
		return 1;
		}else if(id<o.id){
			return -1;
			
		}else {
			return 0;
		}
		
	}
}
	
  
