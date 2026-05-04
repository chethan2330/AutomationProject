package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnMouseOver {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://homeloans.hdfc.bank.in/");
	
    //WebElement ele = driver.findElement(By.id("ec-link"));
	Actions act=new Actions(driver);
//	act.moveToElement(ele).perform();
	
	Point ele2 = driver.findElement(By.id("ec-link")).getLocation();
	int x = ele2.getX();
	int y = ele2.getY();
	act.moveByOffset(x, y).perform();
}
}