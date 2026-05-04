package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathFlipcart {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//span[@ class='b3wTlE']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("iphone 17");
	driver.findElement(By.xpath("//button[@ type='submit']")).click();
	
	List<WebElement> product_name = driver.findElements(By.xpath("//div[@class='RG5Slk']"));
	List<WebElement> product_price = driver.findElements(By.xpath("//div[@class='hZ3P6w DeU9vF']"));
	
	for(int i=1;i<product_name.size();i++) {
		String name = product_name.get(i).getText();
		String price = product_price.get(i).getText();
		System.out.println("product name is "+name+" ,and its price is "+price);
	}
	
	System.out.println("total products are "+product_name.size());
	
	//driver.quit();
	}
}
