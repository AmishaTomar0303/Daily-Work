package com.cognizant.thread;

public class ThreadDemo {
	public static void main(String[] args) {
		// Thread.currentThread().setPriority(Thread.MAX_PRIORITY-2);
		// here we have only 1 thread (main)
		Resource res = new Resource();
		Threadone threadone = new Threadone(res);// new born state
		Thread2 thread2 = new Thread2(res);
		Thread t2 = new Thread(thread2);
		Thread t1 = new Thread(threadone);
		// t1.setPriority(Thread.MAX_PRIORITY);
		// t2.setPriority(Thread.NORM_PRIORITY+2);
		t1.start();// Ready state
		// Thread2 thread2= new Thread2();
		t2.start();
		/*
		 * for(int i=1; i<5; i++) {
		 * System.out.println(Thread.currentThread().getName()+":"+i); }
		 */
		// System.out.println("main thread priority:"+
		// Thread.currentThread().getPriority());
		// System.out.println("thread-1 priority"+ t1.getPriority());
		// System.out.println("thread-2 Priority"+ t2.getPriority());

	}
}
