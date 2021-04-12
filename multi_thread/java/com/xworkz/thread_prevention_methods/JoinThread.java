package com.xworkz.thread_prevention_methods;

public class JoinThread extends Thread{
	static Thread mt;
	public void run() {
		try {
			mt.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	for (int i = 1; i < 5; i++) {
		System.out.println("Printing by joinThread: "+i);
	}	
	}

}
