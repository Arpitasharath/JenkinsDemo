package demo;

import org.testng.annotations.Test;

public class SampleTest {
	@Test
	public void createProduct()
	{
		
		 String BROWSER = System.getProperty("browser");
	        String url = System.getProperty("url");  // Example of how you can set 'url'

	        System.out.println("Hi, Welcome");

	        System.out.println("BROWSER======>" + BROWSER + ", URL===>" + url);
	}
}
