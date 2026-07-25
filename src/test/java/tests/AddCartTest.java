package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.DriverSetup;
import utils.WaitUtils;
import pages.ProductSelectionPage;
import pages.SearchPage;

public class AddCartTest extends DriverSetup{
	
	//declaring the variables
	//WebDriver driver;
	
	//declaring class objects
	//DriverSetup Dsetup;
	SearchPage searchPage; 
	ProductSelectionPage selectProduct;
	
	
	//Driver setup before test
	@Parameters("browser")
	@BeforeClass
	public void setUp(String browser) {
		initializeDriver(browser);
		driver.get("https://www.amazon.in/");
//		
	}
	
	//searching for item
	@Test(priority = 1)
	public void seachItem() {
		searchPage = new SearchPage(driver);
		searchPage.SearchItem("Redmi");
		System.out.println("Searched for product successfully");
		
	}
	
	@Test(priority=2)
	public void selectItem() throws Exception {
		selectProduct = new ProductSelectionPage(driver);
		selectProduct.selectAndAddToCart();
		System.out.println();
		
	}
	
	@AfterClass
	public void tearDown() {
		quitDriver();
	}
 
}
