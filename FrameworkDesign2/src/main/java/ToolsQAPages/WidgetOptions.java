package ToolsQAPages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import PNCBase.TestBase;
import PNCUtilities.commonMethods;

public class WidgetOptions extends TestBase {

	commonMethods commonmethods;
	@FindBy(xpath = "//h3[text()='Widgets']//following-sibling::ul[1]/li[1]/a[text()='Automation Practice Switch Windows']")
	WebElement eleSwitchWindowOption;
	@FindBy(id = "button1")
	WebElement eleNewWindow;
	
	@FindBy(xpath="//button[text()='Alert Box']")private WebElement btnalert;

	public WidgetOptions() {
		PageFactory.initElements(driver, this);
		commonmethods = new commonMethods(driver);
	}

	public void switchToWinTest() {
		eleSwitchWindowOption.click();
		eleNewWindow.click();
		Set<String> win = driver.getWindowHandles();
		System.out.println(win.size());
		Iterator<String> it = win.iterator();
		String parent = it.next();
		String child = it.next();
		driver.switchTo().window(child);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.switchTo().defaultContent();
		System.out.println(driver.getTitle());

	}

	public void alertTest() {
		commonmethods.AlertcceptWhenVisible(20);
		System.out.println("alert is handled");
	}

}
