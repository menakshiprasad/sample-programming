package com.jenkov.tutorials.reflection;

public class MyClass {
	public int a;
	public int b;
	public int sum;
	public int prod;
	
	public MyClass()
	{
		this.a=5;
		this.b=6;
	}
	public MyClass(int i, int j) {
		this.a=i;
		this.b=j;
	}
	public void add()
	{
		sum=a+b;
		System.out.println(sum);
	}
	public void multiply()
	{
		prod=a*b;
		System.out.println(prod);
	}
	

}
