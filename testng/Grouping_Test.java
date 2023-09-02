package testng;

import org.testng.annotations.Test;

public class Grouping_Test {
@Test  (groups = "fruits")
	private void apple() {
		// TODO Auto-generated method stub
System.out.println("apple");
	}
@Test (groups = "fruits")
	private void orange() {
		// TODO Auto-generated method stub
System.out.println("orange");
	}
@Test (groups = "fruits")
	private void banana() {
		// TODO Auto-generated method stub
System.out.println("banana");
	}
@Test (groups = "veggi")
	private void beans() {
		// TODO Auto-generated method stub
	System.out.println("beans");
	}
@Test (groups = "veggi")
	private void carrot() {
		// TODO Auto-generated method stub
	System.out.println("carrot");
	}
@Test (groups = "veggi")
	private void tomato() {
		// TODO Auto-generated method stub
	System.out.println("tomato");
	}
	
	
}
