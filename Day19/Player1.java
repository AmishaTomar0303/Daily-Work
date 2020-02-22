package com.cognizant.thread;

public class Player1 implements Runnable {

	@Override
	public void run() {
		System.out.println("Player1 is ready");
		for (int i = 1; i <= 10; i++) 
			{

				System.out.println("Ping");
				try {
					Thread.sleep(102);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			

		}
	}

