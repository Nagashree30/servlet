package com.xworkz.multi_thread.sync;

public class Display {

	synchronized void display(String name) {
		System.out.println("Good morning " + name);
	}

	void displayStudentData(String name, int age, long phnNo) {
		System.out.println("Entered Synchronized block");
		synchronized (this) {
			System.out.println("name :" + name);
			System.out.println("age :" + age);
			System.out.println("phnNo :" + phnNo);

		}
		System.out.println("ended Synchronized block");
	}
}
