package com.jenkov.tutorials.thread2;

public class RunnableDemo2 implements Runnable {

	private String threadname;

	RunnableDemo2(String tname) {
		threadname = tname;
		System.out.println("Creating" + threadname);
	}

	public void run() {
		System.out.println("Running" + threadname);
		try {
			for (int i = 4; i > 0; i--) {
				System.out.println("thread" + threadname + " " + i);
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
			System.out.println("thread" + threadname + "interrupted");
		}
		System.out.println("thread" + threadname + "Exiting");

	}

}
