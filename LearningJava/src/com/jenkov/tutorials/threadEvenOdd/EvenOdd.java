package com.jenkov.tutorials.threadEvenOdd;

public class EvenOdd {
	String state;

	synchronized void odd(boolean r, Thread t) {
		if (!r) {
			state = "Oddno";
			notify();
			return;

		}

		int i = 1;
		while (i <= 10) {

			System.out.println("Odd : "+t.getName()+" "+i);
			state = "Oddno";
			notify();
			try {
				while (!state.equals("Evenno")) {
					wait();
				}
			} catch (InterruptedException e) {
				System.out.println("Interrupted exception");
			}
			i = i + 2;
		}

	}

	synchronized void even(boolean r, Thread t) {
		if (!r) {
			state = "Evenno";
			notify();
			return;

		}
		int i = 2;
		while (i <= 10) {
			System.out.println("Event : "+t.getName()+" "+i);
			state = "Evenno";
			notify();
			try {
				while (!state.equals("Oddno")) {
					wait();
				}
			} catch (InterruptedException e) {
				System.out.println("Interrupted exception");
			}
			i = i + 2;
		}

	}
}
