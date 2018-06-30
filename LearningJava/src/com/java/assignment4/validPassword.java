package com.java.assignment4;

import java.util.Scanner;

public class validPassword {

	public static void main(String[] args) {

		while (true) {
			System.out.println("Enter a valid password\n");
			Scanner s = new Scanner(System.in);

			validate(s);
		}
	}

	private static void validate(Scanner s) {
		String passwd = s.nextLine();

		String reg = "^[A-F]{1,1}[A-Za-z0-9&$]{6,}#$";

		if (passwd.matches(reg) && (passwd.contains("&") || passwd.contains("$"))) {
			System.out.println("Valid Pasword");

		} else {
			System.out.println("Invalid password");
		}
	}

}
