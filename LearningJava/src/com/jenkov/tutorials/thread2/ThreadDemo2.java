package com.jenkov.tutorials.thread2;

public class ThreadDemo2 extends Thread {
	private String threadname;
	private DummyRunnable r;

	
	ThreadDemo2(String tname) {
		threadname = tname;
		System.out.println("Creating " + threadname);
	}

	public ThreadDemo2(String tname, DummyRunnable dummyRunnable) {
		super(dummyRunnable, tname);
		threadname = tname;
		this.r = dummyRunnable;
		System.out.println("in construtor");
	}

	public void run2() {
		System.out.println("Running " + threadname);
		try {
			for (int i = 4; i > 0; i--) {
				System.out.println("thread " + threadname + " " + i);
				Thread.sleep(50);
			}
		} catch (InterruptedException e) {
			System.out.println("thread " + threadname + " interrupted");
		}
		System.out.println("thread " + threadname + " Exiting");

	}

}
