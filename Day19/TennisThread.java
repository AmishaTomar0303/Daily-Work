package com.cognizant.thread;

public class TennisThread {
	public static void main(String[] args) {
		Player1 p1= new Player1();
		Player2 p2= new Player2();
		Thread t1= new Thread(p1);
		Thread t2= new Thread(p2);
		t1.start();
		
		t2.start();
		
	}

}
