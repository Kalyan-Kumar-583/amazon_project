package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverSetup {
	protected WebDriver driver;
	
	public void initializeDriver(String browser) {
	
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		else {
			throw new RuntimeException("Invalid browser");
		}
		driver.manage().window().maximize();
		
	}
	
	public WebDriver getWebDriver() {
		return driver;
	}
	
	public void quitDriver() {
		driver.quit();
	}
	

}
