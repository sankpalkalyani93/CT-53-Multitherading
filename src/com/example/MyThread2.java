package com.example;

public class MyThread2 implements Runnable{

	@Override
	public void run() {
		
		for(int i = 10; i <= 15; i=i+1) {
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
