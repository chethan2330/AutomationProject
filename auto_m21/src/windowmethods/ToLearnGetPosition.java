package windowmethods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetPosition {
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	
	Point coordinate = driver.manage().window().getPosition();
	System.out.println(coordinate);
	System.out.println(coordinate.getX());
	System.out.println(coordinate.getY());
}

}
