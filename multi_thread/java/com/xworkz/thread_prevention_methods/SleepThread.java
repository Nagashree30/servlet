package com.xworkz.thread_prevention_methods;

public class SleepThread extends Thread {
	
	public void run() {
		for (int i = 1; i < 5; i++) {
			System.out.println("Printing by Sleep: "+i);
		}	
	}

}
