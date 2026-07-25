package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.DriverSetup;
import utils.WaitUtils;

public class ProductSelectionPage{
	
	public WaitUtils wait;
	
	private WebDriver driver;
	
	public By resultMessage = By.xpath("//span[contains(@class,\"a-color-state\")]");
	protected By bestSeller = By.xpath("//span[contains(@aria-label,\"Best seller\")]");
//	protected By bestSellerParent = By.xpath("//div[contains(@class, \"puisg-row\")]");
	protected By bestSellerParent = By.xpath(".//ancestor::div[contains(@class,\"puisg-row\")]");
	protected By bestSellerProductName = By.xpath(".//h2//span");
	protected By prize = By.xpath(".//span[contains(@class,\"a-price-whole\")]");
	//protected By amazons = By.xpath("//span[contains(text(),\"Amazon's \")]");
	
	public ProductSelectionPage(WebDriver driver) {
		this.driver = driver;
		wait = new WaitUtils(driver, 5);
	}
	
	public void selectAndAddToCart() {
		filterAmazonsChoice();
		filterLowbudgetProduct();
		clickOnAddCart();
	}
	
	//pickup the top rated product
	//if rating is same == check for 
	
	private void clickOnAddCart() {
		// TODO Auto-generated method stub
		
	}

	private void filterLowbudgetProduct() {
		// TODO Auto-generated method stub
		
	}

	public void filterAmazonsChoice() {
		wait.waitForPresence(bestSeller);
		List<WebElement> bestSellerElement =  driver.findElements(bestSeller);
		for(WebElement individualElement : bestSellerElement) {
			WebElement parentElement= individualElement.findElement(bestSellerParent);
			String productName = parentElement.findElement(bestSellerProductName).getText(); 
			String productPrize = parentElement.findElement(prize).getText();
			System.out.println(productName);
			System.out.println("Selling prize: "+productPrize);
			
			
		}	
	}

}
