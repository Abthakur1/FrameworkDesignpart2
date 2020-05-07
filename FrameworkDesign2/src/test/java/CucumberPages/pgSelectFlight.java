package CucumberPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class pgSelectFlight {

	@FindBy(css = "input[value='oneway']")
	public WebElement RdTripOneway;
	@FindBy(xpath = "//select[@name='fromPort']")
	WebElement lstFrom;
	@FindBy(xpath = "//select[@name='toPort']")
	WebElement lstTo;
	@FindBy(xpath = "//select[@name='departDay']")
	WebElement lstDay;
	@FindBy(xpath = "//select[@name='departMonth']")
	WebElement lstMonth;
	@FindBy(xpath = "//input[@value='Continue']")
	public WebElement btnContinue;

	public pgSelectFlight(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void selectFrom(String from) {
		Select selFrom = new Select(lstFrom);
		selFrom.selectByVisibleText(from);
	}

	public void selectTo(String to) {
		Select selTo = new Select(lstTo);
		selTo.selectByVisibleText(to);

	}

	public void selectDay(String day) {
		Select selDay = new Select(lstDay);
		selDay.selectByVisibleText(day);

	}

	public void selectMonth(String month) {
		Select selMon = new Select(lstMonth);
		selMon.selectByVisibleText(month);

	}

}