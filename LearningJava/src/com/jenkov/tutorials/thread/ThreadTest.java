package com.jenkov.tutorials.thread;

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunnableDemo R1=new RunnableDemo("Thread-1");
		R1.start();
		
		
		RunnableDemo R2=new RunnableDemo("Thread-2");
		R2.start();

	}

}
