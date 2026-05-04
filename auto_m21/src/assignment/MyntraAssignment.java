package assignment;



import java.io.File;

import java.io.IOException;

import java.time.Duration;



import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.io.FileHandler;



public class MyntraAssignment {

public static void main(String[] args) throws IOException, InterruptedException {

	 WebDriver driver=new ChromeDriver();

	 driver.manage().window().maximize();

	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	 driver.get("https://www.myntra.com/");

	 WebElement element = driver.findElement(By.xpath("//a[text()=' Contact Us ']"));

	 JavascriptExecutor js= (JavascriptExecutor)driver;

	 js.executeScript("arguments[0].scrollIntoView(false)",element);

	 driver.findElement(By.xpath("//a[text()=' Contact Us ']")).click();

	 driver.findElement(By.xpath("//input[@autocomplete='new-password']")).sendKeys("987654321");

	 driver.findElement(By.xpath("//input[@type='checkbox']")).click();

	 driver.findElement(By.xpath("//div[contains (text(),'CONTINUE')]")).click();

	 TakesScreenshot ts=(TakesScreenshot)driver;

	 File temp = ts.getScreenshotAs(OutputType.FILE);
	 Thread.sleep(5000);

	 File perm=new File("./Screenshots/Myntra.png");

	 FileHandler.copy(temp, perm);

	 driver.navigate().back();

	 WebElement elem = driver.findElement(By.xpath("//a[text()=' Contact Us ']"));

	 JavascriptExecutor jas= (JavascriptExecutor)driver;

	 jas.executeScript("arguments[0].scrollIntoView(false)",elem);

	 String address = driver.findElement(By.xpath("//p[contains(text(),' Registered Office Address ')]/..")).getText();

	 //String address = driver.findElement(By.xpath("//p[contains(text(),' Registered Office Address ')]/..//div[contains(text(),'Buildings Alyssa, ')]")).getText();

	 System.out.println(address);



	 

} 

}