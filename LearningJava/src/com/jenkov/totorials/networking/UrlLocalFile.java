package com.jenkov.totorials.networking;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.json.JSONObject;

public class UrlLocalFile {

	public static void main(String[] args) throws Exception {
		String fileUrl = "file:///C:/Users/Menakshi%20Prasad/Desktop/personInfo.txt";

		String key = "ageValue";
		String value = new UrlLocalFile().jsonExample(fileUrl, key );
		System.out.println("Value returned is : "+value);
	}

	public String jsonExample(String fileUrl, String key) throws MalformedURLException, IOException {
		URL url = new URL(fileUrl);

		URLConnection urc = url.openConnection();
		InputStream is = urc.getInputStream();

		StringBuilder sb = new StringBuilder();

		int data = is.read();
		while (data != -1) {
			sb.append((char) data);
			data = is.read();
		}

	System.out.print(sb.toString());

		System.out.println("\n====\n");

		JSONObject json = new JSONObject(sb.toString());

		JSONObject propertiesObj = json.getJSONObject("properties");
		
		
		JSONObject ageObj = propertiesObj.getJSONObject("age");
		String value = ageObj.getString(key);

		is.close();
		
		return value;
	}

}
