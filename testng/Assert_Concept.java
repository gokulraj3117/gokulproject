package testng;

import org.testng.Assert;
import org.testng.annotations.Test;
//validation
public class Assert_Concept {
@Test
private void practice() {
	String excp_username = "virat";
	
	String actual_username  = "virat";

	System.out.println("login page");
	
	Assert.assertEquals(excp_username , actual_username);
	
	System.out.println("home page");
}
}
