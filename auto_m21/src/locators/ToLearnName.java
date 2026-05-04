package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnName {
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/");
	driver.findElement(By.name("email")).sendKeys("8431788794");
	driver.findElement(By.name("pass")).sendKeys("chethanS@2003");
	driver.findElement(By.id("Login")).click();
}
}
