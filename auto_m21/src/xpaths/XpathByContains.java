package xpaths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContains {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	 
	Thread.sleep(10000);
	driver.findElement(By.xpath("//span[@ class='b3wTlE']")).click();
    driver.findElement(By.xpath("(//input[contains(@title,'Search ')])[1]")).sendKeys("mobiles");
    driver.findElement(By.xpath("(//button[contains(@aria-label,'Search for')])[1]")).click();
    
    Thread.sleep(10000);
    driver.navigate().to("https://demowebshop.tricentis.com/");
     
   
    String text = driver.findElement(By.xpath("//div[contains(text(),' All rights reserved')]")).getText();
    System.out.println(text);
}
}
