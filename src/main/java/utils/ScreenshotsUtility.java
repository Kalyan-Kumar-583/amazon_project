package utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotsUtility {

	public static void takeScreenshot(WebDriver driver, String testName) {
		//timestamp
		
		//temp screenshot 
		//dest path
		//creating file location
		//copy temp to dest
		String timestamp = new SimpleDateFormat("yyyyMMdd_hhmmss").format(new Date());
		//System.out.println(timestamp);
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir")+"/screenshots/"+testName+"_"+timestamp+".png";
		File dest = new File(path);
		try {
			FileUtils.copyFile(src, dest);
			System.out.println("Screenshot saved at : "+path);
		}catch(IOException e) {
			System.out.println("Screenshot capture failed!");
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		
	}

}
