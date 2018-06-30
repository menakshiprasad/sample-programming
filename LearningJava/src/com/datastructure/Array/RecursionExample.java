package com.datastructure.Array;

public class RecursionExample {

	public static void main(String[] args) {
RecursionExample re=new RecursionExample();
int result=re.factorial(5);
System.out.println(result);
int result2=re.factwithoutrecur(5);
System.out.println(result2);
//for(int i=0;i<7;i++)
	//System.out.println(re.fibonacciRecursion(i));
	
	
		re.fibonWithoutRecur(6);
	}

	int factorial(int n)
	{
		if(n==0)
			return 0;
		else if(n==1)
			return 1;
		else
			return n*factorial(n-1);
	}
	
	
	
	int factwithoutrecur(int n)
	
	{
		int i=n;
		if(n==0)
			return 0;
		else if(n==1)
			return 1;
		else
		{
			while(n>1) {
				 i=i*(n-1);
			n--;
		}
			return i;
			}
	}
	
	int fibonacciRecursion(int n)
	{
		if(n==0)
			return 0;
		else if(n==1)
			return 1;
		else
			return fibonacciRecursion(n-1)+ fibonacciRecursion(n-2);
	}

	void fibonWithoutRecur(int n)
{
		int t1=0;
		
		int t2=1;
		int res;
		System.out.println(t1);
		System.out.println(t2);

		for(int k=0;k<n;k++) {
		
res=t1+t2;
t1=t2;
t2=res;
System.out.println(res);
	}
		 
}
	}
	

