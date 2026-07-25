package listeners;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import base.DriverSetup;
import utils.ScreenshotsUtility;

public class TestListener implements ITestListener{
	
	@Override
	public void onTestSuccess(ITestResult result) {
		if (result.getStatus() == ITestResult.SUCCESS)
		System.out.println(result.getName()+" Passed");
		
	}
	@Override
	public void onTestFailure(ITestResult result) {
		WebDriver driver;
		if(result.getStatus() == ITestResult.FAILURE)
		System.out.println(result.getName()+" Failed");
		
		driver = (((DriverSetup) result.getInstance()).getWebDriver());
		ScreenshotsUtility.takeScreenshot(driver,result.getName());
		
		
	}


}
