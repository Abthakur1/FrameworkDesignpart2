package ToolsQAPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import PNCBase.TestBase;
import PNCUtilities.commonMethods;

public class HhomePage extends TestBase {

	commonMethods commonmethods;
	//ExtentTest logger;
	
	@FindBy(xpath="//img[@alt='TOOLSQA']") private WebElement logo;
	
	public HhomePage()
	{
		
		PageFactory.initElements(driver, this);
		commonmethods = new commonMethods(driver);
	}
	
	public boolean LogoDisplayed()
	{
		boolean status=commonmethods.ElementDisplayed(logo, 20);
		return status;
		
		
		
	}
	
}
