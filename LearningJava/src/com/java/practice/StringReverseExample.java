package com.java.practice;

// http://javarevisited.blogspot.com/2012/01/how-to-reverse-string-in-java-using.html
public class StringReverseExample {

	public static void main(String[] args) {
		String revStr = reverseRecursively("abcd");
		String revstr=reverse("abcdef");
		System.out.println(revStr);
		System.out.println(revstr);
	}

	public static String reverse(String string) {
StringBuilder sb= new StringBuilder();
for(int i=string.length()-1; i>=0 ;i--)
{
	sb.append(string.charAt(i));
}

		String s=sb.toString();
		return s;
	}

	public static String reverseRecursively(String str) {
		// base case to handle one char string and empty string
		if (str.length() < 2) {
			return str;
		}

		System.out.println(str.substring(1) +" + "+ str.charAt(0));
		return reverseRecursively(str.substring(1)) + str.charAt(0);

	}

}
