package com.jenkov.tutorials.thread2;

public class ThreadDemo2Main {

	public static void main(String[] args) {
//		ThreadDemo2 T1 = new ThreadDemo2("Thread-1", new DummyRunnable());
//		T1.start();
		
		new ThreadDemo2("Thread-1", new DummyRunnable()).start();	
//		Thread t=new Thread(T1);
//		t.start();
		
		
		// ThreadDemo2 T2 = new ThreadDemo2("Thread-2");
		// T2.start();
	}

}
