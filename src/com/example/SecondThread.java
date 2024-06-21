package com.example;

public class SecondThread implements Runnable{

	ResourceSummation rsum;
	
	public SecondThread(ResourceSummation rsum) {
		this.rsum = rsum;
		
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		rsum.summation(5);
	}
}
