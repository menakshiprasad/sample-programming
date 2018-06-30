package com.jenkov.tutorials.latestthread;

public class TickTockMain {

	public static void main(String[] args) {
		TickTock tt=new TickTock();
		
		MyThread m1=new MyThread(tt);
		MyThread m2=new MyThread(tt);
		
		Thread t1=new Thread(m1, "Tick");
		Thread t2=new Thread(m2,"Tock");
		
		t1.start();
		sleep(10);
		t2.start();
				
		try {
			t1.join();
			t2.join();
		}catch(InterruptedException e) {
			System.out.println("Main Thread Interuptted");
		}

	}

	private static void sleep(int i) {
		try {
			Thread.sleep(i);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
