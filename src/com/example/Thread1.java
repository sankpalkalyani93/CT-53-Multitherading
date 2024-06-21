package com.example;

public class Thread1 extends Thread{

	ResourcePrintTable rtable;
	
	public Thread1(ResourcePrintTable rtable) {
		this.rtable = rtable;
	}
	
	@Override
	public void run() {
		try {
			rtable.printTable(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
