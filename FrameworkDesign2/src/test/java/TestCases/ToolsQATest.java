package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PNCBase.TestBase;
import ToolsQAPages.HhomePage;

public class ToolsQATest extends TestBase {

	SoftAssert sa;
	HhomePage hmpage;

	public ToolsQATest() {
		super();
		sa = new SoftAssert();

	}

	@BeforeMethod
	public void setup() {
		initialization();
		hmpage = new HhomePage();
	}

	@Test
	public void TC01() {
		System.out.println("chala");
		boolean status = hmpage.LogoDisplayed();
		sa.assertTrue(status);
	}

	@AfterMethod
	public void endTest() {
		driver.quit();
		sa.assertAll();
	}

}
