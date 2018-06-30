package com.java.practice;
import java.lang.Long;
public class CardValidator {
 
	public static void main(String[] args) {
		long num=5275160001961894L;
		myfunction(num);
		
		
	}
	public static void myfunction(Long a)
	{
		long arr[]=new long[16];
		long temp;
		int i=15;
		long sum=0;
		int k=1;
		int j=0;
		
		while(a>0)
		{
			temp=a%10;
			a=a/10;
			arr[i]=temp;
			i--;
		}
		for(long a1:arr)
		{
			System.out.println(a1);
		}
		
		while(j<arr.length) {
			long t=0;
			long t1=0;
				
			arr[j]=arr[j]*2;
			t=arr[j]%10;
			t1=arr[j]/10;
			sum=sum+arr[k]+t+t1;
			
			j=j+2;
			k=k+2;
		}
		
		System.out.println(sum);
		
		if(sum%10==0)
			System.out.println("Card number is Valid");
		else
			System.out.println("Card numer is not Valid");
		
	}

}
