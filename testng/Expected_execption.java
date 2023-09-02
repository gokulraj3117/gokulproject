package testng;

import org.testng.annotations.Test;

public class Expected_execption {
@Test (expectedExceptions = ArithmeticException.class)
	private void practice() {
		 int a = 20;
System.out.println(a/0);
	}
}
