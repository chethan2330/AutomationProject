package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnClick {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@value='Vote']")).click();
	//driver.findElement(By.xpath("input[@value='Vote']")).submit();
}
}
