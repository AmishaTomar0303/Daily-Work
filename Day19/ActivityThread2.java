package com.cognizant.thread;

public class ActivityThread2 implements Runnable {
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			 {
				 int j=2;
				 j= j*i;
				System.out.println("thread-2:" + j);
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}  
	
}
