package testng;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazon {
	ChromeDriver driver;
@BeforeTest
public void setUp() {
	driver=new ChromeDriver();
}
@Test
public void test() {
	driver.get("https://www.amazon.in/");
	driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobile");
	driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
	String parentWindow = driver.getWindowHandle();
	System.out.println("parent window title" +  driver.getTitle());
	driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
 Set<String> allWindowHandles = driver.getWindowHandles();
 
 for (String handle : allWindowHandles) {
	 if(!handle.equalsIgnoreCase(parentWindow)) {
		 driver.switchTo().window(handle);
	driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input")));
	driver.findElement(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input")).click();
	
}
 }
}}
