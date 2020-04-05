package StepDefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import cucumber.api.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FlightSite {
	WebDriver driver;
	
	public FlightSite()
	{
		//System.out.println("init");
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\resources\\CommonDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	@Given("^user launch url \"(.*)\"$")
	public void user_launch_url(String url) {
	   driver.get(url);
	}

	@When("^user is on home page$")
	public void user_is_on_home_page() {
		System.out.println(driver.getTitle());
	   
	}

	@Then("^verify the home logo$")
	public void verify_the_home_logo() {
		System.out.println("home logo");
		//boolean logo = driver.findElement(By.xpath("//img[@alt='Mercury Tours']")).isDisplayed();
	  //Assert.assertTrue(false);
	}
	
	@Then("^user click on Register link$")
	public void user_click_on_Register_link() {
	    driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
	}

	@Then("^user enters contact information \"(.*)\",\"(.*)\",\"(.*)\",\"(.*)\"$")
	public void user_enters(String FN, String LN, String PH, String EMAIL) {
	    driver.findElement(By.name("firstName")).sendKeys(FN);
	    driver.findElement(By.name("lastName")).sendKeys(LN);
	    driver.findElement(By.name("phone")).sendKeys(PH);
	    driver.findElement(By.name("userName")).sendKeys(EMAIL);
	}

/*	@Given("^user enter address details $")
	public void user_enters_Address_details(DataTable addressDetails) {
		List<List<String>> data= addressDetails.raw();
		driver.findElement(By.name("address1")).sendKeys(data.get(0).get(0));
		driver.findElement(By.name("city")).sendKeys(data.get(0).get(1));
		Select s = new Select(driver.findElement(By.xpath("//select[@name='country']")));
		s.selectByVisibleText(data.get(0).get(2));
	}*/
	
	@Then("^user enter address details \"(.*)\",\"(.*)\",\"(.*)\"$")
	public void addressdetails(String Address,String city, String country)
	{
		driver.findElement(By.name("address1")).sendKeys(Address);
		driver.findElement(By.name("city")).sendKeys(city);
		Select s = new Select(driver.findElement(By.xpath("//select[@name='country']")));
		s.selectByVisibleText(country);
	}

	/*@Given("^user enters user information details$")
	public void user_enters_user_information_details(DataTable UserInfo) {
		List<List<String>> data1= UserInfo.raw();
		driver.findElement(By.name("email")).sendKeys(data1.get(0).get(0));
		driver.findElement(By.name("password")).sendKeys(data1.get(0).get(1));
		driver.findElement(By.name("confirmPassword")).sendKeys(data1.get(0).get(2));
		
	}*/
	
	@Then("^user enters user information \"(.*)\",\"(.*)\",\"(.*)\"$")
	public void userInfo(String UN, String PSWD, String CONPSWD)
	{
		driver.findElement(By.name("email")).sendKeys(UN);
		driver.findElement(By.name("password")).sendKeys(PSWD);
		driver.findElement(By.name("confirmPassword")).sendKeys(CONPSWD);
		
	}

	@Then("^user click on Submit button$")
	public void user_click_on_Submit_button() {
	   driver.findElement(By.name("register")).click();
	   System.out.println("register done");
	}
	@And("^verify the successful registration message$")
	public void verifyRegistration()
	{
		String Actualmessage = driver.findElement(By.xpath("//a[text()=' sign-in ']//ancestor::font")).getText();
		//System.out.println(Actualmessage);
		Assert.assertTrue(Actualmessage.contains("Thank you for registering"), "Not successfully registered");
	}
	@And("^close the browser$")
	public void closeall()
	{
		driver.quit();
	}



}
