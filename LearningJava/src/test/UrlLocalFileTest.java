package test;

import java.io.IOException;
import java.net.MalformedURLException;

import org.junit.Assert;
import org.junit.Test;

import com.jenkov.totorials.networking.UrlLocalFile;

public class UrlLocalFileTest {

	@Test
	public void testJsonExample() throws Exception {
		UrlLocalFile obj = new UrlLocalFile();
		String fileUrl = "file:///C:/Users/Menakshi%20Prasad/Desktop/personInfo.txt";
		String key = "minimum";
		String value = obj.jsonExample(fileUrl, key);
		// System.out.println(value);

		Assert.assertTrue(key + " is changed. Not expected. It should be fixed all the time.", value.equals("0"));
	
		String ageValue = obj.jsonExample(fileUrl, "ageValue");
		Assert.assertTrue("wrong age returned", ageValue.equals("35"));
	}

	@Test
	public void testFileUrl() {
		try {
			UrlLocalFile obj = new UrlLocalFile();
			String fileUrl = "file:///C:/Users/Menakshi%20Prasad/Desktop/personInfo.txt2";
			String key = "minimum";
			String value = obj.jsonExample(fileUrl, key);
			
		} catch (Exception e) {
			Assert.fail("Wrong file url is provided.");
		}
	}
}
