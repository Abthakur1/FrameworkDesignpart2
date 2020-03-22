package TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PNCBase.TestBase;

public class Test1 extends TestBase {
	
	WebDriver driver;
	public Test1()
	{
		super();
	}
	@BeforeMethod
	public void setup()
	{
		System.out.println("before methods");
	
	}
	@Test
	public void test()
	{
		System.out.println("chala");
	}
	@AfterMethod
	public void Aftermethod()
	{
		System.out.println("after methods");
	}

}
