package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnScrollTo {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.cricbuzz.com/");
	
	WebElement ele = driver.findElement(By.xpath("//button[text()='More Matches']"));
	Actions act=new Actions(driver);
	//act.scrollToElement(ele).perform();
	
	Point loc = ele.getLocation();
	int x = loc.getX();
	int y = loc.getY();
	act.scrollByAmount(x, y).perform();
}
}
