package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.Assertion;

import CucumberPages.pgHomeTravel;
import CucumberPages.pgSelectFlight;
import PNCUtilities.Utility;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TravelSiteSteps {
public WebDriver driver;
pgHomeTravel home;
pgSelectFlight selectflight;

@Before
public void setup()
{
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\resources\\CommonDrivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(Utility.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(Utility.IMPLICIT_WAIT, TimeUnit.SECONDS);
	home = new pgHomeTravel(driver);
	selectflight = new pgSelectFlight(driver);
}
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		String title  = driver.getTitle();
	System.out.println(title);
		
	    
	}
	@Given("user go to url {string}")
	public void launchurl(String string)
	{
		driver.get(string);	
	}

	@Given("user enters username {string}")
	public void user_enters_username(String string) throws InterruptedException {
		home.edtUsername.sendKeys(string);
	}

	@Given("user enters password {string}")
	public void user_enters_password(String password) {
	   home.edtPassword.sendKeys(password);
	}

	@Given("user check the remember checkbox")
	public void user_check_the_remember_checkbox() {
		home.chkRememberme.click();
	}

	@When("user click on Sign in button")
	public void user_click_on_Sign_in_button() {
	    home.btnSignin.click();
	}

	@Then("successful login with Signed in message displyed")
	public void successful_login_with_Signed_in_message_displyed() {
		boolean presence= home.txtSigninmessage.isDisplayed();
	Assert.assertTrue(presence, "displayed flag is false");
	}
	
	@Given("user selects Trip Type")
	public void user_selects_Trip_Type() {
		selectflight.RdTripOneway.click();
	}

	@When("user selects from {string}")
	public void user_selects_from(String string) {
		selectflight.selectFrom(string);
	  
	}

	@When("user selects to {string}")
	public void user_selects_to(String string) {
		selectflight.selectTo(string);
	}

	@When("user selects day {string}")
	public void user_selects_day(String string) {
		selectflight.selectDay(string);
	}

	@When("user select month {string}")
	public void user_select_month(String string) {
		selectflight.selectMonth(string);
	}

	@When("user click on continue button")
	public void user_click_on_continue_button() {
		selectflight.btnContinue.click();
	}
	
	@After
	public void tearDown()
	{
		
		home.btnSignoff.click();
		driver.quit();
		
		//System.out.println("completed all");
	}
}
