package xpaths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbhiBus {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.abhibus.com/");
	Thread.sleep(20000);
	driver.findElement(By.xpath("//input[@placeholder='Leaving From']")).sendKeys("bangalore");
	Thread.sleep(15000);
	driver.findElement(By.xpath("//div[@class='text-sm text-grey col']")).sendKeys("hyderabad");
	driver.findElement(By.xpath("//div[@class='container date-panel ']")).sendKeys("sat");
}
}
