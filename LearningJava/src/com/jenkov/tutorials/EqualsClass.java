package com.jenkov.tutorials;

public class EqualsClass {

	public static void main(String[] args) {
		Job j1 = new Job("hw", 1);
		Job j2 = new Job("hw", 1);
		Job j3 = j1;
		
		
		if(j1 == j2) {
			System.out.println("true j1,j2");
		}
		
		if(j1.equals(j2)) {
			System.out.println("true on equals, j1, j2");
		}
		
		if(j1 == j3) {
			System.out.println("true j1,j3");
		}
		
		
		System.out.println(j1);
	}

}
