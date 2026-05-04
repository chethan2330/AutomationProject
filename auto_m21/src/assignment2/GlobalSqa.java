package assignment2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GlobalSqa {
public static void main(String[] args) throws IOException, InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.globalsqa.com/");
	
	
	WebElement hub = driver.findElement(By.xpath("(//a[text()='Tester’s Hub'])[1]"));
	Actions act=new Actions(driver);
	act.moveToElement(hub).perform();
	
	WebElement testingSite = driver.findElement(By.xpath("//span[text()='Demo Testing Site']"));
	act.moveToElement(testingSite).perform();
	
	WebElement dragNDrop = driver.findElement(By.xpath("//span[text()='Drag And Drop']"));
	act.click(dragNDrop).perform();
	
	WebElement ifr = driver.findElement(By.xpath("(//iframe[@class='demo-frame'])[1]"));
	driver.switchTo().frame(ifr);

	WebElement img = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
	WebElement trash = driver.findElement(By.id("trash"));
	act.dragAndDrop(img, trash).perform();
	driver.switchTo().defaultContent();
	
	
	driver.findElement(By.xpath("(//a[text()='CheatSheets'])[1]")).click();
	WebElement ifr2 = driver.findElement(By.xpath("(//iframe[contains(@sandbox,'allow-forms allow-popups allow-popups-to-')])[6]"));
	driver.switchTo().frame(ifr2);
	driver.findElement(By.xpath("//div[text()='Close']")).click();
	driver.switchTo().defaultContent();
	
	driver.findElement(By.xpath("(//a[text()='CheatSheets'])[1]")).click();
	driver.findElement(By.xpath("//a[text()='SQL Cheat Sheet']")).click();
	
	Set<String> allids = driver.getWindowHandles();
	for(String id:allids) {
	driver.switchTo().window(id);
	String url = driver.getCurrentUrl();
	if(url.equals("https://www.globalsqa.com/sql-cheat-sheet/")) {
	WebElement scrollImg = driver.findElement(By.xpath("(//img[contains(@src,'https://i0.wp.com/www.globalsqa.com/wp-content/uploads')])[3]"));
	act.scrollToElement(scrollImg).perform();
	
	String timestamp = LocalDateTime.now().toString().replace(":","-");
	TakesScreenshot ts=(TakesScreenshot)driver;
	File temp = ts.getScreenshotAs(OutputType.FILE);
	File per = new File("./Screenshots/"+timestamp+".png");
	org.openqa.selenium.io.FileHandler.copy(temp, per);
	}
	}
	driver.quit();
	
}
}
