package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoRegister {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.linkText("Register")).click();
	driver.findElement(By.id("gender-male")).click();
	driver.findElement(By.id("FirstName")).sendKeys("chethan");
	driver.findElement(By.id("LastName")).sendKeys("s");
	driver.findElement(By.id("Email")).sendKeys("chethans@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("chethanS@2003");
	driver.findElement(By.id("ConfirmPassword")).sendKeys("chethanS@2003");
	driver.findElement(By.id("register-button")).click();
	
}
}
