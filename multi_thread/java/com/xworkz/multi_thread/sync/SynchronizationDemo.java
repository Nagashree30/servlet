package com.xworkz.multi_thread.sync;

public class SynchronizationDemo {

	public static void main(String[] args) {
		Display display=new Display();
//		 MyThread  myThread1=new MyThread(display, "sahana");
//		 MyThread  myThread2=new MyThread(display, "Vidya");
//		 MyThread  myThread3=new MyThread(display, "Kavya");
		 
		
		 MyThread  myThread1=new MyThread(display, "sahana",22,789654123);
		 MyThread  myThread2=new MyThread(display, "Vidya",19,986325147);
		 myThread1.start();
		 myThread2.start();
		// myThread3.start();
	}
}
