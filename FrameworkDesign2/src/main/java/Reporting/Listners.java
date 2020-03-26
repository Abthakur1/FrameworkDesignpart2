package Reporting;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listners implements ITestListener {

	public void onTestStart(ITestResult result) {
	System.out.println("Test started"+result.getName());	
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test passed"+result.getName());
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test failed"+result.getName());
		
	}

	public void onTestSkipped(ITestResult result) {
	
		System.out.println("Test skipped"+result.getName());	
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		System.out.println("Test filed with percentatge"+result.getName());
	}

	public void onStart(ITestContext context) {
		
	}

	public void onFinish(ITestContext context) {
		
		
	}

}
