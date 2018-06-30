package com.jenkov.tutorials;

import java.util.Comparator;
import java.util.*;

public class SomeComparator implements Comparator<Job> {

	public int compare(Job j1, Job j2) {

		if (j1.getRank() > j2.getRank()) {
			return 1;
		}

		if (j1.getRank() < j2.getRank()) {
			return -1;
		}
		
		
		return 0;
	}
}
/*
 * public int compare(Object o1, Object o2) {
 * 
 * if(o1>o2)
 * 
 * return -1;
 * 
 * 
 * }
 */
