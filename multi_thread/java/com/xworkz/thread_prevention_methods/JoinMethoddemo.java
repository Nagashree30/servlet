package com.xworkz.thread_prevention_methods;

public class JoinMethoddemo {

	public static void main(String[] args) {
		JoinThread.mt=Thread.currentThread();
		JoinThread joinThread=new JoinThread();
		joinThread.start();
		try {
			joinThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 1; i < 5; i++) {
			System.out.println("Printing By main thread :"+i);
		}
	}
}
