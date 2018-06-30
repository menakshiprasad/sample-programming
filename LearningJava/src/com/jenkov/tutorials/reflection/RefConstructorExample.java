package com.jenkov.tutorials.reflection;

import java.lang.reflect.Constructor;

public class RefConstructorExample {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		
		Class ref=MyClass.class;
		Constructor c=ref.getConstructor();
		
		System.out.println(c);

		
		Class[] c1=c.getParameterTypes();
		for(Class c2:c1)
		{
			System.out.println(c2.getName());
		}
		
	}

}
