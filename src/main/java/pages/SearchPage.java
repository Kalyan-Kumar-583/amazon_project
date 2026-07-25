package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.DriverSetup;
import utils.WaitUtils;

public class SearchPage{
	
	private WebDriver driver;
	public WaitUtils wait;
	
	private final By searchTab = By.id("twotabsearchtextbox");
	private final By searchEnter = By.id("nav-search-submit-button");
	
	
	public SearchPage(WebDriver driver) {
		this.driver = driver;
		wait = new WaitUtils(driver,10);
	}

	public void SearchItem(String Product) {
		wait.waitForVisibility(searchEnter);
		driver.findElement(searchTab).sendKeys(Product);
		driver.findElement(searchEnter).sendKeys(Keys.RETURN);
	}
	
	public String getSearchPageTitle(WebDriver driver) {
		return driver.getTitle();
	}
	
	

}
