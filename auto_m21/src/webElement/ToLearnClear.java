package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnClear {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		Thread.sleep(5000);
		WebElement ele = driver.findElement(By.xpath("(//input[@value='admin'])[1]"));
		ele.clear();
		ele.sendKeys("chethan");
		
		WebElement pass = driver.findElement(By.id("id=\"password\""));
		Thread.sleep(5000);
		pass.clear();
		pass.sendKeys("password");
	}		
}
