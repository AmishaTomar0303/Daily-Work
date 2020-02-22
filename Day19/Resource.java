package com.cognizant.thread;

public class Resource {
public  void display(String name) {
	synchronized(this) {
	for(int i=0; i<=5;i++) {
		System.out.println("name Count :"+ i+""+ name);
	} try {
		Thread.sleep(2000);
	}catch(InterruptedException e) {
		e.printStackTrace();
	}
	
}
}
}