package com.xworkz.thread_prevention_methods;

public class SleepMethodDemo {
	public static void main(String[] args) {
		for (int i = 1; i < 5; i++) {
			try {
				Thread.sleep(1000);   // static method of thread class
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("main thread :"+i);
	}

}
}
