package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQspider {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	Thread.sleep(5000);
	driver.findElement(By.cssSelector("input[name='name']")).sendKeys("chethan");
	Thread.sleep(5000);
	driver.findElement(By.cssSelector("input[name='email']")).sendKeys("cherthans20032007@gmail.com");
	Thread.sleep(5000);
	driver.findElement(By.cssSelector("input[name='password']")).sendKeys("chethanS@2003");
	Thread.sleep(5000);
	driver.findElement(By.cssSelector("button[type='submit']")).click();
	Thread.sleep(5000);
}
}
