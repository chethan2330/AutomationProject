package webdrivermethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSwitchToUsingBreak {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.shoppersstack.com/products_page/52");
	Thread.sleep(15000);
	
	driver.findElement(By.id("compare")).click();
	Set<String> allWind = driver.getWindowHandles();
	for(String id:allWind) {
		driver.switchTo().window(id);
		String url = driver.getCurrentUrl();
		if(url.equals("https://www.amazon.in/"))
			break;
	}
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.manage().window().minimize();
	Thread.sleep(2000);
	driver.manage().window().fullscreen();
	Thread.sleep(2000);
	driver.close();
	
}
}
