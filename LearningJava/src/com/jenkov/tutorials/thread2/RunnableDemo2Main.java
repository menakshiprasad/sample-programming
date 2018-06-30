package com.jenkov.tutorials.thread2;

public class RunnableDemo2Main {

	public static void main(String[] args) {
		RunnableDemo2 r1 = new RunnableDemo2("Thread-1");

		Thread t = new Thread(r1);
		
		t.setPriority(6);
		t.setName("Manoj");
		
		
		t.start();

		System.out.println(t.getName());
		System.out.println(t.getPriority());
		
		//		RunnableDemo2 r2 = new RunnableDemo2("Thread-2");
//
//		Thread t2 = new Thread(r2);
//
//		t2.start();

	}

}
