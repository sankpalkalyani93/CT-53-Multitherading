package com.example;

public class MyThread1 extends Thread{

	@Override
	public void run() {
		
		for(int i = 1; i <= 5; i=i+1) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
