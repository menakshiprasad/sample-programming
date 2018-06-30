package com.jenkov.tutorials.criticalsection;

public class Sum {
private int sum1=1;
private int sum2=1;


public void add(int v1, int v2)
{
	synchronized(this) {
		System.out.println(Thread.currentThread().getName()+"Started");
	sum1=sum1+v1;
	
	
	System.out.println("sum1="+sum1);
	}
	synchronized(this) {
		System.out.println(Thread.currentThread().getName()+"Started");
	sum2=sum2+v2;
	System.out.println("sum2="+sum2);}

	}
	
}
