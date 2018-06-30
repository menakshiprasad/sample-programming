
package com.jenkov.tutorials;

import java.util.Scanner;

public class sorting2 {

	public static void main(String[] args) {
		int arr[] = new int[6];
		Scanner s=new Scanner(System.in);
		for(int k=0; k<arr.length; k++)
		{
			System.out.println("Enter element "+k);
			arr[k]=s.nextInt();
		}
		
		int i = 0;
		int t;
		while (i < arr.length) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}
			}
			i=i+1;

		}
        System.out.println("Sorted Array");
		System.out.println(java.util.Arrays.toString(arr));

		//System.out.println("min no is: "+arr[0]);
		//System.out.println("max no is: "+arr[arr.length-1]);
	}

}
