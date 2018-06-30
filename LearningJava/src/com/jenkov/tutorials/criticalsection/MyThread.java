package com.jenkov.tutorials.criticalsection;

public class MyThread implements Runnable {

Sum s1;
MyThread(Sum sum)
{
	this.s1=sum;
	
}
	
	
	public void run()
{
		

	s1.add(5, 6);
	
	
}
	
	
}
