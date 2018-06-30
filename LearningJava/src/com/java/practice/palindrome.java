package com.java.practice;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter lower limit");
		int lowerlmt = s.nextInt();
		System.out.println("Enter uppder limit");

		int uprlmt = s.nextInt();

		for (int i = lowerlmt; i <= uprlmt; i++) {
			checkPalin(i);

		}

	}

	private static void checkPalin(int num) {
		int i = num;
		int rev = 0;
		int rem;
		while (num > 0) {

			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		if (i == rev) {
			System.out.println(rev);
					}
			
	}
}
