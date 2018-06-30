package com.jenkov.tutorials.io;
import java.io.*;

public class ExceptionLearning {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ExceptionLearning el=new ExceptionLearning();
		el.OpenFile();
ExceptionLearning.printfile();
ExceptionLearning.printfile1();
	}
/*public void OpenFile()
{
	try {
	FileReader fr=new FileReader("C:/Users/Menakshi Prasad/hello.txt");
	int data=0;
	while(data!=-1)
	{
		data=fr.read();
		System.out.print((char)data);
		
	}
	fr.close();
	System.out.println("File closed");
	
	}catch(FileNotFoundException e){
		System.out.println(e.getMessage());
		
	}catch(IOException e) {
		System.out.println(e.getMessage());
	}
	
}*/
	public void OpenFile() throws IOException
	{
		FileReader fr=new FileReader("C:/Users/Menakshi Prasad/hello.txt");
		int data=0;
		while(data!=-1)
		{
			data=fr.read();
			System.out.print((char)data);
			
		}
		fr.close();
		System.out.println("File closed");
		
		
	}
	// whatever file is open will be closed automatically because FileInputStream implements the Java interface java.lang.AutoCloseable


	public static void printfile()throws IOException
	{
		try(FileInputStream i=new FileInputStream ("C:/Users/Menakshi Prasad/hello.txt")){
			int data=0;
			while(data!=-1)
			{
				data=i.read();
				System.out.print((char)data);
				
				
			}
				
		}
	}
	// whatever file is open will be closed automatically because FileInputStream implements the Java interface java.lang.AutoCloseable
	public static void printfile1()throws IOException
	{
		try(FileInputStream i=new FileInputStream ("C:/Users/Menakshi Prasad/hello.txt"); 
				BufferedInputStream bi=new BufferedInputStream(i)){
			int data=0;
			while(data!=-1)
			{
				data=bi.read();
				System.out.print((char)data);
				

				
			}
		}
	}
}
