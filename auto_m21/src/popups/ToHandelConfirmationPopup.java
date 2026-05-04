package popups;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandelConfirmationPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/alert?sublist=0");
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//td[text()='Levis Shirt']/preceding-sibling::td[1]")).click();
//		driver.findElement(By.xpath("//td[text()='SAMSUNG Galaxy']/preceding-sibling::td[1]")).click();
		
		List<WebElement> check = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(WebElement ch:check) {
			ch.click();
		}
		driver.findElement(By.id("deleteButton")).click();
		
		
		driver.switchTo().alert().dismiss();
}
}