package com.jenkov.tutorials;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LearningDate {

	public static void main(String[] args) throws Exception {
String s="25/05/2018";
		Date df= new SimpleDateFormat("dd/MM/yyyy").parse(s);
		System.out.println(s);
		
		
	}

}
