package tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DivAlert {
	
	public DivAlert() throws Exception {
		WebDriver driver = new ChromeDriver();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("return document.readyState").equals("complete");
		
//		driver.get("https://unifiedportal-mem.epfindia.gov.in/memberinterface/");
//		//handling element not clicable exception
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnCloseModal"))).click();
//		driver.findElement(By.id("btnCloseModal")).click();
//
		
		//waiting until all the suggested are visible
		driver.get("https://www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellers");
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("IPHONE");
//		List<WebElement> suggest = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".s-suggestion")));
//		System.out.println("Size : "+suggest.size());
//		
//		for(WebElement el : suggest) {
//			System.out.println(el.getText());
//		}
//		.a-size-mini.s-line-clamp-1
		
//		extracting the visible text from paranet element
//		driver.get("https://www.amazon.in/s?k=iphone+17+pro+max+256gb&crid=1MIYV2OLJA8VV&sprefix=IPHONE%2Caps%2C338&ref=nb_sb_ss_mvt-t11-ranker_2_6");
//		
//		List<WebElement> list = driver.findElements(By.cssSelector(".a-row.a-color-secondary"));
//		
//		for(WebElement el : list) {
//			System.out.println(el.getText());
//		}
		WebElement amazonLogo = driver.findElement(By.xpath("//a[@href=\"/ref=footer_logo\"]"));
		amazonLogo.click();
		JavascriptExecutor javas = (JavascriptExecutor) driver;
//		javas.executeScript("arguments[0].scrollIntoView(true)", amazonLogo);

		javas.executeScript("return document.querySelector(\"a\")");
		
		Thread.sleep(5000);
		driver.close();
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DivAlert obj = new DivAlert();
	}

}
