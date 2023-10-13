package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {
WebDriver driver;
@Parameters("browser")
@BeforeTest
public void setUp(String browser) {
	if(browser.equalsIgnoreCase("chrome"))
	{
		driver=new ChromeDriver();
	}
	else if(browser.equalsIgnoreCase("Firefox"))
	{
		driver=new FirefoxDriver();
	}
}
@Test

public void test()
{
	driver.get("https://www.facebook.com");
}

}
