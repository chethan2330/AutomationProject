package xpaths;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//span[@ class='b3wTlE']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("mobiles");
	driver.findElement(By.xpath("//button[@ type='submit']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//div[text()='Bank Offer'])[1]")).click();
	
	Set<String> allWind = driver.getWindowHandles();
	   for( String ids:allWind) {
		   driver.switchTo().window(ids);
		   String url = driver.getCurrentUrl();
		 
		   
		   if(url.contains("https://www.flipkart.com/poco-c85-5g-power-black-128-gb/p/itm1f62dee4df0ad?pid")) {
			   String te = driver.findElement(By.xpath("(//div[text()= '₹12,999'])[1]")).getText();
			   System.out.println(te);
		   }
	      
	   }
}
}
