package com.jenkov.tutorials.threadEvenOdd;

public class EvenOddMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenOdd tt = new EvenOdd();
		MyThread1 m1 = MyThread1.CreateAndStart("Oddno", tt);

		MyThread1 m2 = MyThread1.CreateAndStart("Evenno", tt);
		
		try {
			m1.t.join();
			m2.t.join();
		} catch (InterruptedException e) {
			System.out.println("Main Thread Interuptted");
		}

	}

}
