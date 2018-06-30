package com.jenkov.tutorials;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SampleClass {

	public static void main(String[] args) {
		SampleClass sc=new SampleClass();
		
		sc.start();
		
	}
	public void start()
	{
		Job j1=new Job("SW", 4);
		Job j2=new Job("HR", 3);
		Job j3=new Job("ADMIN", 1);
		Job j4=new Job("FOE", 2);
		
		
		List<Job> l=new ArrayList<>();
		l.add(j1);
		l.add(j2);
		l.add(j3);
		l.add(j4);
		//calling toString
		for (Job i : l) {
			System.out.print(i+" , ");
		}
		Comparator<Job> comparator = new SomeComparator();

		Collections.sort(l, comparator);
		
		System.out.println("\n\nAfter sorting\n");
		for (Object i : l) {
			System.out.print(i+" , ");
		}
	}
}
	/*List<Integerl.add(j1);> list = new ArrayList<>();
		
		list.add(10);
		list.add(9);
		list.add(3);
		list.add(7);
		list.add(6);
		list.add(8);
		
		
		for (Integer i : list) {
			System.out.print(i+" - ");
		}
		//add elements to the list

		Comparator comparator = new SomeComparator();

		Collections.sort(list, comparator);
		
		System.out.println("\n\nAfter sorting\n");
		for (Integer i : list) {
			System.out.print(i+" - ");
		}
	}*/
		

	


