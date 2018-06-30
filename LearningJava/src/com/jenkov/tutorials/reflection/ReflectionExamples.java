package com.jenkov.tutorials.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExamples {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException {
		// TODO Auto-generated method stub
		Class ref = MyClass.class;
		// String MyClass=Class.forName(com.jenkov.tutorials.reflection.MyClass);
		// String classname=ref.getName();
		String classname = ref.getSimpleName();
		Package p = ref.getPackage();
		System.out.println(p);
		System.out.println(classname);
		Method[] m = ref.getMethods();
		Field[] f = ref.getFields();
		for (Method m1 : m) {
			System.out.println("methodname" + m1.getName());

		}
		for (Field f1 : f) {
			System.out.println("fieldname" + f1.getName());
		}

		Field f2 = ref.getField("b");
		System.out.println(f2);
		Object ftype = f2.getType();
		System.out.println(ftype);
	}

}
