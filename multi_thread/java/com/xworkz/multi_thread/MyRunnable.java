package com.xworkz.multi_thread;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		Thread.currentThread().setName("Lakshmi");
		for (int i = 0; i < 5; i++) {
			System.out.println("Executing by "+Thread.currentThread().getName()+" thread :" + i);
		}
	}

}
