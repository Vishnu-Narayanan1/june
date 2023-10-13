package firstpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ebay_with_xpath {
EdgeDriver driver;
@Before
public void setUp()
{
driver=new EdgeDriver();	
driver.get("https://www.ebay.com");
}
@Test
public void EbayTest()
{
	driver.findElement(By.xpath("//input[@placeholder='Search for anything']")).sendKeys("Mobiles");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	driver.findElement(By.xpath("//a[@href='https://cart.payments.ebay.com/sc/view']")).click();
	driver.findElement(By.xpath("//a[@class='fake-btn action start-shop fake-btn--secondary fake-btn--fluid']")).click();
	driver.findElement(By.xpath("//a[@id='mainContent']/div[1]/u1/li[5]/a")).click();
}
}
