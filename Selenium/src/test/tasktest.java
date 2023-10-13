package test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.taskpage;

public class tasktest {
	WebDriver driver;
	@BeforeTest
public void setUp()
{
		driver=new ChromeDriver();
		driver.get("https://saucedemo.com");
}
@Test
	public void test() throws IOException, Exception
	{
	taskpage ob=new taskpage(driver);
	FileInputStream f=new FileInputStream("C:\\Users\\HOME\\Desktop\\Saucedemo.xlsx");	
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet sh =wb.getSheet("Sheet1");
		int row= sh.getLastRowNum();
		for(int i=1;i<=row;i++)
		{
			String username=sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println("username="+username);
			String pswd=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println("pswd="+pswd);
			ob.setValues(username,pswd);
			ob.loginClick();
			Thread.sleep(2000);
			driver.navigate().refresh();
			
			
}
ob.addcart();
ob.checkout();
ob.setValues2("vishnu","narayanan","691555");
ob.finishClick();
}
}


