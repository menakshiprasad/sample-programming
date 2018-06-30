package com.jenkov.tutorials.threadEvenOdd;

public class MyThread1 implements Runnable {
	Thread t;
	EvenOdd tOb;

	MyThread1(String name, EvenOdd t1) {
		t = new Thread(this, name);
		tOb = t1;
	}

	public static MyThread1 CreateAndStart(String name, EvenOdd tob) {
		MyThread1 mthd = new MyThread1(name, tob);
		mthd.t.start();
		return mthd;
	}

	public void run() {
		if (t.getName().compareTo("Oddno") == 0) {
			tOb.odd(true, t);
			tOb.odd(false, t);
		} else {
			tOb.even(true, t);
			tOb.even(false, t);
		}
	}
}
