package com.jenkov.tutorials.lock;

public class MyThread implements Runnable {

	Counter c;

	MyThread(Counter c) {
		this.c = c;

	}

	public void run() {
		int i = c.inc();
		System.out.println("Count is " + i + " by " + Thread.currentThread().getName());

	}

}
