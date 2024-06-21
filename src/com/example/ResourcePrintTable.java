package com.example;

public class ResourcePrintTable {

	public void printTable(int num) throws InterruptedException {
		
		synchronized(this) {
			int result = 1;
			for(int i = 1; i <= 10; i=i+1) {
				result = num * i;
				System.out.println(Thread.currentThread().getName() + " : " + num + " * " + i + " = " + result);
			
				Thread.sleep(1000);
			
			}
		}
		System.out.println("Hello all");
	}
}
