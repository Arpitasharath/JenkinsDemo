package demo;

import org.testng.annotations.Test;

public class SampleTest {
	@Test
	public void createProduct(String BROWSER, String url)
	{
		System.out.println("Hi, Welcome");
		
		System.out.println("ROWSER======>"+BROWSER+", URL===>"+url);

	}
}
