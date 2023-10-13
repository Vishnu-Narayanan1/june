package testng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Rediff {
	ChromeDriver driver;
	@BeforeTest
	public void setUp() {
	driver=new ChromeDriver();
driver.get("https://www.rediff.com");
}
}
