package assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Execution2 {


public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://blazedemo.com/");
	
	WebElement depar = driver.findElement(By.xpath("//select[@name='fromPort']"));
	Select s=new Select(depar);
	s.selectByVisibleText("Portland");
	
	WebElement desti = driver.findElement(By.xpath("//select[@name='toPort']"));
	Select s1=new Select(desti);
	s1.selectByVisibleText("New York");
	
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	driver.findElement(By.xpath("//td[text()='Aer Lingus']/preceding-sibling::td[2]")).click();
	
	
	driver.findElement(By.id("inputName")).sendKeys("chethan");
	driver.findElement(By.id("address")).sendKeys("bangalore");
	driver.findElement(By.id("city")).sendKeys("bangalore");
	driver.findElement(By.id("state")).sendKeys("karnataka");
	driver.findElement(By.id("zipCode")).sendKeys("560105");
	
	 WebElement card = driver.findElement(By.id("cardType"));
	Select s2=new Select(card);
	s2.selectByVisibleText("American Express");
	
	driver.findElement(By.id("creditCardNumber")).sendKeys("56489795254525");
	driver.findElement(By.id("creditCardMonth")).sendKeys("4");
	driver.findElement(By.id("creditCardYear")).sendKeys("2028");
	driver.findElement(By.id("nameOnCard")).sendKeys("chethan");
	
	driver.findElement(By.id("rememberMe")).click();
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	
    TakesScreenshot ts=(TakesScreenshot)driver;
    File temp = ts.getScreenshotAs(OutputType.FILE);
    
    File per = new File("./Screenshots/Blaze.png");
    org.openqa.selenium.io.FileHandler.copy(temp, per);
	
	
	
}
}
