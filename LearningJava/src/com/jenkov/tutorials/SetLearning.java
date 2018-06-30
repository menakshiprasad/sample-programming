package com.jenkov.tutorials;
import java.util.*;
import java.lang.Comparable;
public class SetLearning {

	public static void main(String[] args) {
		Set<Integer> s= new HashSet();
		//Set<Integer>s= new LinkedHashSet();
		//Set<Integer> s=new TreeSet<>();
		
		s.add(5);
		s.add(8);
		s.add(11);
		s.add(11);
		s.add(3);
		
		
		System.out.println(s);
		System.out.println(s.size());
		
		
		//s.remove("11");

		System.out.println(s);
		boolean b=s.contains(11);
		
		System.out.println(b);
		
	}

}
