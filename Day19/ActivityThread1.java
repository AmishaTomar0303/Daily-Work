package com.cognizant.thread;

public class ActivityThread1 implements Runnable{
	
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			 {
				 int j=4;
				 j= j*i;
				System.out.println("thread-1:" + j);
			}
			

		}
	}  

}
