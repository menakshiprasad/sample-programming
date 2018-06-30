package com.jenkov.tutorials.lock;

public class MyThreadMain {

	public static void main(String[] args) {

		Counter c = new Counter();

		Runnable r1 = new MyThread(c);
		Runnable r2 = new MyThread(c);

		Thread t1 = new Thread(r1, "th1");
		Thread t2 = new Thread(r2, "th2");

		t1.start();
		t2.start();

	}

}
