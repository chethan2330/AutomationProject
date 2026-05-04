
package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnClickAndHold {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://yonobusiness.sbi.bank.in/yonobusinesslogin");
	
	driver.findElement(By.xpath("//span[contains(@class,'ng-tns-c')]")).click();
	driver.findElement(By.id("password")).sendKeys("chethan");
	WebElement ele = driver.findElement(By.xpath("(//img[@class='ng-star-inserted'])[1]"));
	Actions act=new Actions(driver);
	act.clickAndHold(ele).perform();
	
	//without using click and hold method
	//act.click(ele).pause(Duration.ofMinutes(20)).perform();
}
}
