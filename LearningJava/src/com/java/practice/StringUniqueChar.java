package com.java.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 
 * @author Menakshi Prasad
 *
 */
public class StringUniqueChar {

	public static void main(String[] args) {
		usingForLoopApproach();
		betterApproach();
		anotherApproach();
	}

	//Using HashMap
	private static void anotherApproach() {
		
	}
		

	//Time complexity - O(n)
	private static void betterApproach() {
		String str1 = "Manopopj";
		Set<Character> hs = new HashSet();

		for(int i=0; i<str1.length();i++)
		{
			hs.add(str1.charAt(i));
		}
int a=hs.size();
if(a==str1.length())
	System.out.println("String has unique character");

else
	System.out.println("string doesn' have unique character");
		}
		
	

	//Time compexity - O(n2)
	private static void usingForLoopApproach() {
		String str1 = "Manooopjj";
		
		int i;
		boolean flag = false;

		for (i = 0; i < str1.length(); i++) {
			for (int j = i + 1; j < str1.length(); j++) {
				if (str1.charAt(i) != str1.charAt(j))
					j++;
				else {
					System.out.println("String doesnt have unique character");
					flag = true;
					break;
				}
			}
			if (flag) {
				break;
			}
		}
		if (!flag) {
			System.out.println("string has unique character");
		}
	}

}
