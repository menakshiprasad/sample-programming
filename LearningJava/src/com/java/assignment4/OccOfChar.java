package com.java.assignment4;

public class OccOfChar {

	public static void main(String[] args) {

		String s = "Hello";
		char c = 'H';
		int value = count(s, c);
		if (value == 0)
			System.out.println("character not found");
		else
			System.out.println("occurence of character: " + value);

	}

	public static int count(String s, char c) {
		int cnt = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c)
				cnt++;

		}

		return cnt;

	}

}
