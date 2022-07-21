package com.javaproject.multitherading4;

public class TotalEarning extends Thread {
	int total=0;

	public void run() {
		synchronized(this)
		{
			for(int i=1;i<=10;i++) {
				total=total+75;   //100 rup tickit

			}
			this.notify();

		}


	}
}
