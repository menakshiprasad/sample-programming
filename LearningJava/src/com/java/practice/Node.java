package com.java.practice;

public class Node {
int data;
Node next=null;
public Node()
{
	this.data=0;
	this.next=null;
}
public Node(int d, Node n)
{
this.data=d;
this.next=n;
}

public void setlink(Node n)
{
	next=n;
}
public void setdata(int d1)
{
	data=d1;
}


	public static void main(String[] args) {

		Node n1=new Node();
		Node n2=new Node();
		Node n3=new Node();
		Node n4=new Node();
		Node n5=new Node();
		n1.setdata(5);
		n1.setlink(n2);
		n2.setdata(10);
		n2.setlink(n3);
		n3.setdata(12);
		n3.setlink(n4);
		n4.setdata(16);
		n4.setlink(n5);
		n5.setdata(20);
		n5.setlink(null);
		

	}

	public static void insertfirst()
	{
		
	}
	public static void insertlast()
	{
		
	}
	public static void insertmiddle()
	{
		
	}
	
}
