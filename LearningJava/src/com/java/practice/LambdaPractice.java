package com.java.practice;

public class LambdaPractice {
	final static String b="hello!";

	public static void main(String[] args) {
		LambdaPractice lp=new LambdaPractice();
		greetingmsg g1=msg->System.out.println(b+msg);
		g1.sayhello("Joseph");
		
		mathoperation add=(a,b)->System.out.println(a+b);
	add.operation(5, 10);
	
	}
	
	interface greetingmsg
	{
		public void sayhello(String msg);
		
	}
	interface mathoperation{
		public void operation(int a, int b);
		
			
		
	}
			
			
		
	
	
	}


