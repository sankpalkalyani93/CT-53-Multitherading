package com.example;

public class ResourceSummation {

	public synchronized void summation(int n) {
		int sum = 0;
		
		for(int i = 1; i <= n; i=i+1) {
			sum = sum + i;
			System.out.println(Thread.currentThread().getName() + " => " + " i : " + i + ", sum : " + sum); 
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
