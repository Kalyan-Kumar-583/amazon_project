package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import utils.WaitUtils;

public class AmazonHomePage {
	private WebDriver driver;
	private WaitUtils wait;
	
	//locators
	private final By searchBox = By.id("twotabsearchtextbox");
	private final By enterButton = By.id("nav-search-submit-button");
	
	//using driver reference from test class
	public AmazonHomePage(WebDriver driver) {
		this.driver = driver;
		wait = new WaitUtils(driver,10);		
	}
	
	public void enterSearchText(String text) {
		wait.waitForPresence(searchBox);
		driver.findElement(searchBox).sendKeys(text);
	}
	
	public void clickSearchButton() {
		driver.findElement(enterButton).sendKeys(Keys.RETURN);
	}
	
	public void searchProduct(String text) {
		enterSearchText(text);
		clickSearchButton();
	}

}
