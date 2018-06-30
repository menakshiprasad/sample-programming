package com.jenkov.tutorials;
import java.util.*;
//import java.util.List;
//import java.util.Collections;
//import java.util.Iterator;

public class ListLearning {
	

	public static void main(String[] args) {
		MyObject j1=new MyObject("SW", 15);
		MyObject j2=new MyObject("HR", 16);
		MyObject j3=new MyObject("ADMIN", 18);
		
		MyObject j4=new MyObject("FOE", 19);
		List<MyObject> l=new ArrayList<MyObject>();
		l.add(j1);
		l.add(j2);
		l.add(j3);
		l.add(j4);
		
		Iterator i=l.iterator();
		
		while(i.hasNext())
		{
			MyObject mb=(MyObject)i.next();
			System.out.println(mb.name+mb.age);
		}
		System.out.println("________________");
		for(MyObject m:l)
		{
			System.out.println(m.name+m.age);
		}
		
	}
	}
	/*List<String> l1=new ArrayList<>();
		
		l1.add("5");
		l1.add("7");
		l1.add("3");
		l1.add("1");
		l1.add("9");
				
		String first=l1.get(0);
		System.out.println(first);
		
			
			
		}
	}*/

     /*List l = new ArrayList ();
     
     l.add("1");
     l.add("5");
     l.add("8");
     l.add(0,"9");
     int s=l.size();
     System.out.println("list size is" +s);
     System.out.println("list elements are " +l);


     
   Object s1=  l.get(3);
   System.out.println("get elememt is"+ s1);
     
     for(Object ob: l)
     {
    	 System.out.println(ob+ ","); 
     }
     
     l.remove(2);
     
    Iterator i=  l.iterator();
    while(i.hasNext())
    		{
    	Object e=i.next();
    	System.out.print(e+ ",");*/
        
    		
    

   
   
    
    
    
    
    
    	
     
     
     

		
