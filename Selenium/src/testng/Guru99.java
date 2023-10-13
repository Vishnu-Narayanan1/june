package testng;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Guru99 {
	ChromeDriver driver;
	@BeforeTest
	public void setUp() {
		driver=new ChromeDriver();
	}
	@Test
	public void test1() {
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement rightclck=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		Actions act=new Actions(driver);
		act.contextClick(rightclck);
		act.perform();
		WebElement edit=driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]"));
edit.click();
Alert a=driver.switchTo().alert();
String alerttext=a.getText();{
	System.out.println(alerttext);
	a.accept();
	WebElement doubleclck=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
act.doubleClick(doubleclck);
act.perform();
Alert b=driver.switchTo().alert();
String alerttxt=b.getText();{
	System.out.println(alerttxt);
	b.accept();
}

}
	}}
