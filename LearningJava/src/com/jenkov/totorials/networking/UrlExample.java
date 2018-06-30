package com.jenkov.totorials.networking;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.json.JSONObject;

public class UrlExample {

	public static void main(String[] args) throws Exception {
		// example1();
		jsonExample();
	}

	private static void jsonExample() throws Exception {
		URL url = new URL("https://jsonplaceholder.typicode.com/posts/1");
		URLConnection urc = url.openConnection();

		InputStream is = urc.getInputStream();

		StringBuilder sb = new StringBuilder();

		int data = is.read();
		while (data != -1) {

			sb.append((char) data);

			data = is.read();

		}

		is.close();

		System.out.println(sb.toString());

		JSONObject jo = new JSONObject(sb.toString());

		System.out.println("\n======\n");
		System.out.println("Title is : " + jo.getString("title"));
		System.out.println("Id is : " + jo.getInt("id"));
		

	}

	private static void example1() throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		URL url = new URL("http://jenkov.com");
		URLConnection urc = url.openConnection();
		urc.setDoOutput(true);
		OutputStream os = urc.getOutputStream();
		os.write(2);

		InputStream is = urc.getInputStream();

		int data = is.read();
		while (data != -1) {
			System.out.println((char) data);
			data = is.read();

		}

		is.close();
	}

}
