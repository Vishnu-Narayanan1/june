package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Facebook {
	ChromeDriver driver;
	@BeforeTest
	public void setUp() {
	driver=new ChromeDriver();
driver.get("https://www.facebook.com");
}
@Parameters({"email","password"})	
@Test
public void Fblogin(String email,String pswd) {
driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(email);	
driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(pswd);
driver.findElement(By.name("login")).click();
}
}
