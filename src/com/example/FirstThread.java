package com.example;

public class FirstThread extends Thread{

	ResourceSummation rsum;
	
	public FirstThread(ResourceSummation rsum) {
		this.rsum = rsum;
	}
	
	@Override
	public void run() {
		rsum.summation(10);
	}
}
