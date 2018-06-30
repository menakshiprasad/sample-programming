package com.jenkov.tutorials;

public class StringComp {

	public static void main(String[] args) {
		String s1="Sachin";  
		   String s2="Sachin";  
		   String s3=new String("Sachin");  
		   String s4=new String("Sachin");
		   String s5="Saurav";  
		   System.out.println(s1.equals(s2));//true  
		   System.out.println(s1.equals(s3));//true  
		   System.out.println(s3.equals(s4));//true
		   if(s3==s4)
		   {
			   System.out.println("True");
		   }
		   else
			   System.out.println("False");
	}

}
