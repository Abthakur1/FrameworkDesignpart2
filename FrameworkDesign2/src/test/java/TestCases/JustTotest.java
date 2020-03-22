package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PNCBase.TestBase;

public class JustTotest extends TestBase {
	
	@BeforeMethod
	public void beforemethod()
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
