package com.example;

public class Thread2 implements Runnable {

	ResourcePrintTable rtable;
	
	public Thread2(ResourcePrintTable rtable) {
		this.rtable = rtable;
	}
	
	@Override
	public void run() {
		try {
			rtable.printTable(8);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
