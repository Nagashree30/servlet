package com.xworkz.multi_thread.sync;

public class MyThread extends Thread {

	Display display;
	String name;
	int age;
	long phnNo;

	MyThread(Display display, String name) {
		this.display = display;
		this.name = name;
	}

	MyThread(Display display, String name, int age, long phnNo) {
		this.display = display;
		this.name = name;
		this.age = age;
		this.phnNo = phnNo;
	}

	public void run() {
		for (int i = 1; i < 3; i++) {
			//display.display(name);
			display.displayStudentData(name, age, phnNo);
		}
	}
}
