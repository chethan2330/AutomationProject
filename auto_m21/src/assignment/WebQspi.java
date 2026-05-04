package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebQspi {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(10000);
	driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("computer");
	driver.findElement(By.xpath("//input[@value='Search']")).click();
	driver.navigate().to("https://demoapps.qspiders.com/");
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("(//main[@data-aos='zoom-in'])[1]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//section[text()='X Path']")).click();
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//section[text()='Login 1.0']")).click();
	driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("chethan");
	driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("chethanS");
	driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	driver.findElement(By.xpath("//input[@type='radio']")).click();
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//section[text()='Login 2.0']")).click();
	driver.findElement(By.xpath("//input[@placeholder='Username:']")).sendKeys("chethan");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("chethanS");
	driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	driver.findElement(By.xpath("//input[@type='radio']")).click();
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//section[text()='Login 3.0']")).click();
	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("chethan");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("chethanS");
	driver.findElement(By.xpath("//button[text()='Login']")).click();
	Thread.sleep(5000);
	
	driver.quit();
}
}
