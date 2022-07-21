package com.javaproject.multitherading3;

public class MovieBookApp extends Thread {

	static BookTheaterSeat bk;
	int seats;

	public void run() {
		bk.bookSeat(seats);
	}
	public static void main(String[] args) {
		bk=new BookTheaterSeat();
		MovieBookApp m=new MovieBookApp();
		m.seats=7;
		m.start();



		MovieBookApp m1=new MovieBookApp();
		m1.seats=6;
		m1.start();

	}
}
