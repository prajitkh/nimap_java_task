package com.javaproject.multitherading3;

public class BookTheaterSeat {

	int totalSeat =10;

	
 void bookSeat(int seats) {
System.out.println("HI   "+ Thread.currentThread().getName());
System.out.println("HI  "+ Thread.currentThread().getName());
System.out.println("HI  "+ Thread.currentThread().getName());
System.out.println("HI  "+ Thread.currentThread().getName());
synchronized(this) {
if(totalSeat>=seats) {
			System.out.println(seats+" seats booked succesfully ");
			totalSeat=totalSeat-seats;
			System.out.println("seats left>> "+totalSeat);
		}else {
			System.out.println("Sorry seats not booked...!!!");
			System.out.println("seats left>> "+ totalSeat);

		
	 }
}
System.out.println("HI   "+ Thread.currentThread().getName());
System.out.println("HI  "+ Thread.currentThread().getName());
System.out.println("HI  "+ Thread.currentThread().getName());
System.out.println("HI  "+ Thread.currentThread().getName());
}
	}




