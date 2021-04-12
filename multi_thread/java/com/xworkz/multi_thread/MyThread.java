package com.xworkz.multi_thread;

public class MyThread extends Thread {

	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Printing by child thread: " + i);
		}
	}
	
	@Override
	public synchronized void start() {
		super.start();
		System.out.println("Overrided start method");
	}

	
		public void run(int count) {
			
			for (int i = 1; i <= 5; i++) {
				System.out.println("Printing by overloaded run method: " + i);
			}
		}
	}

