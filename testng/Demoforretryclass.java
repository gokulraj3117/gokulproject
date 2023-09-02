package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demoforretryclass {
@Test  (retryAnalyzer = Retry_Class.class)
	private void practice() {
		String excp_username = "virat";
		
		String actual_username  = "virat";

		System.out.println("launch");
		
		Assert.assertEquals(excp_username , actual_username);
		
		System.out.println("home page");
}
@Test
	private void demo() {
		String excp_username = "gokul";
		
		String actual_username  = "gokul";

		System.out.println("login page");
		
		Assert.assertEquals(excp_username , actual_username);
		
		System.out.println("home page");
}
}
