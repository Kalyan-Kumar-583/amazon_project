package tests;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrokenLinks {
	
	@Test
	public void BrokenLinks() throws Exception {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	List<WebElement> links = driver.findElements(By.tagName("a"));
	System.out.println("links size : "+links.size());
	for(WebElement link : links) {
		String url = link.getAttribute("href");
		if(url == null || url.isEmpty()) {
			continue;
		}
		HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
		connection.setRequestMethod("HEAD");
		connection.connect();
		int code = connection.getResponseCode();
		
		if(code >= 400) 
		System.out.println("StatusCode : "+code+" Broken URL : "+url);
		else
			System.out.println("StatusCode : "+code+" Valid URL : "+url);
		
		connection.disconnect();
	}
	
	driver.quit();
	
	}

}
