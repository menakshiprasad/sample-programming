package com.jenkov.tutorials.thread;

public class ThreadDemo extends Thread {
	private Thread t;
	private String threadname;

	ThreadDemo(String tname) {
		threadname = tname;
		System.out.println("Creating" + threadname);
	}

	public void run() {
		System.out.println("Running" + threadname);
		try {
			for (int i = 4; i > 0; i--) {
				System.out.println("thread" + threadname + " " + i);
				Thread.sleep(50);
			}
		} catch (InterruptedException e) {
			System.out.println("thread" + threadname + "interrupted");
		}
		System.out.println("thread" + threadname + "Exiting");

	}

	public void start() {
		System.out.println("Starting" + threadname);
		if (t == null) {
			t = new Thread(this, threadname);
			t.start();

		}
	}

}
