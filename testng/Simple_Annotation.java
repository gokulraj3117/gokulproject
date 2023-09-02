package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotation {
	public WebDriver driver;
	
@BeforeSuite
public void browserlaunch() {
	System.setProperty("webdriver.chrome.driver", "D:\\eclip\\Test_NG\\Driver\\chromedriver.exe");
 driver = new ChromeDriver();
}
@BeforeTest
public void open_url() {
driver.get("https://www.amazon.in/");

}
@BeforeClass
public void cls() {
System.out.println("class");

}
@BeforeMethod
public void logi() {
	System.out.println("login");

}
@Test
public void gettitle() {
	String title = driver.getTitle();
System.out.println(title);
}
@Test
public void searchlapt() {
WebElement lap = driver.findElement(By.name("field-keywords"));
lap.sendKeys("laptop");

}
/*@Test
public void click() {
	WebElement t = driver.findElement(By.id("nav-search-submit-button"));
	t.click();	

}*/
@AfterMethod
public void logout() {
	System.out.println("logout");

}
@AfterTest
public void close() {
	driver.close();

}
}
