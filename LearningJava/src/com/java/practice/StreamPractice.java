package com.java.practice;
import java.util.*;
import java.util.stream.Stream;

public class StreamPractice {

	public static void main(String[] args) {
		List<String>i = new ArrayList();

		i.add("one");
		i.add("two");
		i.add("three");
		i.add("orange");

		Stream<String> stream = i.stream().filter( item -> item.startsWith("o") );
		System.out.println(stream.count());
	}

}
