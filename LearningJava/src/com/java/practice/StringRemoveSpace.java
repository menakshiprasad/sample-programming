package com.java.practice;

public class StringRemoveSpace {

	public static void main(String[] args) {
		approach1();
		approach2();


	}

	public static void approach1()
	{
		String str="hello how are you";

		String str1=str.replace(" ", "%20");
		System.out.println(str1);
				
	}
	public static void approach2()
	{
		String str="hello how are you";
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<str.length();i++)
		{
			if(str.charAt(i)==' ')
					sb.append("%20");
			else
			sb.append(str.charAt(i));
			
			
		}
		System.out.print(sb.toString());
	}
	
}
