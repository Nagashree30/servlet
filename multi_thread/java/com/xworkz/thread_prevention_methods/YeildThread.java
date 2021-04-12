package com.xworkz.thread_prevention_methods;

public class YeildThread extends Thread{

	public void run() {
		
		Thread.currentThread().yield();
		for (int i = 1; i < 5; i++) {
			System.out.println("Printing by YeildThread: "+i);
		}	
	}
}
