package testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ebayqn {
	ChromeDriver driver;
	@BeforeTest
	public void setUp() {
	driver=new ChromeDriver();
driver.get("https://www.ebay.com");

}
	@Test
	public void test() {
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println("Total  no.of Links="+links.size());
	}
	@Test
	public void test1() {
		boolean c=driver.findElement(By.xpath("/html/body/script[1]")).isEnabled(); 
		  if(c==true) {
		   System.out.println("enabled");
		  }
		  else {
		   System.out.println("not");
		 }
			  
		  }
	@Test
	public void test2() {
		  boolean logo = driver.findElement(By.xpath("/html/body")).isDisplayed();
		  if(true) {
		   System.out.println("logo is displayed");
		  }
		  
		   	}
}
