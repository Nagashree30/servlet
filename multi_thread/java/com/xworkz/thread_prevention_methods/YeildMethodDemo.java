package com.xworkz.thread_prevention_methods;

public class YeildMethodDemo {

	public static void main(String[] args) {
		
		YeildThread thread=new YeildThread();
		thread.start();
		
		for (int i = 1; i < 5; i++) {
			System.out.println("Printing by main Thread: "+i);
		}
	}
}
