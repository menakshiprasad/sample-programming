
package com.java.assignment4;
import java.util.*;

public class Person {

	private String person_name;
	private double electricity;
	private double waterbill;
	private double phonebill;
	private double sum_bill;
	
	Person(String s, double a, double b, double c )
	{
		this.person_name=s;
		this.electricity=a;
		this.waterbill=b;
		this.phonebill=c;
		this.sum_bill=a+b+c;
	}
	
	/**
	
	
	int max=a[0];
	int i=1;
	while(i<a.length) {
		if(max < a[i]) {
			max=a[i];
		}
		i++;
	}
	return max;
	
	 *
	 *
	 *
	 */
	public static Person highestbill(List<Person> pl) {
		Person max = pl.get(0);
		for(Person p: pl)
		{
			if(max.sum_bill < p.sum_bill)
			{
			 max = p;	
			}
		}
		
		return max;
	}
	
	public static void main(String[] args) {

		Person p1=new Person("Michel", 114.5, 50, 30);
		Person p2=new Person("Menakshi", 110.5, 60, 40);
		Person p3=new Person("Ramya", 100, 55, 80);
		Person p4=new Person("Devi", 200, 69, 60);
		List l=new ArrayList();
		l.add(p1);
		l.add(p2);
		l.add(p3);
		l.add(p4);
			Person info=highestbill(l);
			System.out.println(info.person_name+","+info.sum_bill);
			
		}
		
		
}