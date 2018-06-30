package com.jenkov.tutorials.latestthread;

public class MyThread implements Runnable {
	TickTock tt;

	MyThread(TickTock obj) {
		this.tt = obj;

	}

	public void run() {
		if (Thread.currentThread().getName().equals("Tick")) {
			for (int i = 0; i < 5; i++) {
				tt.tick(true);
			}
			tt.tick(false);

		} else
			for (int i = 0; i < 5; i++) {
				tt.tock(true);
			}
		tt.tock(false);

	}
}
