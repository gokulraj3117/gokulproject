package testng;

import org.testng.annotations.Test;

public class Timesout {
@Test (timeOut =5000)
	private void practice() throws InterruptedException {
		System.out.println("browser launch the application");
		System.out.println("click the button");
		Thread.sleep(3000);
		System.out.println("frame the last name");
	}

}
