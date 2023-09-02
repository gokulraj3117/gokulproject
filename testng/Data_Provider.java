package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

public class Data_Provider {
@Test(dataProvider = "testdata")
	private void values( String a , int b) {
		System.out.println("username ="+a);
        System.out.println("password ="+b);
        
}
//0bject[][]	
@DataProvider
	private Object[][] testdata() {
		
		return new Object[][] {
			{"gokul",1234},
			{"sachin",10},
			{10,"messi"}
			
		};

	}
	
	
}