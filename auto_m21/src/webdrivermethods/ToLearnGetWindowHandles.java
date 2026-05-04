package webdrivermethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetWindowHandles {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.shoppersstack.com/products_page/51");
	
	Thread.sleep(15000);
	driver.findElement(By.id("compare")).click();
	
	 Set<String> allwinIds = driver.getWindowHandles();
	 for(String id:allwinIds)
	System.out.println(id);
}
}

