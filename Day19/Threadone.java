package com.cognizant.thread;

public class Threadone implements Runnable {
	Resource resource;
	public Threadone(Resource resource) {
		this.resource= resource;
	}
	@Override
	public void run() {
		resource.display("thread-1");
	}
	
	/*	
	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			if (i % 2 != 0) {
				System.out.println("thread-1:" + i);
			}
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	} */
}
