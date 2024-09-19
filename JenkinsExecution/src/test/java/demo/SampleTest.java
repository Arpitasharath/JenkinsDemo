package demo;

import org.testng.annotations.Test;

public class SampleTest {
	@Test
	public void createProduct()
	{
		
		String BROWSER = System.getProperty("browser", System.getenv("BROWSER"));
		String url = System.getProperty("url", System.getenv("URL"));


	        System.out.println("Hi, Welcome");

	        System.out.println("BROWSER======>" + BROWSER + ", URL===>" + url);
	}
}
