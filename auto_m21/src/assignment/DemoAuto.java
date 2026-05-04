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
import org.openqa.selenium.io.FileHandler;

public class DemoAuto {
public static void main(String[] args) throws IOException, InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://demo.automationtesting.in/Frames.html");
	
	WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
	driver.switchTo().frame(frame1);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Automation");
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	File temp = ts.getScreenshotAs(OutputType.FILE);
	File per = new File("./Screenshots/iframe1.png");
	FileHandler.copy(temp, per);
	
	driver.switchTo().defaultContent();
	
	driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
	Thread.sleep(2000);
	WebElement frame2 = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
	driver.switchTo().frame(frame2);
    WebElement frame3 = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
    driver.switchTo().frame(frame3);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Selenium");
	File temp2 = ts.getScreenshotAs(OutputType.FILE);
	File per2 = new File("./Screenshots/iframe2.png");
	FileHandler.copy(temp2, per2);
	
}
}
