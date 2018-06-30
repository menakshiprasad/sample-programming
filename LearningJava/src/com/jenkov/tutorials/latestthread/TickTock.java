package com.jenkov.tutorials.latestthread;

public class TickTock {
	String state;
	
	synchronized void tick(boolean r)
	{
		if(!r)
		{
			state="ticked";
			notify();
			return;
			
		}
		
		System.out.print("Tick ");
		state="ticked";
		notify();
		try {
			while(!state.equals("tocked"))
			wait();
			}catch(InterruptedException e) {
				System.out.println("Interrupted exception");
		}
	}
	
	synchronized void tock(boolean r)
	{
		if(!r)
		{
			state="tocked";
			notify();
			return;
			
		}
		
		System.out.println("Tock ");
		state="tocked";
		notify();
		try {
			while(!state.equals("ticked"))
			wait();
			}catch(InterruptedException e) {
				System.out.println("Interrupted exception");
		}
	}
	
	
	

}
