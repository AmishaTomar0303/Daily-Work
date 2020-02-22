package com.cognizant.thread;

public class AcivityThreadMain {
	public static void main(String[] args) throws InterruptedException {
	 
		ActivityThread1 act1= new ActivityThread1();
		ActivityThread2 act2= new ActivityThread2();
		Thread table1= new Thread(act1);
		Thread table2= new Thread(act2);
		table1.start();
		table2.start();
		table1.join();
		table2.join();
	}

}
