package testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_Test {
@Test 
@Parameters({"username","password"})
	private void values(@Optional("tendulkar") String a , int b) {
		System.out.println("username ="+a);
System.out.println("password ="+b);
	}
}
