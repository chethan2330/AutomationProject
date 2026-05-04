package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSubmit {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(10000);
	driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("mobiles");
	driver.findElement(By.xpath("//input[@type='submit']")).submit();
}
}
