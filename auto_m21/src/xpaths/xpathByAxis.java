package xpaths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathByAxis {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://blazedemo.com/");
	
	driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
	WebElement text = driver.findElement(By.xpath("(//td[text()='Virgin America'])[1]/following-sibling::td[3]"));
	
	System.out.println(text.getText());
	driver.findElement(By.xpath("(//td[text()='Virgin America'])[1]/preceding-sibling::td[2]")).click();
	driver.quit();
}
}
