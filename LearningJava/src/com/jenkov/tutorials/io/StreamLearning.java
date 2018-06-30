package com.jenkov.tutorials.io;
import java.util.*;
import java.util.stream.*;



public class StreamLearning {

	public static void main(String[] args) {

List<String> l=new ArrayList<String>();
l.add("Manish");
l.add("Orange");
l.add("apple");

//Stream<String> s=l.stream();
List<String> l1=l.stream().filter(item->item.startsWith("a")).collect(Collectors.toList());
System.out.println(l1);


	}

}
