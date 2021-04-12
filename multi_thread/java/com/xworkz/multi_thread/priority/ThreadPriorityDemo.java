package com.xworkz.multi_thread.priority;

public class ThreadPriorityDemo {

	public static void main(String[] args) {
		
		Thread.currentThread().setPriority(1);
		//Thread.currentThread().setPriority(11);    IllegalArgumentException

		ChildThread childThread = new ChildThread();
		childThread.start();
		childThread.setPriority(10);

		int priority = Thread.currentThread().getPriority();
		System.out.println("Priority of main thread is:" + priority);
		for (int i = 0; i < 5; i++) {
			System.out.println("main thread :" + i);
		}
	}
}
