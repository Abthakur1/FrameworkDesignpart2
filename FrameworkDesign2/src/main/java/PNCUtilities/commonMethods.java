package PNCUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class commonMethods extends elementReadyStatus {

	public commonMethods(WebDriver driver) {
		super(driver);
		
	}

	public void enterWhenVisible(WebElement element,String val, int timeout)
	{
		try
		{
			if(elementPresenttoEnter(element,timeout))
			{
				element.sendKeys(val);
			}
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public void clickWhenVisible(WebElement element, int timeout)
	{
		try
		{
			if(elementVisibleAndEnabled(element,timeout))
			{
				element.click();
			}
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	
	public void AlertcceptWhenVisible(int timeout)
	{
		try
		{
			if(alertPresence(timeout))
			{
				driver.switchTo().alert().accept();
			}
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public boolean ElementDisplayed(WebElement element, int timeout)
	{
		try
		{
			if(elementVisible(element,timeout))
			{
				return true;
			}

		}catch(Exception e)
		{
			System.out.println(e.getMessage());
			return false;
		}
		
		return false;
	} 

}
