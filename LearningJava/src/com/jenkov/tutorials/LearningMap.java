package com.jenkov.tutorials;

import java.util.HashMap;
import java.util.Map;
import java.util.*;
import java.lang.*;



public class LearningMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> m=new HashMap();
		
m.put("SW", "1");
m.put("HR", "2");
m.put("Admin", "3");
m.put("FOE", "4");

String s=m.get("Admin");
System.out.println(s);
Iterator i=m.keySet().iterator();

//via iterator
while(i.hasNext())
{
	Object k=i.next();
	Object v=m.get(k);
	System.out.print("Key="+k+"value="+v+"\n");
}
//via for loop
System.out.println("_________");
for(Object key:m.keySet())
{
	Object value=m.get(key);
	
	System.out.print("Key="+key+"value="+value+"\n");
}

}

	

	

	}


