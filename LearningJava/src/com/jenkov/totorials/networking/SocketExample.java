package com.jenkov.totorials.networking;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;


public class SocketExample {
	
	public static void main(String[] args) throws Exception
	{
		Socket s=new Socket("www.money.rediff.com", 80);
		
		System.out.println("Socket obj : "+s);
		
		OutputStream out = s.getOutputStream();
		
		out.write("some data".getBytes());
		
		InputStream in = s.getInputStream();
		int data=in.read();
		
		System.out.println(data);
		
		out.flush();
		in.close();
		
		out.close();

		s.close();
	
		

	}
}
