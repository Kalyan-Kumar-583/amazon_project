package tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseActions {
	
	public MouseActions() throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?&tag=googinhydmabk-21&ref=pd_sl_7fyhwvjvs1_e&adgrpid=159067177852&hvpone=&hvptwo=&hvadid=815388762685&hvpos=&hvnetw=g&hvrand=11655720034830177071&hvqmt=e&hvdev=m&hvdvcmdl=&hvlocint=&hvlocphy=9198210&hvtargid=kwd-316976913760&hydadcr=4300_2347395&mcid=06950fbffb333b33a87d1aa898130b50&hvocijid=11655720034830177071--&hvexpln=nav&gad_source=1");
//	 driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
//		driver.findElement(By.id("ap_email_login")).sendKeys("9640498048");
//		driver.findElement(By.id("continue")).click();
//		driver.findElement(By.id("ap_password")).sendKeys("Kalyan@583");
//		driver.findElement(By.id("signInSubmit")).click();
		
		
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
//		List<WebElement> element = driver.findElements(By.cssSelector("[data-csa-c-content-id=\"nav_cs_grocery\"]"));
//		WebElement element = driver.findElement(By.id("nav-your-amazon-text"));
		
//		List<WebElement> element = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("[data-csa-c-content-id=\"nav_cs_grocery\"]")));
		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].textContent");
//		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@id=\"nav-your-amazon-text\"]")));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		Thread.sleep(50000);
		String el = (String) js.executeScript("return document.querySelector('[href=\"/gp/bestsellers/?ref_=nav_cs_bestsellers\"]').innerText;");
		System.out.println(el);
//		
//		System.out.println("Text is : "+el.getText());
//		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[data-csa-c-content-id=\"nav_cs_grocery\"]")));
//		System.out.println(element.size());
//int count = 1;
//		for(WebElement el : element) {
////	 System.out.println(el.getAttribute("outerHTML"));
////	 		if(count == 2)
////			wait.until(ExpectedConditions.textToBePresentInElement(el,"Grocery & Gourmet Foods"));
//			String text = el.getAttribute("textContent");
////			String text = el.getText();
//			
////			for (int i = 0; i < text.length();i++) {
////				System.out.println(text.charAt(i));
////			}
//			System.out.println(text);
////			count++;
//		}
		
		
	
	
//		driver.quit();
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		MouseActions obj = new MouseActions();

	}

}
