package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Swaglab {
	WebDriver driver;
	String baseurl="https://saucedemo.com";
	@BeforeTest
	public void setUp() {
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void test() {
		String expectedurl="https://www.saucedemo.com/inventory.html";
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		String actualurl=driver.getCurrentUrl();
		Assert.assertEquals(expectedurl, actualurl);
		
		
		
	}
	

}
