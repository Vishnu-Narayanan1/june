package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class datepicker {
		ChromeDriver driver;
	@BeforeTest
	public void setUp() {
		driver=new ChromeDriver();
		driver.get("https://www.booking.com/");
		
		
	}
	@Test
	public void test() {
		driver.navigate().refresh();
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div[1]/div[3]/div/div/div/div/span[1]")).click();
		
		}

}
