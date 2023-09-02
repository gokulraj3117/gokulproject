package testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignoree {
	@Ignore
@Test
	private void car() {
		System.out.println("car");

	}

@Test (priority = -3)
private void bike() {
	System.out.println("bike");

}
@Test (priority = -4)
private void train() {
	System.out.println("train");

}
@Test (enabled = false)
private void flight() {
	System.out.println("flight");

}
@Test (invocationCount = 3 ,priority = 1)
private void boat() {
	System.out.println("boat");

}
}
