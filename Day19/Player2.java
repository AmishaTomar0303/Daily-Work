package com.cognizant.thread;

public class Player2 implements Runnable {

	@Override
	public void run() {
		System.out.println("player2 is ready");
		for (int i = 1; i <= 10; i++) {
			{

				System.out.println("Pong");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			

		}
	}
}


