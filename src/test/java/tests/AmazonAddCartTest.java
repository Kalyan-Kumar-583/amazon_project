package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.DriverSetup;
import pages.AmazonHomePage;
import pages.AmazonSearchResultsPage;
import pages.ProductSelectionPage;
import pages.SearchPage;

public class AmazonAddCartTest extends DriverSetup {
	
	//using page classes
	AmazonHomePage amazonHomePage;
	AmazonSearchResultsPage amazonSearchResultsPage;
	
	//Driver setup before test
	@Parameters("browser")
	@BeforeClass
	public void SetUp(String browser) {
		initializeDriver(browser);
		driver.get("https://www.amazon.in/");		
	}
	
	@Test(priority=1)
	public void searchForProduct() {
		amazonHomePage = new AmazonHomePage(driver);
		amazonHomePage.searchProduct("Laptop");
		
	}
	
	@Test(priority=2)
	public void addFilters() throws Exception {
		amazonSearchResultsPage = new AmazonSearchResultsPage(driver);
		amazonSearchResultsPage.filterBrand();
		amazonSearchResultsPage.filterPriceRange();
		amazonSearchResultsPage.priceRangeValidation();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@AfterClass
	public void tearDown() {
		quitDriver();
	}

}
