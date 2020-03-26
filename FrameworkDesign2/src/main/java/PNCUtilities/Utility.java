package PNCUtilities;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import PNCBase.TestBase;

public class Utility extends TestBase{

	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 20;
	static int i =2;
	
	public static String captureScreenshot() throws IOException
	{
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		File src= screenshot.getScreenshotAs(OutputType.FILE);
		String destPath = System.getProperty("user.dir")+"//FailuresScreenshots//Failure "+ i +".png";
		FileUtils.copyFile(src, new File(destPath));
		i++;
		return destPath;
	}
}
