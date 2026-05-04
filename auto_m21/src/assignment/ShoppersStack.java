package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ShoppersStack {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.manage().window().maximize();
	driver.get("https://www.shoppersstack.com/products_page/52");
	Thread.sleep(20000);
	
	driver.findElement(By.id("compare")).click();
	
	driver.get("https://www.flipkart.com/");
                 String url = driver.getCurrentUrl();	
                 
                 if(url.equals("https://www.flipkart.com/"))
			       System.out.println("welcome paage is displayed");
		         else 
				   System.out.println("is not displayed");
			 
                 driver.get("https://www.amazon.in/");
				 Dimension size = driver.manage().window().getSize();
				 System.out.println("height  "+size.getHeight());
				 System.out.println("width  "+size.getWidth());
				 
				 driver.get("https://www.ebay.com/");
			driver.manage().window().setSize(new Dimension(800, 600));
			Thread.sleep(3000);
			
			driver.quit();

}
}
