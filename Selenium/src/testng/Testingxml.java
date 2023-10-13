package testng;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testingxml {
	@BeforeTest
	public void setUp() {
		System.out.println("Open browser");
	}
	@BeforeMethod
	public void test1(){
		System.out.println("url details");
	}
	@Test(groups= {"smoke"})
	public void test2() {
		System.out.println("test1");
	}
	@Test(groups= {"smoke","sanity"})
	public void tesst3() {
		System.out.println("test2"); 

}
	@Test(groups= {"regression"})
	public void test4()
	{
		System.out.println("test4");
	}
}