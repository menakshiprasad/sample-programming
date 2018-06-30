package com.java.practice;

public class StringCompression {

	public static void main(String[] args) {
		// Implement a method to perform basic string compression using the counts of
		// repeated characters.
		// For example, the string aabcccccaaa would become a2b1c5a3.
		String str = "aabcccccaaaaaaa";
		String str2;
		int i = 0;
		int c = 1;
		while (i < str.length() - 1) {
			if (str.charAt(i) == str.charAt(i + 1))
				c = c + 1;
			else {
				System.out.print(str.charAt(i));
				System.out.print(c);
				c = 1;
			}
			i = i + 1;
		}
		System.out.print(str.charAt(i));
		System.out.print(c);

		System.out.println("\n=====\n");
	}

}
