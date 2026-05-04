package pom;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSeeStaleERE {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/alert?sublist=0");

		List<WebElement> check = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(WebElement ch:check) {
			ch.click();
		}
		
		driver.findElement(By.linkText("Prompt")).click();
		
		driver.navigate().to("https://demoapps.qspiders.com/ui/alert/prompt?sublist=1");
	
		List<WebElement> check2 = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(WebElement ch2:check2) {
			ch2.click();
		}
	driver.quit();
	}
	
}