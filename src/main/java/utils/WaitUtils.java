package utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.SearchPage;

public class WaitUtils {
	
	private WebDriverWait wait;
	private WebDriver driver;
	
	public WaitUtils(WebDriver driver, int timeOut) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
	}

	public WebElement waitForVisibility(By locator) {
		
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public WebElement waitForClickable(By locator) {
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
		
	}
	
	public WebElement waitForPresence(By locator) {
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
}
