package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnChildWindowPopups {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.shoppersstack.com/products_page/52");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@aria-label='Compare']")).click();
		Set<String> allWind = driver.getWindowHandles();
		for(String s:allWind) {
			driver.switchTo().window(s);
			driver.close();
		}
}
}