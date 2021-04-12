package com.xworkz.multi_thread;

public class MultiThreadDemo {

	public static void main(String[] args) {
		
		MyThread myThread=new MyThread();
		myThread.start();
        //myThread.start();   it gives illegal exception
		myThread.run(5);
		//myThread.run();
		
		for(int i=1;i<=5;i++) {
			System.out.println("Printing by main thread : "+i);
		}
	}
}
