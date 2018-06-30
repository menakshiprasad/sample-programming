package com.java.practice;

public class palin2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=21;
		int i=num;
		int rev=0;
		int rem;
		while(num>0)
		{
			
		rem=num%10;
		rev=rev*10+rem;
		num=num/10;
		}
		if(i==rev)
		{
			System.out.println(rev);
			System.out.println("No is palindrome");
		}
		else
			System.out.println("no is not palindrome");


	}

}
