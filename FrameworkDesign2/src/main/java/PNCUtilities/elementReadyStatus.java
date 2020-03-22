package PNCUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class elementReadyStatus {
	
	WebDriver driver;
	WebDriverWait w;
	
	public elementReadyStatus(WebDriver driver )
	{
		this.driver = driver;
	}
	
	public boolean elementVisibleAndEnabled(WebElement element, int timeout)
	{
		
		try{
			(new WebDriverWait(driver,timeout)).until(ExpectedConditions.visibilityOf(element)).isEnabled();
			return true;
			
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		return false;
		
	}
	
	public boolean elementVisible(WebElement element, int timeout)
	{
		
		try{
			(new WebDriverWait(driver,timeout)).until(ExpectedConditions.visibilityOf(element));
			return true;
			
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		return false;
		
	}
	
	public boolean elementPresenttoEnter(WebElement element, int timeout)
	{
		
		try{
			(new WebDriverWait(driver,timeout)).until(ExpectedConditions.elementToBeSelected(element));
			return true;
			
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		return false;
		
	}
	
	public boolean alertPresence(int timeout)
	{
		
		try{
			(new WebDriverWait(driver,timeout)).until(ExpectedConditions.alertIsPresent());
			return true;
			
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		return false;
		
	}
	
	
	
	

}
