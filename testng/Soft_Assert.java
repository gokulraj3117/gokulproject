package testng;
//verification

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert {
@Test
	private void demo() {
String excp_username = "sachin";
	
	String actual_username  = "virat";

	System.out.println("login page");
	SoftAssert s = new SoftAssert();
	
s.assertEquals(excp_username,actual_username);

System.out.println("log out");
	}
}
