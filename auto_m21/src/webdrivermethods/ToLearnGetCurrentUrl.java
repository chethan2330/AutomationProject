package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetCurrentUrl {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	 String url = driver.getCurrentUrl();
	 System.out.println(url);
	 
	 //for verification
	 if(url.equals("https://www.flipkart.com/"))
		 System.out.println("welcome paage is displayed");
	 else
		 System.out.println("not is displayed");
}
}
