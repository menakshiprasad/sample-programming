package com.jenkov.tutorials;

import java.util.Arrays;

/**
 * Find Maximum number out of given array
 * 
 * @author Menakshi Prasad
 *
 */
public class MaxElement {

	public static void main(String[] args) {
		int arr[] = { 5, 7, 8, 6, 10, 15, 2, 34 };
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i])
				max = arr[i];

		}
		
		System.out.println("Max no -> " + max);

	}

}
