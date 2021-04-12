package com.xworkz.thread_prevention_methods;

public class InterruptThread extends Thread {

	public void run() {
		for (int i = 1; i < 5; i++) {
			System.out.println("Printing by interrupt: "+i);
		}	
	}
}
