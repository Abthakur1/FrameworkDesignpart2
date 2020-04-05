package TestCases;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import PNCBase.TestBase;
import PNCUtilities.Utility;
import ToolsQAPages.HhomePage;
import ToolsQAPages.WidgetOptions;

public class ToolsQATest extends TestBase {

	SoftAssert sa;
	HhomePage hmpage;
	WidgetOptions widgetoption;
	
	
	ExtentHtmlReporter htmlreporter;
	ExtentReports reports;
	ExtentTest logger;
	
	int j =2;

	public ToolsQATest() {
		super();
		sa = new SoftAssert();
		String path = System.getProperty("user.dir")+ "/extent-reports/report"+j+".html";
		j++;
		htmlreporter = new ExtentHtmlReporter(path);
		reports = new ExtentReports();
		reports.attachReporter(htmlreporter);
	
	}

	@BeforeMethod
	public void setup() {
		initialization();
		hmpage = new HhomePage();
		widgetoption = new WidgetOptions();
	}

	@Test
	public void TC01() {
		logger = reports.createTest("test case 1");
		//System.out.println("chala");
		boolean status = hmpage.LogoDisplayed();
		logger.log(Status.INFO, "logo validation");
		//sa.assertTrue(status);
		//System.out.println("just added");
		sa.assertAll();
		
	}

	@Test
	public void TC02()
	{
		logger = reports.createTest("test case 2");
		widgetoption.switchToWinTest();
		//sa.assertTrue(false);
		sa.assertAll();
	}
	
	@Test
	public void TC03()
	{
		logger = reports.createTest("test case 3");
		widgetoption.alertTest();
		//sa.assertTrue(false);
		sa.assertAll();
		
		//logger.log(Status.PASS, "alert is handled");
	}
		
	@AfterMethod
	public void captureStatus(ITestResult result) throws IOException {
		
		if(result.getStatus()==ITestResult.SUCCESS)
		{
			logger.log(Status.PASS, result.getName()+" is passed");
		}
		else
			if(result.getStatus()==ITestResult.FAILURE)
			{
				logger.log(Status.FAIL,  result.getName()+" is failed");
				
				String path = Utility.captureScreenshot();
				
				logger.addScreenCaptureFromPath(path, "Failure screenshot");
			}
		
		driver.quit();
	}
	
	@AfterTest
	public void report()
	{
		reports.flush();
	}

}
