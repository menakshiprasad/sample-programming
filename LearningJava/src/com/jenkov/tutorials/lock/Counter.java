package com.jenkov.tutorials.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {
	int count = 0;
	Lock lock = new ReentrantLock();

	public int inc() {
		
		System.out.println("Hello world.");
		
		
		lock.lock();
		int newCount = ++count;

		System.out.println("Holding lock for 2 sec.");
		sleep(2000);
		
		lock.unlock();
		return newCount;
	}
	
	
	

	private void sleep(int i) {
		try {
			
			Thread.sleep(i);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}