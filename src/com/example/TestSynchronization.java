package com.example;

public class TestSynchronization {

	public static void main(String [] args) {
		
		ResourceSummation r = new ResourceSummation();
		FirstThread f = new FirstThread(r);
		f.setName("FirstThread");
		SecondThread s = new SecondThread(r);
		Thread ts = new Thread(s);
		ts.setName("SEcondThread");
		
		f.start();
		ts.start();
		
	}
}
