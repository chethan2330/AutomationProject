package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.redbus.com/");
	
	   String sourcecode = driver.getPageSource();
	   System.out.println(sourcecode);
	   
	   String title = driver.getTitle();   
	   System.out.println(title);
	   
	   if(title.equals("Book Bus Tickets Online with redBus!"))
		   System.out.println("welcome page is displayed");
	   else
		   System.out.println("welcome page is not displayed");
	   
	   driver.manage().window().maximize();
	   Thread.sleep(2000);
	   
	   driver.manage().window().minimize();
	   Thread.sleep(2000);
	   
	   driver.manage().window().maximize();
	   
	   driver.quit();
	   
	   
}
}
