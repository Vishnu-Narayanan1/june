package firstpkg;


import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
public class Dobpgm{

ChromeDriver driver;
@Before

public void setUp()
{
	driver=new ChromeDriver();
}
@Test
public void test1()
{
	driver.get("https://www.rediff.com");
}
}