package windowmethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetSize {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	
	org.openqa.selenium.Dimension size=driver.manage().window().getSize();
	System.out.println(size);
	System.out.println("Height "+size.getHeight());
	System.out.println("width "+size.getWidth());
	  
	driver.quit();

	
}
}
