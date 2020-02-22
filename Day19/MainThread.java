package com.cognizant.thread;

public class MainThread {
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println(t);
		System.out.println(t.getPriority());
		t.setName("amisha");
		System.out.println(t);
		System.out.println(t.getState());
		System.out.println("is dameon"+ t.isDaemon());
		System.out.println("is Alive"+ t.isAlive());
		

	}
}
