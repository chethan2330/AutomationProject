package xpaths;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUsingIndependentAndDependent2 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//span[@ class='b3wTlE']")).click();
	driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("iphone");
	driver.findElement(By.xpath("//button[@ type='submit']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//div[text()='Apple iPhone 16 (Black, 128 GB)']/../..//div[text()='Bank Offer']")).click();
	 
	Set<String> allwind = driver.getWindowHandles();
	for(String id:allwind) {
		driver.switchTo().window(id);
		String url = driver.getCurrentUrl();
		if(url.contains("https://www.flipkart.com/apple-iphone-16-black-")){
			String text = driver.findElement(By.xpath("(//h1[contains(text(),'APPLE iPhone 16')]/../../../../../../../../../../../..//div[contains(text(),'₹69,')])[1]")).getText();
			System.out.println("price of the phone is "+text);
		}
	}
	
	
}
}
