package com.xworkz.thread_prevention_methods;

public class InterruptMethodDemo {

	public static void main(String[] args) {
		InterruptThread interruptThread=new InterruptThread();
		interruptThread.start();
		interruptThread.interrupt();
		
		for (int i = 1; i < 5; i++) {
			System.out.println("main method :"+i);
		}
	}
}
