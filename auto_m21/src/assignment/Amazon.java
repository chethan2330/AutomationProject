package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	Thread.sleep(15000);
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles");
	driver.findElement(By.id("nav-search-submit-button")).click();
	List<WebElement> links = driver.findElements(By.tagName("img"));
	System.out.println(links.size());
		    driver.quit();
	
}
}
