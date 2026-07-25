package tests;

import java.time.Duration;

import org.jboss.aerogear.security.otp.Totp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import utils.ConfigReader;

public class OTPAuthentication {

//	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	@Test
		public void OtpAuth() throws Exception{
		String username = System.getenv("git_username");
		String password = System.getenv("git_password");
		
		System.out.println("username : "+username);
		System.out.println("password : "+password);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/login");
		

		
		driver.findElement(By.id("login_field")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.name("commit")).click();
		
		Thread.sleep(5000);
		
		Totp totp = new Totp("5DTLWRNGYOEJPM43");
		String currentOTP = totp.now();
		
		WebElement otp = driver.findElement(By.id("app_totp"));
		
		otp.sendKeys(currentOTP);
		Thread.sleep(2000);
//		String value = 
//				driver.findElement(By.id("app_totp"));
//		System.out.println(otp.getAttribute("placeholder"));
		System.out.println("Executed 1");
//		WebElement submitButton = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
//		submitButton.submit();
		
//		driver.quit()		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type=\"submit\"]"))).click();
		
		Thread.sleep(5000);
		System.out.println("Executed 2");
		driver.quit();
		
//		ConfigReader configObj = new ConfigReader();
//		configObj.
	}

}
