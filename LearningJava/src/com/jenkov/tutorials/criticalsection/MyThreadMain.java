package com.jenkov.tutorials.criticalsection;

public class MyThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Sum s=new Sum();

		MyThread m1=new MyThread(s);
MyThread m2=new MyThread(s);
Thread t1=new Thread(m1, "Thread1");
Thread t2=new Thread(m2, "Thread2");
t1.start();
t2.start();

	}

}
