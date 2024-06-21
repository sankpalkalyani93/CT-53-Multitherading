package com.example;

public class TestSynchronizationByBlock {

	public static void main(String [] args) {
		
		ResourcePrintTable rtable = new ResourcePrintTable();
		Thread1 t1 = new Thread1(rtable);
		t1.setName("Thread1");
		t1.start();
		
		Thread2 t2 = new Thread2(rtable);
		Thread t = new Thread(t2);
		t.setName("Thread2");
		t.start();
	}
}
