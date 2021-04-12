package com.xworkz.multi_thread;

public class RunnableDemo {

	public static void main(String[] args) {
		Thread.currentThread().setName("Xworkz");
		MyRunnable myRunnable = new MyRunnable();
		// Thread thread = new Thread();
		Thread thread1 = new Thread(myRunnable);
//		thread.start();
//		thread.run();
		thread1.start();
//		thread1.run();
//		myRunnable.run();

		for (int i = 0; i < 5; i++) {
			System.out.println("Executing by " + Thread.currentThread().getName() + " thread :" + i);
		}
	}
}
