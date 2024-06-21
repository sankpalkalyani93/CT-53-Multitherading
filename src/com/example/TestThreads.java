package com.example;

public class TestThreads {

	public static void main(String [] args) {
		
		MyThread1 mt1 = new MyThread1();
		mt1.setName("Thread 1");
		mt1.start(); /// calling the run()
		
		MyThread2 mt2 = new MyThread2();
		Thread t2 = new Thread(mt2);
		t2.setName("Thread 2");
		t2.start();
	}
}

