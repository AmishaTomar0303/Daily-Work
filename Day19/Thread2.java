package com.cognizant.thread;

public class Thread2 implements Runnable {
	Resource resource;
	public Thread2(Resource resource) {
		this.resource= resource;
	}
	@Override
	public void run() {
		resource.display("thread-2");
	}
	/*
	@Override
	public void run() {
		for (int i = 1; i < 5; i++) {
			if (i % 2 == 0) {
				System.out.println("thread-2:" + i);
			}
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}  */
}
