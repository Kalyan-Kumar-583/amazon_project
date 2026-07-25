package tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDynamicTable {
	
	//table[@role="list"]/descendant::tr
	
	public HandlingDynamicTable() {
		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("return document.readyState").equals("complete");
		
		driver.get("https://www.amazon.in/SOFTSPUN-Microfiber-Multi-Colour-Absorbent-Silverware/dp/B0CXM5DT52/?_encoding=UTF8&pd_rd_w=Fb69Z&content-id=amzn1.sym.3dfcdfa9-5b81-4b68-a3f1-b42adf3515e9&pf_rd_p=3dfcdfa9-5b81-4b68-a3f1-b42adf3515e9&pf_rd_r=AZG7RHBX9FC6D2C1BVK5&pd_rd_wg=EgErb&pd_rd_r=ea1e1b93-a61c-4d78-8e8e-8b7c5b43eab5&ref_=pd_hp_d_btf_cr_cartx&th=1");
		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("return document.readyState").equals("complete");
		
		driver.getTitle();
		List<WebElement> rows = driver.findElements(By.xpath("//table[@role='list']/descendant::tr"));
		List<WebElement> tdata = driver.findElements(By.xpath("//table[@role='list']/descendant::span"));
		for(WebElement tEl : tdata) {
			System.out.println(tEl.getText());
		}
		
		
		System.out.println("rows size : "+rows.size());
driver.findElement(By.xpath("//div[@id=\"poToggleButton\"]/child::a")).click();
		for(WebElement td : rows) {
			List<WebElement> data = td.findElements(By.tagName("td"));
			for(WebElement el : data)
//				System.out.print(el.getText()+" | ");
				System.out.print(el.findElement(By.tagName("span")).getText()+" | ");
			
			System.out.println();
		}
	
		driver.quit();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingDynamicTable tableObj = new HandlingDynamicTable();

	}

}
