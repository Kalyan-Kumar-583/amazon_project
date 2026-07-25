package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.WaitUtils;

public class AmazonSearchResultsPage {
	private WebDriver driver;
	private WaitUtils wait;
	
	//brand
	private final By brandParent = By.id("brandsRefinements");
	private final By parentBrandHP = By.id("p_123/308445");
	private final By brandHPElement = By.xpath(".//span[contains(text(),\"HP\")]");
	private final By brandSpan = By.xpath("//span[contains(@class,\"a-size-base\")]");
	
	//price filter
	private final By priceFilter = By.xpath("//li[@id = \"p_36/dynamic-picker-2\"]//a");
	
	// //div[contains(@role,"listitem")]//span[contains(@class,"a-offscreen")]
	
	//checking if filter are added or not
	
	private final By resultParentPrice = By.xpath("//div[contains(@role,\"listitem\")]");
	private final By resultPrice = By.xpath(".//span[contains(@class,\"a-offscreen\")]");
	
	// //input[@name="low-price"]
	// //input[@name="high-price"]
	
	public AmazonSearchResultsPage(WebDriver driver) {
		this.driver = driver;
		wait = new WaitUtils(driver,100);
	}
	
	public void priceRangeValidation() {
		List<WebElement> priceElements = driver.findElements(resultParentPrice);
		for(WebElement individualPrice : priceElements) {
			System.out.println(individualPrice.findElement(resultPrice));
		}
	}
	public void filterBrand() throws Exception {
		WebElement brandParantElement = driver.findElement(parentBrandHP);
		brandParantElement.findElement(brandHPElement).click();
		
		
	}
	
	public void filterPriceRange() {
		wait.waitForPresence(priceFilter);
		driver.findElement(priceFilter).click();
		//priceRange.click();
		wait.waitForPresence(priceFilter);
		//return 
//		priceRangeValidation();
	}
	
	

}
