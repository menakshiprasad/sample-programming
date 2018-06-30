package com.jenkov.totorials.networking;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//InetAddress address=InetAddress.getLocalHost();
		InetAddress address = InetAddress.getByName("www.google.com");
		System.out.println(address);

	}

}
