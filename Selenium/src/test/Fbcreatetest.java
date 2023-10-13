package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Fbcreatepage;


public class Fbcreatetest {
	WebDriver driver;
	@BeforeTest
public void setUp()
{
		driver=new ChromeDriver();
}
@Test
public void test() {
	driver.get("https://facebook.com");
	Fbcreatepage ob=new Fbcreatepage(driver);
	
	ob.loginClick();
}
}
