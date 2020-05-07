package CucumberPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import PNCBase.TestBase;

public class pgHomeTravel {

	// WebDriver driver;
	@FindBy(xpath = "//input[@name='username']")
	public WebElement edtUsername;
	@FindBy(css = "input[name='password']")
	public WebElement edtPassword;
	@FindBy(css = "input[value='Sign in']")
	public WebElement btnSignin;
	@FindBy(xpath = "//a[text()='Sign off']")
	public WebElement btnSignoff;
	@FindBy(name = "remember_me")
	public WebElement chkRememberme;
	@FindBy(xpath = "//div[text()='Signed in!']")
	public WebElement txtSigninmessage;

	public pgHomeTravel(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
