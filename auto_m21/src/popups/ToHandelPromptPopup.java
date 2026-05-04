package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandelPromptPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/alert?sublist=0");
		driver.findElement(By.xpath("//a[text()='Prompt']")).click();
		
		driver.findElement(By.xpath("//td[text()='Levis Shirt']/preceding-sibling::td[1]")).click();
		driver.findElement(By.id("deleteButton")).click();
		driver.switchTo().alert().sendKeys("data");
		
}
}