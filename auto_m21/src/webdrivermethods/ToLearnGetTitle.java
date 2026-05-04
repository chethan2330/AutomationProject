package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetTitle {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	
	String title = driver.getTitle();
	System.out.println(title);
	
	if(title.equals("Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!")) {
		System.out.println("welcome page is displayed");
	}
	else
		System.out.println("welcome page is not displayed");
		
}
}
