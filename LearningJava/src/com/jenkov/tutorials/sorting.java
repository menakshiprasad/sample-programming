package com.jenkov.tutorials;

public class sorting {

	public static void main(String[] args) {
		
		int arr[] = { 5, 8, 4, 78, 23, 1, 6, 25 };
		//int arr[] = {3};
		int a;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					a = arr[i];
					arr[i] = arr[j];
					arr[j] = a;
				}
			}

		}

		/**
		 * for (int k = 0; k < arr.length; k++)
		 

			System.out.print(arr[k] + ",");
*/
		System.out.println(java.util.Arrays.toString(arr));
	}

}
