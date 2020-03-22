package PNCBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase()
	{
		prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\PNCConfiguration\\Config.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			
			System.out.println("Exception found:"+e.getMessage());
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public static void initialization()
	{
		String browsername = prop.getProperty("Browser");
		if(browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\resources\\CommonDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else if(browsername.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\src\\main\\resources\\CommonDrivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("Url"));
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	

}
