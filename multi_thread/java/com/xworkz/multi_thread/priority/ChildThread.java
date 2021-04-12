package com.xworkz.multi_thread.priority;

public class ChildThread extends Thread{

	public void run() {
		int priority=Thread.currentThread().getPriority();
		System.out.println("Priority of child thread is:"+priority);
		for (int i = 0; i < 5; i++) {
			System.out.println("child thread:"+i);
		}
	}
}
